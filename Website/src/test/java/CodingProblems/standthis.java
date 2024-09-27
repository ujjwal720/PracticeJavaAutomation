package CodingProblems;

public class standthis {

    public static void main(String[] args){

        ol a=new ol();
        System.out.println(ol.z);
        ol.names();
        ol.names("khan");
        a.gl();

    }
}

class ol{

    int count=12;
    public static int z=20;

   public static void names(){

       System.out.println(z);

   }


   public static void names(String s){

       System.out.println("hi is am overridden");

   }

   public void gl(){

   }


}
/*
Execution flow this program is
At first the class is loaded in which the main method is there
which is stand this after the stand this main method will be executed
inside the main method the ol class will be loaded and all the sttaic vairable is assigned first
after the new ol() created and its refrence is also point after that the instance vairable is alos inilized



 */
