package class5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("How old are you?");
        int age= scanner.nextInt();
        if(age>=18){
            System.out.println("You get a license");
        }else{
            System.out.println("You need to wait");
        }

    }
}
