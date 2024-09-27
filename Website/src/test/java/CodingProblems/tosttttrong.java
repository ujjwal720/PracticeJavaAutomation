package CodingProblems;

public class tosttttrong {


    /*
    to string method
     */
    public static void main(String[] args){

        hsp a=new hsp(1,2,"name");
       String l= a.toString();
        System.out.println(l);


    }



}

class hsp{

    int p;
    int f;
    String ol;


    public hsp(int p,int f,String ol){

        this.p=p;
        this.f=f;
        this.ol=ol;


    }


    @Override
    public String toString(){

        return "p ="+p+"f="+f+"ol ="+ol;

    }


}