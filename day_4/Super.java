package day_4;

class Parent
{
	String name ="parent class";
	
	Parent(){
		System.out.println("Parent Constructor");
	}
	
	void show() {
		System.out.println("parent method");
	}
}

class Child extends Parent
{
	String name ="child class";
	
	Child(){
		super();
		System.out.println("Child contructor");
	}
	
	void display() {
		super.show();
		System.out.println("Parent name :"+super.name);
	}
}
public class Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.display();
	}

}
