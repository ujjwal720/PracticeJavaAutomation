package lcquestions;

public class circularsentence {

    public static void main(String[] args) {


        String words="eetcode";
        String[] k=  words.split(" ");
        String results="";
        char first=k[0].charAt(0);
      String rm=k[k.length-1];
     char second=rm.charAt(rm.length()-1);
     int flag=0;




     if(first==second && k.length>1){

         for(int i=0;i<=k.length-1-1;i++){

             String rme=k[i];
             char seconde=rme.charAt(rme.length()-1);
             String rme1=k[i+1];
             char secondes=rme1.charAt(0);
             if(seconde==secondes){

                 flag=1;


             }

             else{

                 flag=0;
                 break;
             }




         }




     }

     else{

         if(first==second){

             flag=1;


         }

         else{

             flag=0;


         }



     }

     if(flag==1){

         System.out.println("The sentence is circular");
     }

     else{

         System.out.println("The sentence not circular");
     }




    }
}
