package multithreading;

public class question1 {

    public static void main(String[] args) throws InterruptedException {

      a a=new a();
      a.start();



      for(int i=0;i<=5;i++){

          System.out.println(i);
      }
    }
}




class a extends Thread{


    public void run(){

        for(int i=0;i<=5;i++){
            System.out.println(Thread.currentThread().getState());
            System.out.println(i);
            try {
                System.out.println(Thread.currentThread().getState());
                Thread.sleep(2000);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }





}