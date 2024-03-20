package class5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("How much will you be loaning?");
        int loanAmount= scanner.nextInt();
        if(loanAmount<=200000){
            System.out.println("Approved");
        }else{
            System.out.println("Rejected");
        }
    }
}
