package SdetCodingPractice;

public class reverse {

    public static void main(String[] args) {

        String name="Ujjwal";
        /*
        reverse the string of the characters
         */
        int count=name.length()-1;
        String results="";
        for(int i=0;i<=name.length()-1;i++){

            results=results+name.charAt(count);
            count--;

        }
        System.out.println(results);


    }
}
