package class9;

public class E5Array {
    public static void main(String[] args) {
        //print how many even numbers

        int [] numbers={10,25,45,66,85,100,26,89,56,33};
        int counter=0;

        for (int number : numbers) {

            if(number%2==0){
                counter++;
            }
        }
        System.out.println(counter);

    }
}
