package CodingProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortedorrotated {

    public static void main(String[] args) {

        /*
        sorted or rotated
        {1,2,3,4,5};
         */
/*
        int[] nums={1,2,3,4,5};
        List<Integer> po=new ArrayList<Integer>();
        int count7=0;
        for(int i=0;i<=nums.length-1;i++){

            po.add(nums[i]);
        }

        Collections.sort(po);
        int index=0;
        for(int i=0;i<=po.size()-1;i++){
            if(nums[0]==po.get(i)){
                index=i;
                break;

            }
        }

        if(index>nums.length){
            index = index % nums.length;
        }

        int temp[]=new int[nums.length];
        int count=0;

        for(int i=index;i<=nums.length-1;i++){

            temp[count]=po.get(i);
            count++;
        }

        for(int i=0;i<=index-1;i++){
            temp[count]=po.get(i);
            count++;

        }


        for(int i=0;i<=temp.length-1;i++){

            if(temp[i]==nums[i]){

                count7++;

            }
        }


        if(nums.length==count7){

            System.out.println("Array sorted and rotatted");
        }
        else{

            System.out.println("Array not sorted or roated");
        }

        */

        int[] nums={1,2,3,4,5};
        int index=0;
        int flag=1;
        int flag1=3;
        int count=0;

        for(int i=0;i<=nums.length-1-1;i++){

            if(nums[i]<nums[i+1]){

                count++;

            }
            else{
                flag=2;
                index=i;
                break;
            }


        }

        for(int i=index;i<=nums.length-1-1;i++){

            if(count==nums.length ){
                count++;
                break;
            }
            if(nums[i]>nums[i+1] && i==index){

                count++;
            }

            else if(nums[i]<nums[i+1]){

                count++;
            }






        }


        if(count==nums.length){

            System.out.println("Array is rotated");
        }
        else{

            System.out.println("Array is not roatated");
        }













    }
}
