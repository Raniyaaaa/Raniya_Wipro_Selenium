package day_7;

//1.	Check if character is a Digit
//2.	Compare two Strings
//3.	Convert using value of method
//4.	Create Boolean Wrapper usage
//5.	Convert null to wrapper classes


public class WrapperExamples {
    public static void main(String[] args) {
        
        char ch = '5';
        System.out.println(Character.isDigit(ch));

        
        String s1 = "Hello", s2 = "Hello";
        System.out.println(s1.equals(s2));

      
        int num = 42;
        String str = String.valueOf(num);
        System.out.println(str);

        
        Boolean bool = Boolean.valueOf("true");
        System.out.println(bool);

        
        Integer obj = null;
        System.out.println("Integer object: " + obj);
    }
}

//OUTPUT
//true
//true
//42
//true
//Integer object: null
