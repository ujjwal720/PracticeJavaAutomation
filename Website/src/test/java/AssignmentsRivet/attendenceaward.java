package AssignmentsRivet;

public class attendenceaward {

    public static void main(String[] args) {



        String s="PPALLL";
        char[] io=s.toCharArray();
        int count=0;
        int count2=0;

        for(int i=0;i<=s.length()-1;i++){

            if(io[i]=='A'){

                count++;
            }
        }


        for(int i=0;i<=io.length-1;i++){

            if(count2>=3){

                break;
            }

            if(io[i]=='L'){

                count2++;

            }

            else{

                count2=0;
            }
        }


        if(count2>=3 || count>=2){

            System.out.println("false");
        }

        else{

            System.out.println("true");
        }


    }
}
