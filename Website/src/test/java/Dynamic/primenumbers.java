package Dynamic;

public class primenumbers {

    public static void main(String[] args) {



        for(int i=1;i<=100;i++){

            int num=i;
            int flag=0;
            for(int j=2;j<=num-1;j++){

              if(num%j==0){

                  flag=1;
                  break;
              }

            }

            if(flag==0){

                System.out.println(num);

            }




        }
    }
}
