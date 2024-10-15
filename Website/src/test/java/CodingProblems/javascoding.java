package CodingProblems;

public class javascoding {

    public static void main(String[] args){
        /*
        find the extra element in the array
         */

        int[] x1={2,4,6,8,9,10,12};
        int[] x2={2,4,6,8,10,12};
        int n=7;

        for(int i=0;i<=n-1;i++){

            if(x1[i]!=x2[i]){

                System.out.println(x1[i]);
                System.out.println(i);
                break;


            }
        }

    }
}
