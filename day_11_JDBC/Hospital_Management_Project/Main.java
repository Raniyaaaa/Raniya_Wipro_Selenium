//17.	Create a Hospital Management System database. Using JDBC, implement:
//•	Register new patient
//•	Assign doctor
//•	Generate billing

package Hospital_Management_Project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("👤 Username: ");
        String username = sc.nextLine();
        System.out.print("🔒 Password: ");
        String password = sc.nextLine();

        if (!LoginService.login(username, password)) {
            System.out.println("❌ Login failed. Exiting...");
            return;
        }

        while (true) {
            System.out.println("\n🏥 Hospital Management Menu");
            System.out.println("1. Register Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Book Appointment");
            System.out.println("4. Generate Billing");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> PatientService.registerPatient(sc);
                case 2 -> PatientService.viewPatients();
                case 3 -> AppointmentService.bookAppointment(sc);
                case 4 -> BillingService.generateBill(sc);
                case 5 -> {
                    System.out.println("🔚 Goodbye!");
                    return;
                }
                default -> System.out.println("❓ Invalid option");
            }
        }
    }
}

//👤 Username: admin
//🔒 Password: admin123
//
//🏥 Hospital Management Menu
//1. Register Patient
//2. View Patients
//3. Book Appointment
//4. Generate Billing
//5. Exit
//Choose option: 2
//
//ID    Name                 Age   Gender     Phone           Address                       
//1     Raniya               23    Female     987654321       ABC villa, pqr                
//2     Riya                 18    Female     987654312       PQR villa, yui                
//
//🏥 Hospital Management Menu
//1. Register Patient
//2. View Patients
//3. Book Appointment
//4. Generate Billing
//5. Exit
//Choose option: 3
//Enter Patient ID: 1
//Enter Doctor ID: 1
//Enter Appointment Date (YYYY-MM-DD): 2025-08-11
//Reason: Headache
//✅ Appointment booked.
//
//🏥 Hospital Management Menu
//1. Register Patient
//2. View Patients
//3. Book Appointment
//4. Generate Billing
//5. Exit
//Choose option: 4
//Enter Appointment ID: 2
//Enter Patient ID: 1
//Enter Total Amount: 2000
//Enter Discharge Date (YYYY-MM-DD): 2025-08-10
//Enter Summary: Completed
//✅ Billing generated.
//
//🏥 Hospital Management Menu
//1. Register Patient
//2. View Patients
//3. Book Appointment
//4. Generate Billing
//5. Exit
//Choose option: 5
//🔚 Goodbye!