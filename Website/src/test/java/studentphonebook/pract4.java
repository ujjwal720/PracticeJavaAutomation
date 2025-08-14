package studentphonebook;

public class pract4 {

    public static void main(String[] args) {

        String st="India is a fab";
        char t='a';
        int count=0;
        char[] io=st.toCharArray();
        String result="";
        for(int i=0;i<=io.length-1;i++){

            if(io[i]=='a'){
                count++;
                for(int j=1;j<=count;j++){
                    result=result+"@";
                }
            }
            else{
                result=result+io[i];
            }
        }

        System.out.println(result);



    }
}
