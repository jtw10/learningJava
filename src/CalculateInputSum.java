import java.util.Scanner;

public class CalculateInputSum {

    public static void main(String [] args) {

        Scanner keyboardInput = new Scanner(System.in);

//        get first number from user
        System.out.print("Enter a number: ");
        double num1 = keyboardInput.nextDouble();

//        get second number from user
        System.out.print("Enter a number: ");
        double num2 = keyboardInput.nextDouble();

        System.out.println(num1 + num2);
    }
}
