package class5;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your birth Month");
        String month = scan.nextLine();
        switch (month) {
            case ("March"):
            case ("April"):
            case ("May"):
                System.out.println("You were born is season Spring");
                break;
            case ("June"):
            case ("July"):
            case ("August"):
                System.out.println("You were born is season Summer");
                break;
        }
    }
}
