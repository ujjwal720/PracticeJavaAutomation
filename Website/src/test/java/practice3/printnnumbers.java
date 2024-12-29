package practice3;

public class printnnumbers {

    /*
    sing recursion
     */

    public static void main(String[] args) {
        printnnumbers a=new printnnumbers();
        a.nnumbers(1,10);


    }

    public void nnumbers(int x,int n){

        if(x>n){

            return;
        }

        System.out.println(x);
        x++;
        nnumbers(x,10);



    }
}
