package AssignmentsRivet;

public class colorofchessboard {

    public static void main(String[] args) {


        String[] ds={"a","b","c","d","e","f","g","h"};
        String po="c3";
        String co="";
        for(int i=0;i<=ds.length-1;i++){

            if(ds[i].equals(Character.toString(po.charAt(0)))){

                int o=i+1;
                if(o%2==0){

                    co="white";
                    break;

                }

                else{

                    co="black";
                    break;
                }
            }

        }

        String key="";

        if(co.equals("white")){

            int y=Integer.parseInt(Character.toString(po.charAt(1)));
            if(y%2==0){

                key="black";

            }

            else{

                key="white";
            }



        }

        else{

            int y=Integer.parseInt(Character.toString(po.charAt(1)));
            if(y%2==0){

                key="white";

            }

            else{

                key="black";
            }



        }


    }
}
