package Dynamic;

public class quickbrown {

    public static void main(String[] args) {

/*
Single digit after convert
 */

        String op="leetcode";
        String res="";
        String results="";
        int k=2;
        int count=0;

        for(int i=0;i<=op.length()-1;i++){
             int p=op.charAt(i)-'a'+1;
            res=res+Integer.toString(p);

        }



        while(count<k){

            int sum=0;

            for(int i=0;i<=res.length()-1;i++){

                sum=sum+Integer.parseInt(Character.toString(res.charAt(i)));

            }

            count++;

            if(count==k){

                int p=sum;
                System.out.println(p);
                break;
            }

            if(sum>9){

                res=Integer.toString(sum);
            }






        }









    }
}
