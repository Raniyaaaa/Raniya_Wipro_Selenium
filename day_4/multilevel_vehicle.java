package day_4;


class Vehicle
{
	void type(String type) {
        System.out.println("This is a "+type);
    }
}

class Four_wheeler extends Vehicle
{
	void wheels(int wheels) {
        System.out.println("It has "+wheels+" wheels");
    }
}

class Petrol_Four_wheeler extends Four_wheeler
{
	void fuelType(String fuel) {
        System.out.println("It runs on "+fuel);
    }
}

class FiveSeater_Petrol_Four_wheeler extends Petrol_Four_wheeler
{
	void seatingCapacity(int capacity) {
        System.out.println("It is a "+capacity+"-seater");
	}
}

class Baleno_FiveSeater_Petrol_Four_wheeler extends FiveSeater_Petrol_Four_wheeler
{
	void model(String model) {
        System.out.println("Model : "+model);
    }
}

public class multilevel_vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Baleno_FiveSeater_Petrol_Four_wheeler car = new Baleno_FiveSeater_Petrol_Four_wheeler();
		car.model("Baleno");
		car.type("car");
		car.wheels(4);
		car.fuelType("petrol");
		car.seatingCapacity(5);
	}

}
