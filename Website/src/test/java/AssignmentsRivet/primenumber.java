package AssignmentsRivet;

public class primenumber {

    public static void main(String[] args) {

        int ran=2;
        int ran2=30;

        for(int i=ran;i<=ran2;i++){

            int num=i;
            int flag=1;

            for(int j=2;j<=num-1;j++){

                if(num%j==0){

                    flag=0;
                    break;

                }
            }

            if(flag==0){


            }

            else{

                System.out.println(i);
            }
        }


    }
}
