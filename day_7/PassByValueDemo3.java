package day_7;

//3.	Write a Java program to pass primitive data types to a method and observe whether changes inside the method affect the original variables.

public class PassByValueDemo3 {
    static void modifyValues(int num, double decimal) {
        num += 10;
        decimal *= 2;
        System.out.println("Inside method: num = " + num + ", decimal = " + decimal);
    }

    public static void main(String[] args) {
        int x = 7;
        double y = 3.5;

        System.out.println("Before method call: x = " + x + ", y = " + y);
        modifyValues(x, y);
        System.out.println("After method call: x = " + x + ", y = " + y);
    }
}
//Output
//Before method call: x = 7, y = 3.5
//Inside method: num = 17, decimal = 7.0
//After method call: x = 7, y = 3.5

