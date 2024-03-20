package class6;

import java.util.Scanner;

public class E9Loops {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the starting number for the loop");
        int start=scanner.nextInt();
        System.out.println("Please enter the ending number");
        int end= scanner.nextInt();
        while(start<=end){
            System.out.println(start+" ");
            start++;
        }
    }
}
