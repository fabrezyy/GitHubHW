package class5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("What is your city?");
        String city=scan.nextLine();
        System.out.println("How is the whether in your city today?");
        double temperatureF=scan.nextDouble();
        double tempCelsius=(temperatureF - 32)*5.0/9.0;
        System.out.println("The temperature in the "+city+" is "+tempCelsius);
    }
}
