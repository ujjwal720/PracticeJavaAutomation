package CodingProblems;

public class recursionmyname {

    public static void main(String[] args){

        /*
        remove white space form string
         */
        getname(5);



    }

    public static void getname(int count){

        if(count!=0){

            return;
        }
        count--;
        System.out.println("Ujjwal");
        getname(count);





    }
}
