package class8;

public class E2Break {
    public static void main(String[] args) {

        int [] number={10,20,30,55,45,35,50,100};

        for(int num:number){
            if(num>50){
             continue;
            }
            System.out.println(num+10);
            System.out.println(num*10);
            System.out.println(num/10);
            System.out.println(num%10);
            System.out.println(num*20);
            System.out.println("****");
        }
    }
}
