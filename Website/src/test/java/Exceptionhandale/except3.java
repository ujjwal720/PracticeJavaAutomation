package Exceptionhandale;

public class except3 {

    public static void main(String[] args)  {

  try {
      xd a = new xd();
      a.msd();
  }
  catch(Exception e){

      e.printStackTrace();
  }




    }
}



class xd{


    public void msd() throws Exception {

        throw new Exception("hELLO");
    }
}