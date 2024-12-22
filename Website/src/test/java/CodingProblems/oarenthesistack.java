package CodingProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class oarenthesistack {

    public static void main(String[] args) {
/*
        Stack<Character> io=new Stack<Character>();
        String j="(())";
        char[] f=j.toCharArray();
        for(int i=0;i<=f.length-1;i++){

            if(f[i]=='('){

                io.push('(');
            }

            else{

                io.pop();
            }


        }

        if(io.isEmpty()){

            System.out.println("it is balanced");
        }
        else{

            System.out.println("it is not balanced");
        }

        */

        Stack<Character> io=new Stack<Character>();

        io.push('(');
        io.push('(');
        System.out.println(io);
        List<Character> ty=new ArrayList<Character>(io);
        System.out.println(ty);




    }
}
