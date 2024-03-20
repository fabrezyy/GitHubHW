package class4;

public class E5 {
    public static void main(String[] args) {
        double mRate=4.3;
        double mPrice=120000;

        if(mRate>4.5){
            System.out.println("User will not buy a house");
        }else{
            if(mPrice>100000){
                System.out.println("User will take a loan");
            }else{
                System.out.println("User will pay cash");
            }
        }
    }
}
