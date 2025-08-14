package day_4;

class After_12th{
	void category() {
		System.out.println("Options after 12 th");
	}
}
class Engineering extends After_12th {
    void engineering() {
        System.out.println("You selected Engineering stream.");
    }
}

class IT extends Engineering {
    void branchIT() {
        System.out.println("Welcome to IT Branch.");
    }
}

class Mechanical extends Engineering {
    void branchMechanical() {
        System.out.println("Welcome to Mechanical Branch.");
    }
}

class CS extends Engineering {
    void branchCS() {
        System.out.println("Welcome to Computer Science Branch.");
    }
}

class Medical extends After_12th {
    void medical() {
        System.out.println("You selected Medical stream.");
    }
}

class MBBS extends Medical {
    void branchMBBS() {
        System.out.println("Welcome to MBBS.");
    }
}

class BDS extends Medical {
    void branchBDS() {
        System.out.println("Welcome to BDS.");
    }
}

class Other_Courses extends After_12th {
    void others() {
        System.out.println("You selected Other Courses.");
    }
}

class BBA extends Other_Courses {
    void courseBBA() {
        System.out.println("Welcome to BBA Course.");
    }
}

class BCA extends Other_Courses {
    void courseBCA() {
        System.out.println("Welcome to BCA Course.");
    }
}

public class course {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--- IT Branch ---");
        IT it = new IT();
        it.category();
        it.engineering();
        it.branchIT();

        System.out.println("\n--- Mechanical Branch ---");
        Mechanical mech = new Mechanical();
        mech.category();
        mech.engineering();
        mech.branchMechanical();

        System.out.println("\n--- CS Branch ---");
        CS cs = new CS();
        cs.category();
        cs.engineering();
        cs.branchCS();

        System.out.println("\n--- MBBS Branch ---");
        MBBS mbbs = new MBBS();
        mbbs.category();
        mbbs.medical();
        mbbs.branchMBBS();

        System.out.println("\n--- BDS Branch ---");
        BDS bds = new BDS();
        bds.category();
        bds.medical();
        bds.branchBDS();

        System.out.println("\n--- BBA Course ---");
        BBA bba = new BBA();
        bba.category();
        bba.others();
        bba.courseBBA();

        System.out.println("\n--- BCA Course ---");
        BCA bca = new BCA();
        bca.category();
        bca.others();
        bca.courseBCA();
    }
}
