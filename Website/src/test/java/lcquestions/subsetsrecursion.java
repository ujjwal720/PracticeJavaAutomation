package lcquestions;

public class subsetsrecursion {

    public static void main(String[] args) {



        String name="Ujjwal";
        for(int i=0;i<=name.length()-1;i++){


            for(int j=i+1;j<=name.length();j++){

                String resultant="";
                resultant=name.substring(i,j);
                System.out.println(resultant);


            }
        }







    }
}
