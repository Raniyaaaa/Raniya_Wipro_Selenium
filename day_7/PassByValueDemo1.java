package day_7;

//1.	Write a program where a method accepts an integer parameter and tries to change its value. Print the value before and after the method call.

public class PassByValueDemo1 {
    static void changeValue(int num) {
        num = 50;
        System.out.println("Inside method: num = " + num);
    }
    public static void main(String[] args) {
        int x = 10;
        System.out.println("Before method call: x = " + x);
        changeValue(x);
        System.out.println("After method call: x = " + x);
    }
}

//Before method call: x = 10
//Inside method: num = 50
//After method call: x = 10
