public class typeCasting02 {
    static void main(){
        /// Implicit typeCasting
        byte num1 = 111;
        System.out.println(num1);
        short newNum1= num1;
        System.out.println("The newNum1 is: " + newNum1);




        /// Explicit typeCasting
        // long value1 = 12345678999;
        // int value2 = (int)value1;
        // System.out.println(value2);

        char charValue = 'a';
        System.out.println("The characteer value is: " + (char)(charValue+2));



    }
}
