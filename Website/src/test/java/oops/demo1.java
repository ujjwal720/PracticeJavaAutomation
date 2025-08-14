package oops;

public class demo1 {

    public static void main(String[] args) {

   demo3 a=new demo3();


    }
}



class demo2{


    static{

        System.out.println("This is a sttaic bloack");
    }

    {

        System.out.println("this is an instance blaock");
    }


    int a;
    public demo2(int x){
        System.out.println("this is an paramaterizwed constructor");
        System.out.println(this.getClass());
    }


}
class demo3 extends demo2{
    int a;
    public demo3(){

        super(1);
        this.a=15;
        super.a=20;
        System.out.println("hellos");
        System.out.println(this.getClass());
    }
}