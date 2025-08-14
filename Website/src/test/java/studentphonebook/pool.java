package studentphonebook;

public class pool {

    public static void main(String[] args) {


        String a=new String("Aman");
        String b=new String("Aman");
        String c="Nikhil";
        String d="Nikhil";


        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
        System.out.println(System.identityHashCode(c));
        System.out.println(System.identityHashCode(d));

    }
}
