package CodingProblems;

public class coding34 {

    public static void main(String[] args){
        /*
        move zeros to the end with 2 pointer
         */

        int[] a={1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        int start=0;
        int temp1=0;
        int temp2=0;
        for(int i=0;i<=a.length-1;i++){
            if(a[i]==0){

                start=i;
                break;}
        }
        for(int i=start+1;i<=a.length-1;i++){
            if(a[i]!=0){
                temp1=a[i];
                 temp2=0;

              a[start]=temp1;
              a[i]=0;

              start++;
            }}

    }
}
