package AssignmentsRivet;

public class checkalla {

    public static void main(String[] args) {

        String s1 ="abab";

        int index=0;

        for(int i = 0; i<= s1.length()-1; i++){


            if(s1.charAt(i)=='b'){

                index=i;
                break;
            }
        }

        boolean flag=true;

        for(int i = index; i<= s1.length()-1; i++){

            if(s1.charAt(i)=='b'){

            }

            else{

                flag=false;
                break;

            }
        }


        System.out.println(flag);



    }
}
