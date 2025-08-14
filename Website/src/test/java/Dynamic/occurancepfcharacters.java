package Dynamic;

public class occurancepfcharacters {

    public static void main(String[] args) {



        String s1 ="AaAaAaaA";
        char[] im= s1.toCharArray();
        int count=0;
        /*
        Number of changing keys
         */

        for(int i=0;i<=im.length-1-1;i++){

            if(Character.toString(s1.charAt(i)).equalsIgnoreCase(Character.toString(s1.charAt(i+1)))){

            }

            else{

                count++;
            }



        }

        System.out.println(count);


    }
}
