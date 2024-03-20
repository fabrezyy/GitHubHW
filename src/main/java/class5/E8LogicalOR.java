package class5;

public class E8LogicalOR {
    public static void main(String[] args) {

        boolean flower=false;
        boolean chocolates=true;
        boolean giveCreditCard=false;
        boolean allMyMistake=true;

        if(flower || chocolates || giveCreditCard || allMyMistake){
            System.out.println("Wife is happy");
        }else{
            System.out.println("Wife is sad");
        }
    }
}
