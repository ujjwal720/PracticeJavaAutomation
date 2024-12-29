package oopsconcept;

public class removetrailingzeroes {
    public static void main(String[] args) {

        String results="";
        String input="123";
        int index=0;

        for(int i=input.length()-1;i>=0;i--){

            if(input.charAt(i)!='0'){

                index=i;
                break;

            }

        }

        for(int i=0;i<=index;i++){

            results=results+input.charAt(i);
        }

        System.out.println(results);




    }
}
