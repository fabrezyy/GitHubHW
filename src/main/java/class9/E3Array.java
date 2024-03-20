package class9;

public class E3Array {
    public static void main(String[] args) {

        int [] numbers={10,25,45,66,85,100};
        // Calculate the sum
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum=sum+numbers[i];
        }
        System.out.println(sum/ numbers.length);
    }
}