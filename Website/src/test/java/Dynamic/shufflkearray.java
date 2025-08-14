package Dynamic;

public class shufflkearray {

    public static void main(String[] args) {

        int[] a = {2, 5, 1, 3, 4, 7};
        int nums1 = 3;
        int[] b = new int[nums1];
        int[] c = new int[nums1];
        int[] fin = new int[a.length];
        int count = 0;

        for (int i = 0; i <= a.length - 1; i++) {

            if (i <= nums1 - 1) {

                b[i] = a[i];

            } else {

                c[count] = a[i];
                count++;
            }

        }

        int count1=0;

        for(int i = 0; i<= nums1 -1; i++){

            fin[count1]=b[i];
            count1++;
            fin[count1]=c[i];
            count1++;


        }



    }

}
