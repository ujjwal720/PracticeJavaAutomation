package lcquestions;

public class alternatingdigit {

    public static void main(String[] args) {


        int x=111;
        String io=Integer.toString(x);
        int flag=1;
        int sum=0;

        for(int i=0;i<=io.length()-1;i++){

            if(flag%2!=0){

                sum=sum+Integer.parseInt(String.valueOf(io.charAt(i)));


            }

            else{

                String t="-"+io.charAt(i);
                sum=sum+Integer.parseInt(t);

            }

            flag++;


        }

        System.out.println(sum);
    }
}
