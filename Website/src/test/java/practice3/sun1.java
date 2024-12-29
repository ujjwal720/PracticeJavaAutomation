package practice3;

public class sun1 {

    public static void main(String[] args) {

        sun1 a=new sun1();
       int p= a.sumofn(1,10,0);
        System.out.println(p);
    }
    public int sumofn(int x, int n, int sum) {

        if (x > n) {

            return sum;
        }


        sum = sum + x;
        x++;

       return sumofn(x,n,sum);



    }
}

