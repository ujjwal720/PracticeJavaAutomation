package practice3;

import java.util.Stack;

public class backspce {

    public static void main(String[] args) {

/*
backspace
 */

        String s1 ="xywrrmp";
        String s2="xywrrm#p";
        String resul1="";
        String resul2="";

        Stack<Character> jk=new Stack<Character>();
        Stack<Character> jkm=new Stack<Character>();

        for(int i = 0; i<= s1.length()-1; i++){

            if(s1.charAt(i)=='#'){
                if(jk.isEmpty()){


                }
                else{

                    jk.pop();
                }
            }

            else{

                jk.push(s1.charAt(i));
            }
        }


        for(int i = 0; i<= s2.length()-1; i++){

            if(s2.charAt(i)=='#'){

                if(jkm.isEmpty()){


                }
                else{

                    jk.pop();
                }
            }

            else{

                jkm.push(s2.charAt(i));
            }
        }


        for(int i=0;i<=jk.size()-1;i++){

            resul1=resul1+jk.get(i);
        }

        for(int i=0;i<=jkm.size()-1;i++){

            resul2=resul2+jkm.get(i);
        }


        if(resul1.equals(resul2)){

            System.out.println("true");
        }

        else{

            System.out.println("false");
        }

    }
}
