package day_4;

class Hospital
{
	String name="ABC Hospital";
	String location ="PQR";
	
	void hospitalDetails() {
		System.out.println("Hospital: " + name);
        System.out.println("Location: " + location);
	}
}

class Patient extends Hospital
{
	String patientName ="Alex";
	int age = 23;
	
	void patientDetails() {
		System.out.println("Patient Name : " + patientName);
        System.out.println("Age          : " + age);
        hospitalDetails();
	}
}

public class TestHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient p = new Patient();
		p.patientDetails();
	}

}
