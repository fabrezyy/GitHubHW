package class8;

public class E1Break {
    public static void main(String[] args) {

        String [] names={"James","Iran","Matt","Ubaidur","Aladin","Ana","Silvia"};

        for(String n:names){

            if(n.equals("Ubaidur")){
                System.out.println(n+" is present");
                break;
            }
        }
    }
}
