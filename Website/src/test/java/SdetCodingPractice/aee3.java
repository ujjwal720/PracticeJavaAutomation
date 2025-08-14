package SdetCodingPractice;

public class aee3 {

    public static void main(String[] args) {

        String io="India is an good coutry";
        String[] words=io.split(" ");
        StringBuilder buil=new StringBuilder();
        String results="";

        for(int i=0;i<=words.length-1;i++){

            StringBuilder y=new StringBuilder(words[i]).reverse();
            results=results+y;
            results=results+" ";
        }

        results=results.trim();
        System.out.println(results);




    }
}
