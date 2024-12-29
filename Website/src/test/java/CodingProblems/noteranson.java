package CodingProblems;

public class noteranson {

    public static void main(String[] args) {

        String ransom = "aa";
        String magazine = "ab";
        int sum=0;

      int[] y = new int[26];
        int[] z = new int[26];

        for (int i = 0; i <= ransom.length() - 1; i++) {

            int index = ransom.charAt(i) - 'a';
              int valv=y[index];
            y[index] =valv+1;


        }

        for (int i = 0; i <=magazine.length()-1; i++) {

            int index = magazine.charAt(i) - 'a';
            int valv=z[index];
            z[index] = valv+1;


        }

       for(int i=0;i<=y.length-1;i++){
         if(y[i]<=z[i] && y[i]!=0){

             sum=sum+y[i];
         }



       }

       if(sum==ransom.length()){

           System.out.println("We can make the ransom note by following this codntions");
       }
       else{

           System.out.println("We cannot form the ransom note by the following conditions mentioned");
       }


    }
}