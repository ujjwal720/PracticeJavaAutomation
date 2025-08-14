package studentphonebook;

public class pract5 {

    public static void main(String[] args) {

        p1 a=new p1();
        a.msm();




    }
}



/*
inheritance in java
 */

class page{


    public static void msm(){

        System.out.println("This is an msm");
    }
}


class p1 extends page{

    public static void kl(){

        System.out.println("This is an kl ");
    }



}