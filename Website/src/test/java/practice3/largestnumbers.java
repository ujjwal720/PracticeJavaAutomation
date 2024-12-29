package practice3;

public class largestnumbers {

    public static void main(String[] args) {


        String s="i love coding";

     String[] io=  s.split(" ");

     String resultant="";


     for(int i=0;i<=io.length-1;i++){
         String p=io[i];

         for(int j=0;j<=p.length()-1;j++){

             if(j==0){


                 char t=Character.toUpperCase(p.charAt(j));
                 resultant=resultant+t;
             }

             else {

                 resultant=resultant+p.charAt(j);
             }
         }


         resultant=resultant+" ";
     }


        System.out.println(resultant);



    }
}
