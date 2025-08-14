package lcquestions;

public class recursionsumarray {

    public static void main(String[] args) {

        int[] x={1,2,3};
        int count=0;
        recursionsumarray a=new recursionsumarray();
       int p= a.getsum(x,count,0);
        System.out.println(p);



    }


    public int getsum(int[] y, int count, int sum){

        if(count>y.length-1){


            return sum;
        }

        sum=sum+y[count];
        count++;
       return getsum(y,count,sum);



    }
}
