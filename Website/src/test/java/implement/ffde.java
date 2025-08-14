package implement;

public class ffde {

    public static void main(String[] args) {

      p a=new x();
      x vb=new x();

        System.out.println(a instanceof x);
        System.out.println(a instanceof p);
        System.out.println(vb instanceof x);


    }
}


class p{

    public void ms(){

        System.out.println("hello world");
    }

}


class x extends p{

    public void msd(){

        System.out.println("this is an exc");
    }

}