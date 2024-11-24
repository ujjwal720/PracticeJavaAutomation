package Practicesheet;

public class insertelemetinanarry {

    public static void main(String[] args){


        int[] x={1,2,3,4,5,0};
        int index=3;
        int value=-1;
        for(int i=x.length-1;i>index;i--){

            x[i]=x[i-1];

        }

        x[index]=value;


    }
}
