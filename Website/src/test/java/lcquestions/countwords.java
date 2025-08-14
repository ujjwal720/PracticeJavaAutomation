package lcquestions;

public class countwords {

    public static void main(String[] args) {

        String[] words1 ={"pay","attention","practice","attend"};
        String o="at";
        int count=0;

        for(int i = 0; i<= words1.length-1; i++) {

            String jk = words1[i];
            String results = "";
            if (jk.length() >= o.length()) {
                for (int j = 0; j <= o.length() - 1; j++) {

                    results = results + jk.charAt(j);

                }

                if (results.equalsIgnoreCase(o)) {

                    count++;
                }


            }
        }

        System.out.println(count);








    }
}
