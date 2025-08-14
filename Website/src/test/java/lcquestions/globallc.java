package lcquestions;

import java.util.Stack;

public class globallc {

    public static void main(String[] args) {

        /*
        clear digits
         */

        String op="cb34";
        Stack<Character> h=new Stack<>();
        String results="";

        for(int i=0;i<=op.length()-1;i++){

            if(Character.isDigit(op.charAt(i))){

                h.pop();
            }

            else{

                h.push(op.charAt(i));
            }


        }

        for(int i=0;i<=h.size()-1;i++){

            results=results+h.get(i);
        }

        System.out.println(results);


    }
}
