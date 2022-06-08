import java.util.Scanner;

public class App {
    
    static final Scanner inputScanner = new Scanner(System.in);
        
    private static String getString(String prompt) {
        System.out.println(prompt);
        String stringOne = inputScanner.nextLine();
        return stringOne;
    }
    
    private static double getDouble(String prompt) {
        System.out.println(prompt);
        double numOne = inputScanner.nextDouble();
        return numOne;
    }
    public static void main(String[] args) {
        
        double num1 = getDouble("enter first number");
        double num2 = getDouble("enter second numner"); 
        String result= String.format("you want to add %f and %f", num1, num2);
        System.out.println(result);

        Calculator calculator = new Calculator();
        double addNum = calculator.add(num1, num2);
        double subtractNum = calculator.subtract(num1, num2);
        double multiplyNum = calculator.multiply(num1, num2);
        double divideNum = calculator.divide(num1, num2);

        //Add subtract, multiply and divide methods to the Calculator class. Each method should take two double values and perform the correct mathematical calculation with them.
        //Next, add code to the main method to call each of the Calculator method with the two numbers that the user input. Print the results of each call.

        System.out.println("add " + addNum); 
        System.out.println("subtract " + subtractNum); 
        System.out.println("multiply " + multiplyNum); 
        System.out.println("divide " + divideNum); 

        String continue = getString("Do you wish to continue? ");

       
    }
    
}   