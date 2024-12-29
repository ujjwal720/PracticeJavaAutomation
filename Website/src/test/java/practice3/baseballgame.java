package practice3;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class baseballgame {

    public static void main(String[] args) {

/*

        String[] arr={"5","2","C","D","+"};
        Stack<String> ui=new Stack<String>();
        List<String> let=new ArrayList<String>();
        for(int i=0;i<=arr.length-1;i++){

            if(Character.isLetter(arr[i].charAt(0)) || arr[i].equals("+")){

                let.add(arr[i]);
            }

            else{

                ui.push(arr[i]);
            }
        }


        for(int i=0;i<=let.size()-1;i++){

            if(let.get(i).equals("+")){

                int sum=Integer.parseInt(ui.get(ui.size()-1))+Integer.parseInt(ui.get(ui.size()-1-1));
                ui.push(Integer.toString(sum));
            }

            else if(let.get(i).equals("C")){

                ui.pop();
            }

            else if(let.get(i).equals("D")){

                int sum=Integer.parseInt(ui.get(ui.size()-1));
                int y=sum*2;
                ui.push(Integer.toString(y));


            }

        }

        int sum=0;

        for(int i=0;i<=ui.size()-1;i++){

            sum=sum+Integer.parseInt(ui.get(i));

        }

        System.out.println(sum);


 */

        String[] arr={"1","C"};
        Stack<String> ui=new Stack<String>();
        for(int i=0;i<=arr.length-1;i++){

            if(Character.isDigit(arr[i].charAt(arr[i].length()-1))){

                ui.push(arr[i]);

            }

            else if(arr[i].equals("+")){

                int sum=Integer.parseInt(ui.get(ui.size()-1))+Integer.parseInt(ui.get(ui.size()-1-1));
                ui.push(Integer.toString(sum));
            }

            else if(arr[i].equals("C")){

                ui.pop();
            }

            else if(arr[i].equals("D")){

                int sum=Integer.parseInt(ui.get(ui.size()-1));
                int y=sum*2;
                ui.push(Integer.toString(y));

            }


        }

        int sum=0;

        for(int i=0;i<=ui.size()-1;i++){

            sum=sum+Integer.parseInt(ui.get(i));

        }

        System.out.println(sum);



    }
}
