package AssignmentsRivet;

public class coding43 {

    public static void main(String[] args) {

        /*
        Number of Strings That Appear as Substrings in Word
         */


        String[] a={"a","abc","bc","d"};
        String words ="abc";
        int count=0;


        for(int i=0;i<=a.length-1;i++){

         boolean k=   words.contains(a[i]);

         if(k==true){

             count++;
         }


        }

        System.out.println(count);






    }
}
