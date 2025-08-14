package lcquestions;

public class lc2 {

    public static void main(String[] args) {

   String a="abcd";
   String d="pq";
   String results="";
   int count=1;

   if(a.length()==d.length()){

       for(int i=0;i<=a.length()-1;i++){


           results=results+a.charAt(i)+d.charAt(i);
       }
   }

   else if(a.length()>d.length()){

       for(int i=0;i<=a.length()-1;i++){

           if(i<=d.length()-1){

               results=results+a.charAt(i)+d.charAt(i);
           }
           else{

               results=results+a.charAt(i);
           }
       }
   }

   else if(a.length()<d.length()){

       for(int i=0;i<=d.length()-1;i++){

           if(i<=a.length()-1){

               results=results+a.charAt(i)+d.charAt(i);
           }
           else{

               results=results+d.charAt(i);
           }
       }
   }

        System.out.println(results);




    }
}
