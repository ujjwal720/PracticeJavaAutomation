package Dynamic;

public class fibseries {

    /*
    0 1 1 2 3 5 8 13 21
    fibonacci series
     */

    public static void main(String[] args) {

        int num1=0;
        int num2=1;
        System.out.println(num1);
        System.out.println(num2);


        for(int i=1;i<=5;i++){

            int num3=num1+num2;
            System.out.println(num3);
             num1=num2;
             num2= num3;

        }


    }
}
