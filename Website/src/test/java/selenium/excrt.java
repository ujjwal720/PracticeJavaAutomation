package selenium;



public class excrt {

    public static void main(String[] args) {


        excrt a=new excrt();
        a.addition(null);





    }




    public void addition(String z){



        try{
            if(z==null){

                throw new NullPointerException();
            }

            else{

                System.out.println("i will print the valie as it not null");
            }
        }

        catch(NullPointerException e){

            System.out.println("this should not be null or zero");
        }




    }
}
