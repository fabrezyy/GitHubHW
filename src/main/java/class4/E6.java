package class4;

public class E6 {
    public static void main(String[] args) {
        int age=19;
        int weight=111;
        if(age>18){
            System.out.println("You are old enough to donate blood");
            if(weight>=110){
                System.out.println("and you are healthy enough weight for it");
            }else{
                System.out.println("You are not allowed to donate");
            }
        }
    }
}
