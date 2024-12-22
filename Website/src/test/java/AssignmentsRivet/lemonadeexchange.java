package AssignmentsRivet;

public class lemonadeexchange {

    public static void main(String[] args) {
        int[] po={5,5,5,10,20};
        int sum=0;
        int count=0;
        for(int i=0;i<=po.length-1;i++){

            if(po[i]==5){

                sum=sum+5;
                count++;

            }


            else{

                int x=po[i];
                if(sum>x){

                    int q=po[i]-5;
                    sum=sum-q;
                    sum=sum+5;
                    count++;


                }


            }






        }
    }
}
