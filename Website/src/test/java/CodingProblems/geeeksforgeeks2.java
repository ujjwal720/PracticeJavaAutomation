package CodingProblems;

public class geeeksforgeeks2 {
    public static void main(String[] args){

        String io="geeksforgeeks";


        for(int i=0;i<=io.length()-1;i++){
            int count=0;
            char im=io.charAt(i);
            for(int j=0;j<=io.length()-1;j++){
               if(im==io.charAt(j)){
                   count++;
                   if(count==2){
                       break;
                   }

               }

            }
            if(count==1){

                System.out.println("the first repeating word in the followin is"+" "+im);
                break;
            }
        }




    }
}
