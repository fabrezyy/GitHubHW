package class3;

public class E14IfElse {
    public static void main(String[] args) {
        boolean isRaining=true; //false=only last line executes after curly bracket

        if(isRaining){
            System.out.println("Take the umbrella");
            System.out.println("Lets take the jacket as well");
        }
        System.out.println("Lets go shopping");
    }
}
