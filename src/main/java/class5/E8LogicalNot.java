package class5;

public class E8LogicalNot {
    public static void main(String[] args) {

        boolean box=false;
        System.out.println(!box);

        String country="Iran";
        if(!country.equals("Iran")){
            System.out.println("You can visit USA");
        }else{
            System.out.println("Not allowed");
        }
    }
}
