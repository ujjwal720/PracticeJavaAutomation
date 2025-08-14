package lcquestions;



public class numberofseniorcitizen {

    public static void main(String[] args) {


        String[] k = {"5612624052M0130", "5378802576M6424", "5447619845F0171", "2941701174O9078"};

        int count = 0;

        for (int i = 0; i <= k.length - 1; i++) {
            String z=k[i];
            String j = Character.toString(z.charAt(z.length()-1-1-1-1)) + Character.toString(z.charAt(z.length()-1-1-1));
            if (Integer.parseInt(j) > 60) {
                count++;

            }





        }
        System.out.println(count);
    }
}
