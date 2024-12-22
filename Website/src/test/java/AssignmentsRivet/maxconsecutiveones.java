package AssignmentsRivet;

public class maxconsecutiveones {

    public static void main(String[] args) {



        int[] x={1,0,1,1,0,1};
        int max=0;
        int count=0;

        for(int i=0;i<=x.length-1;i++){
           if(x[i]==1){

               count++;
               if(max<count){

                   max=count;
               }

           }

           else{

               count=0;
           }



        }

        System.out.println(max);
    }
}
