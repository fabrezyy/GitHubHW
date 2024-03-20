package class5;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("What is your height?");
        double height= scanner.nextDouble();

        if(height<60.0){
            System.out.println("You are short");
        }else if(height>=60 && height <=72) {
            System.out.println("You are small");
        }else if(height>72){
            System.out.println("You are medium");
        }else if(height>72){
            System.out.println("You are tall");
        }else{
            System.out.println("Wrong height");
        }

        }




    }
