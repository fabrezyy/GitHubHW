package class6;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your grade");

        char grade=scanner.next().charAt(0);

        switch(grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Bad");
                break;
            default:
                System.out.println("Invalid grade");

        }

    }
}
