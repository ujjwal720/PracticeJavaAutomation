package lcquestions;

public class faulty {

    public static void main(String[] args) {



        String key="poiinter";
        String results="";

        for(int i=0;i<=key.length()-1;i++){

            if(key.charAt(i)=='i' || key.charAt(i)=='I'){

                StringBuilder re=new StringBuilder(results);
                String words=re.reverse().toString();
                results="";
                results=results+words;


            }

            else{

                results=results+key.charAt(i);
            }
        }

        System.out.println(results);
    }
}
