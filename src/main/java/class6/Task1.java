package class6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("What is your country?");
        String country=scanner.nextLine();

        switch(country){
            case "USA":
                System.out.println("We speak English");
                break;
            case "Spain":
                System.out.println("We speak Spanish");
                break;
            case "Russia":
                System.out.println("We speak Russian");
                break;
            case "Egypt":
                System.out.println("We speak Arabic");
                break;
            default:
                System.out.println("Country not supported");
        }
    }
}
