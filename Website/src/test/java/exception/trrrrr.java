package exception;

public class trrrrr {

    public static void main(String[] args) {
        trrrrr a=new trrrrr();
        a.name("Ujjwal",1);

    }

    public void name(String name,int count){

        if(count>5){

            return;
        }
        count++;
        System.out.println("Ujjwal");
        name("Ujjwal",count);




    }
}


