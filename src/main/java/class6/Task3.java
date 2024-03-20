package class6;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter first number");
        double num1= scanner.nextDouble();
        System.out.println("Please enter operator sign");
        char operator= scanner.next().charAt(0);
        System.out.println("Please enter second number");
        double num2= scanner.nextDouble();
        switch(operator){

            case'+':
                System.out.println("Result is "+(num1+num2));
                break;
            case'-':
                System.out.println("Result is "+(num1-num2));
                break;
            case'*':
                System.out.println("Result is "+(num1*num2));
                break;
            case'/':
                System.out.println("Result is "+(num1/num2));
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
