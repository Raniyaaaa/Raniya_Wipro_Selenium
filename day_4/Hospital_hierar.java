package day_4;

class Hospitals
{
	void hospInfo(String name) {
		System.out.println("Welcome to "+name+" hospital !");
	}
}

class Doctor extends Hospitals
{
	void doctorInfo(String name , String spec) {
		System.out.println("Doctor Name: " + name);
        System.out.println("Specialization: " + spec);
	}
}

class Gynac extends Doctor
{
	void gynacDuty(String dutyTime) {
        System.out.println("Gynaecologist Duty Time: " + dutyTime);
    }
}

class Endo extends Doctor
{
	void endoDuty(String dutyTime) {
        System.out.println("Endocrinologist Duty Time: " + dutyTime);
    }
}

class Cardiac extends Doctor
{
	void cardiacDuty(String dutyTime) {
        System.out.println("Cardiologist Duty Time: " + dutyTime);
    }
}

class Operation extends Cardiac
{
	void surgerySchedule(String time) {
        System.out.println("Scheduled Operation Time: " + time);
    }
}

class OPD extends Cardiac
{
	void opdTime(String time) {
        System.out.println("OPD Time: " + time);
    }
}

class Nurse extends Hospitals
{
	void nurseInfo(String name, String shift) {
        System.out.println("Nurse Name: " + name);
        System.out.println("Shift: " + shift);
    }
}

class Accountant extends Hospitals
{
	void accountantInfo(String name) {
        System.out.println("Accountant: " + name);
    }
}

class Payments extends Accountant
{
	void paymentDetails(double amount) {
        System.out.println("Payment Amount: Rs." + amount);
    }
}

class Documentation extends Accountant
{
	void docStatus(String status) {
        System.out.println("Documentation Status: " + status);
    }
}


public class Hospital_hierar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("******Hospital Info******");
        Gynac g = new Gynac();
        g.hospInfo("CityCare");
        g.doctorInfo("Dr. Neha", "Gynaecologist");
        g.gynacDuty("9AM - 3PM");

        System.out.println("\n******Cardiology Operation******");
        Operation o = new Operation();
        o.hospInfo("CityCare");
        o.doctorInfo("Dr. Raj", "Cardiologist");
        o.cardiacDuty("10AM - 4PM");
        o.surgerySchedule("1PM");

        System.out.println("\n******OPD******");
        OPD opd = new OPD();
        opd.hospInfo("CityCare");
        opd.doctorInfo("Dr. Ajay", "Cardiologist");
        opd.opdTime("11AM - 2PM");

        System.out.println("\n******Nurse******");
        Nurse n = new Nurse();
        n.hospInfo("CityCare");
        n.nurseInfo("Sister Latha", "Morning");

        System.out.println("\n******Account Department******");
        Payments p = new Payments();
        p.hospInfo("CityCare");
        p.accountantInfo("Mr. Kiran");
        p.paymentDetails(3500.50);

        Documentation d = new Documentation();
        d.hospInfo("CityCare");
        d.accountantInfo("Mr. Kiran");
        d.docStatus("Completed");
	}

}
