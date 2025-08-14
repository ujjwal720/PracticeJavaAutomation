package caiop;

public class jjjjj {

    public static void main(String[] args) {

        ew a=new yu();
        a.uy();

    }
}



class ew{

    public void uy(){

        System.out.println("hello world here");
    }

    public void re(){
        System.out.println("parent");
    }

    public static void t(){

        System.out.println("static method pa");
    }
}

class yu extends ew{

    public void uyz(){

        System.out.println("hello world here");
    }

    public void re(){
        System.out.println("child");
    }

    public static void t(){

        System.out.println("static method ca");
    }
}
