package SdetCodingPractice;

public class pr3 {

    public static void main(String[] args) {
        /*
        print unique values
        without map
         */

        int[] a={1,2,3,1,1,1,2,1,3,3};
        for(int i=0;i<=a.length-1;i++){

            if(a[i]!=-1) {

                int count = 0;

                for (int j = 0; j <= a.length - 1; j++) {

                    if (a[i] == a[j]) {

                        count++;

                        if (count > 1) {

                            a[j] = -1;
                        }
                    }

                }

            }

        }

        for(int i=0;i<=a.length-1;i++){
            if(a[i]!=-1){

                System.out.println(a[i]);
            }

        }
    }
}
