package AssignmentsRivet;

public class percentagepfletter {

    public static void main(String[] args) {


        String p="foobar";
        char letter='o';
        String letter3 =Character.toString(letter);

        int n=p.length();
        int count=0;

        for(int i=0;i<=p.length()-1;i++){

            if(Character.toString(p.charAt(i)).equals(letter3)){

                count++;
            }

        }

        int nums=count*100;
        int nums2=Math.abs(nums/n);
        System.out.println(nums2);



    }
}
