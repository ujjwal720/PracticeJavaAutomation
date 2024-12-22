package CodingProblems;

public class rotatearray {

    public static void main(String[] args) {

/*
        int[] nums={1,2,3,4,5,6,7};
        int k=3;
        int[] nums1=new int[nums.length];
        int count=0;

        for(int i=k+1;i<=nums.length-1;i++){

            nums1[count]=nums[i];
            count++;
        }

        for(int i=0;i<=k;i++){

            nums1[count]=nums[i];
            count++;
        }

        nums=nums1;

        */

        int[] nums={1,2,3,4,5,6,7};
        /*
        0/0-{5,6,7,1,2,3,4}
        {7,6,5,4,3,2,1}
         */


        int k=3;

        int[] rev=new int[nums.length];
        int count=0;
        int count2=0;
        for(int i=nums.length-1;i>=0;i--){

            rev[count]=nums[i];
            count++;
        }

        int[] rotate=new int[nums.length];

       for(int i=k-1;i>=0;i--){

              rotate[count2]=rev[i];
              count2++;
       }

       for(int i=rotate.length-1;i>=k;i--){

           rotate[count2]=rev[i];
           count2++;


       }

       for(int i=0;i<=rotate.length-1;i++){

           nums[i]=rotate[i];

       }
















    }
}
