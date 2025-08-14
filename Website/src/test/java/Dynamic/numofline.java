package Dynamic;

public class numofline {


    public static void main(String[] args) {


        int[] a={3,4,10,4,8,7,3,3,4,9,8,2,9,6,2,8,4,9,9,10,2,4,9,10,8,2};
        int count=0;
        String sd="mqblbtpvicqhbrejb";
        int lastline=0;
        int reset=0;

        for(int i=0;i<=sd.length()-1;i++){

            int p= sd.charAt(i)-'a';
            reset=reset+a[p];
            lastline++;



            if(reset==100 ){

                if(lastline==sd.length()){

                    break;
                }
                reset=0;
                count++;
            }
            if(reset>100){

                count++;
                reset=0;
                i=i-1;
            }









        }
        int[] output=new int[2];
        output[0]=count+1;
        output[1]=reset;

        System.out.println(count+1);
        System.out.println(reset);










    }
}
