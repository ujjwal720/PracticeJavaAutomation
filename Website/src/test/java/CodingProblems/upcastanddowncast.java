package CodingProblems;

public class upcastanddowncast {

    public static void main(String[] args){

   // ch a=new ch();
   //a.m2();
 //  a.m1();
   Parent p=new ch();
  // p.bs();

   Parent d=new Parent();
   /*
   parent cannot be cast to child class
    */
   ch f=(ch)d;
   f.m1();










    }
}

class Parent{

    public void bs(){

        System.out.println("This is parent");
    }

    public void m1(){

        System.out.println("This is something form child class");
    }
}


class ch extends Parent{

    public void bs(){

        System.out.println("This is child");
    }



    public void m2(){

        System.out.println("This is child class");
    }


}