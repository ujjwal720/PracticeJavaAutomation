package practice3;

public class digitssum {

    public static void main(String[] args) {

        digitssum a=new digitssum();
        int p=a.sumofdigits(12345,0,0);
        System.out.println(p);
    }


    public int sumofdigits(int x,int index,int sum){

        int len=Integer.toString(x).length();

        if(index>len-1){

            return sum;
        }
        char t=Integer.toString(x).charAt(index);
        sum=sum+Integer.parseInt(Character.toString(t));
        index++;
        return sumofdigits(x,index,sum);
    }
}
