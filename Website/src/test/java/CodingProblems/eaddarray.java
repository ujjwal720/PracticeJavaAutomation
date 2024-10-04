package CodingProblems;

public class eaddarray {

    public static void main(String[] args) {

        int[] x = {1, 2, 3, 4, 5, 6};
    /*

    1,2,2,3,4,5
    shift lef right arrays
     */
        int index = 2;
        int value = -1;

        for (int i = x.length - 1; i > index; i--) {

            x[i]=x[i-1];

        }
        x[index]=value;

    }



}
