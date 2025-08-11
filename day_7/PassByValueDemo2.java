package day_7;

//2.	Create a method that takes two integer values and swaps them. Show that the original values remain unchanged after the method call.

public class PassByValueDemo2 {
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Inside method: a = " + a + ", b = " + b); }
    public static void main(String[] args) {
        int x = 5, y = 10;
        System.out.println("Before swap: x = " + x + ", y = " + y);
        swap(x, y);
        System.out.println("After swap: x = " + x + ", y = " + y);
    }
}

//Output:
//Before swap: x = 5, y = 10
//Inside method: a = 10, b = 5
//After swap: x = 5, y = 10
