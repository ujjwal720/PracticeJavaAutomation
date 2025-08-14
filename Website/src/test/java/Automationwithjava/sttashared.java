package Automationwithjava;

public class sttashared {

    public static void main(String[] args) {

        b x=new b();
        c v=new c();
        v.printname();
        x.changename();
        v.printname();
        System.out.println(company.company1);

    }
}


class company{

   public static String company1="1Rivet";
}

class b{

    public void changename(){

        company.company1="1R Dharampur";
    }

}

class c{

    public void printname(){
        System.out.println(company.company1+" "+"This is an company name");
    }
}