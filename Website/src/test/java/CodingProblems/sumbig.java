package CodingProblems;

public class sumbig {

    public static void main(String[] args) {

        /*
        jewels and stones
         */

        String jewels="aA";
        String stones="aAAbbbb";
        int count=0;

        for(int i=0;i<=jewels.length()-1;i++){

            char y=jewels.charAt(i);

            for(int j=0;j<=stones.length()-1;j++){

                if(y==stones.charAt(j)){

                    count++;
                }


            }


        }

        System.out.println(count);






    }
}
