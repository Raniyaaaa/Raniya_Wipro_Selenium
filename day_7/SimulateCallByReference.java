package day_7;

//10.	Can you simulate call by reference in Java using a wrapper class or array? Justify with a program.

public class SimulateCallByReference {
    static void modify(int[] ref) {
        ref[0] = 999;
    }

    public static void main(String[] args) {
        int[] num = {5};
        System.out.println("Before: " + num[0]);

        modify(num);
        System.out.println("After: " + num[0]);
    }
}

//Before: 5
//After: 999
