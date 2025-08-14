package codingques;

public class palindrom {

    public static void main(String[] args) {

        /*
        roman to integer
         */

        String[] romanSymbols = {"I", "V", "X", "L", "C", "D", "M"};

        // Array of corresponding integer values
        int[] romanValues = {1, 5, 10, 50, 100, 500, 1000};
        int flag=0;



        String l="MDCXCV";
        int x=0;
        String res="";
        int sum=0;
        int p=0;
        String k="";
        for(int i=0;i<=l.length()-1;i++){
            k="";
            String r=Character.toString(l.charAt(i));
            if(i+1<=l.length()-1) {
                k = Character.toString(l.charAt(i)) + Character.toString(l.charAt(i + 1));
            }
            if(k.equals("IV")){

                p=4;
                sum=sum+p;
                i++;

            }

            else if(k.equals("IX")){

                p=9;
                sum=sum+p;
                i++;

            }

            else if(k.equals("XL")){

                p=40;
                sum=sum+p;
                i++;

            }

            else if(k.equals("XC")){

                p=90;
                sum=sum+p;
                i++;

            }

            else if(k.equals("CD")){

                p=400;
                sum=sum+p;
                i++;

            }

            else if(k.equals("CM")){

                p=900;
                sum=sum+p;
                i++;

            }

            else{

                for(int j=0;j<=romanSymbols.length-1;j++){

                    if(r.equals(romanSymbols[j])){

                        sum=sum+romanValues[j];
                        break;
                    }

                }
            }






        }


        System.out.println(sum);








    }
}
