package AssignmentsRivet;

public class withoutforloop {

    public static void main(String[] args) {

        String s="Ujjwal";
        print(1);



    }

    public static void print(int count){

        if(count>5){

            return;
        }

        System.out.println("Ujjwal");
        count++;
        print(count);
    }
}
