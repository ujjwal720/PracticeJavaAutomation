package Dynamic;

public class shift {

    public static void main(String[] args) {


        String fg="a1b2c3d4e";
        char p=' ';
        String res="";

        for(int i=0;i<=fg.length()-1;i++){

            if(Character.isDigit(fg.charAt(i))){
                int x=p;
                int jk=x+Integer.parseInt(Character.toString(fg.charAt(i)));
                char hj= (char) jk;
                res=res+hj;

            }

            else{

                p=fg.charAt(i);
                res=res+p;

            }
        }

        System.out.println(res);


    }
}
