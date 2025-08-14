package selenium;

public class cust {

    public static void main(String[] args) throws Exception {


        String jk="klmx";

        try {
            if (jk.equalsIgnoreCase("klm")) {

                System.out.println("ok");
            } else {

                throw new custrr("gellosss");
            }

        }
        catch(custrr kl){

            System.out.println(kl.getMessage());
        }
    }
}
