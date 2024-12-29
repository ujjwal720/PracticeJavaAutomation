package AssignmentsRivet;

public class strong {

    public static void main(String[] args) {


        String k = "IloveLe3tcode!";
        if (k.length() >= 8) {
            int uf = 0;
            int lf = 0;
            int sf = 0;
            int af = 0;
            int df = 0;
            for (int i = 0; i <= k.length() - 1; i++) {
                if (Character.isUpperCase(k.charAt(i))) {

                    uf = 1;
                } else if (Character.isLowerCase(k.charAt(i))) {

                    lf = 1;
                } else if (Character.isDigit(k.charAt(i))) {

                    df = 1;

                } else if (!Character.isLetterOrDigit(k.charAt(i))) {

                    sf = 1;
                }
            }

            if (uf == 1 && lf == 1 && df == 1 && sf == 1) {

                for (int i = 0; i <= k.length() - 1 - 1; i++) {
                    if (k.charAt(i) == k.charAt(i + 1)) {

                        af = 2;
                        break;


                    } else {


                    }

                }

                if (af == 0 && uf == 1 && lf == 1 && df == 1 && sf == 1) {

                    System.out.println("Password is string");


                } else {

                    System.out.println("Not Strong");
                }
            } else {

                System.out.println("Password not strong");
            }


        }
    }

}
