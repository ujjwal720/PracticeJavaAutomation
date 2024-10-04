package CodingProblems;

public class stpalindr {

    public static void main(String[] args){
        /*
        pqlindrome string
         */

            String s="sam";
            int count=s.length()-1;
            int count1=0;
            for(int i=0;i<=s.length()-1;i++){

                if(s.charAt(i)==s.charAt(count)){

                    count1++;
                }
                else{
                    break;
                }

                count--;
            }

            if(count1==s.length()){
                System.out.println("The following is palindrome");
            }
            else{
                System.out.println("The following is not palindrome");
            }

    }
}
