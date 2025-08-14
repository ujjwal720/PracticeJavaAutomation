package lcquestions;

public class gotlatin {

    public static void main(String[] args) {

        String s="I speak Goat Latin";
        String[] arr=s.split(" ");
        String results="";
        int count=1;


        for(int i=0;i<=arr.length-1;i++){


          String o=arr[i];


          if(o.charAt(0)=='a' || o.charAt(0)=='e'|| o.charAt(0)=='i'|| o.charAt(0)=='o'|| o.charAt(0)=='u' ||
                  o.charAt(0)=='A' || o.charAt(0)=='E'|| o.charAt(0)=='I'|| o.charAt(0)=='O'|| o.charAt(0)=='U'){

              results=results+arr[i]+"ma";

              for(int j=1;j<=count;j++){

                  results=results+"a";
              }

              results=results+" ";
              count++;


          }


          else{

              String m=arr[i];

            char p=m.charAt(0);

              for(int k=1;k<=m.length()-1;k++){


                 results=results+m.charAt(k);
              }

              results=results+p;
              results=results+"ma";


              for(int z=1;z<=count;z++){

                  results=results+"a";
              }

              results=results+" ";

              count++;





          }








        }

        System.out.println(results);






    }
}
