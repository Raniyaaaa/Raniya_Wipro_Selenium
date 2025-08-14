//2. Create procedure or functions for Hospital table
//     1. print avg patient count on daily basis
//     2. print all the patients whose belong to same ward
//     3. arrange the patients list according their admission date


package day_12;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HospitalProcedure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "root";

        try (Connection con = DriverManager.getConnection(url, user, password)) {


            CallableStatement cstAvg = con.prepareCall("{call avgPatientsCount()}");
            ResultSet rsAvg = cstAvg.executeQuery();
            if (rsAvg.next()) {
                int avg = rsAvg.getInt("Avg_Daily_count");
                System.out.println("Average count: " + avg + "\n");
            }

            CallableStatement cstWard = con.prepareCall("{call patientsInSameWard(?)}");
            cstWard.setInt(1, 101);
            ResultSet rsWard = cstWard.executeQuery();
            System.out.println("Patients in Ward 101:");
            System.out.println("ID\tName\tWard\tAdmission Date");
            while (rsWard.next()) {
                System.out.println(
                    rsWard.getInt("id") + "\t" +
                    rsWard.getString("name") + "\t" +
                    rsWard.getInt("ward") + "\t" +
                    rsWard.getDate("admission_date")
                );
            }

            CallableStatement cstSort = con.prepareCall("{call patientsByAdmissionDate()}");
            ResultSet rsSort = cstSort.executeQuery();
            System.out.println("\nPatients Sorted by Admission Date:");
            System.out.println("ID\tName\t\tWard\tAdmission Date");
            while (rsSort.next()) {
                System.out.println(
                    rsSort.getInt("id") + "\t" +
                    rsSort.getString("name") + "\t\t" +
                    rsSort.getInt("ward") + "\t" +
                    rsSort.getDate("admission_date")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
	}

}


//Average count: 2
//
//Patients in Ward 101:
//ID	Name	Ward	Admission Date
//1	Ravi	101	2025-07-01
//3	Kiran	101	2025-07-02
//
//Patients Sorted by Admission Date:
//ID	Name		Ward	Admission Date
//1	Ravi		101	2025-07-01
//2	Meera		102	2025-07-01
//3	Kiran		101	2025-07-02
//4	Anu		103	2025-07-02
