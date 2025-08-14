package Captol;

public class fdddd {

//////////consrtuctor
    public fdddd(){
        System.out.println("hello wordl in india");

    }

    public static void main(String[] args) {

        String g=null;

        fdddd a=new fdddd();



        try{

            System.out.println(g.length());

        }

        catch(Exception e){

            System.out.println("this is an erro");
        }

        finally {

            g="names";
            System.out.println("AT LAST");
            System.out.println(g.length());
        }






    }
}
