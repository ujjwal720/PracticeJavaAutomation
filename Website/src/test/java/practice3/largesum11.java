package practice3;

public class largesum11 {

public static void main(String[] args) {

    String  ui="6";
    String  uiz="501";
    String res="";
    int car=0;
    while (ui.length() < uiz.length()) {
        ui = "0" + ui; // Pad ui with '0'
    }
    while (uiz.length() < ui.length()) {
        uiz = "0" + uiz; // Pad uiz with '0'
    }




    for(int i=ui.length()-1;i>=0;i--){





        int p=car+Integer.parseInt(Character.toString(ui.charAt(i)))+Integer.parseInt(Character.toString(uiz.charAt(i)));
        String z=Integer.toString(p);

        if(i==0) {
            StringBuilder yt=new StringBuilder(z);
            res=res+yt.reverse();
            break;


        }

        if(p>=0 && p<=9) {
            res = res + Character.toString(z.charAt(0));
            car=0;


        }

        else{


            res = res + Character.toString(z.charAt(1));
            int yu=Integer.parseInt(Character.toString(z.charAt(0)));
            car=yu;



        }






    }

    StringBuilder yt=new StringBuilder(res);

    String uip=yt.reverse().toString();

    System.out.println(uip);



}

}
