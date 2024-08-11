//Calculator in java.

import java.awt.*;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Toolkit.getDefaultToolkit().beep();

        System.out.println("            ------------------------------------------          ");
        System.out.println("            *************** Calculator ***************          ");
        System.out.println("            ------------------------------------------          ");

        Scanner sc = new Scanner(System.in);
        boolean KeepRunning = true;

        while (KeepRunning) {
            System.out.println("Enter the First Number : ");
            double First = sc.nextDouble();

            System.out.println("Enter the Second Number : ");
            double Second = sc.nextDouble();

            System.out.println("Enter the Operator : [ +, -, *, / ]");
            char ope = sc.next().charAt(0);

            double result;
            switch (ope) {
                case '+':
                    result = (First + Second);
                    System.out.println("Addition is : " + result);
                    break;

                case '-':
                    result = (First - Second);
                    System.out.println("Subtraction is : " + result);
                    break;

                case '*':
                    result = (First * Second);
                    System.out.println("Multiplication is : " + result);
                    break;

                case '/':
                    result = (First / Second);
                    System.out.println("Division is : " + result);
                    break;

                default:
                    System.out.println("Invalid Operator Please Try Again.....!");
                    continue;
            }

            System.out.println("You want to more calculation -> [Yes/No]");
            String Choice = sc.next();

            if (Choice.equalsIgnoreCase("no")) {
                KeepRunning = false;
            }
        }
        sc.close();
        System.out.println("Calculator Terminated.....!");
    }
}