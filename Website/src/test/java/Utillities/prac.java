package Utillities;

public class prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int averagescore=76;
		if(averagescore>=90){
			 System.out.println("A");
		    
		}
		
		 
		else if(averagescore>=80 && averagescore<90){
		 
			System.out.println("B");
		}
		 
		/*
		average score whould be less than 70 but also it should not be more than 80(thats how and come in picture)
		*/
		else if(averagescore>=70 && averagescore<80){
		 
			System.out.println("C");
		}
		 
		else if(averagescore>=60 && averagescore<70){
		 
			System.out.println("D");
		}
		 
		else if(averagescore<60){
		 
			System.out.println("F");
		}
		
		/*
		 * if we put the or function it will just create the problem that why we dont do
		 */
		

	}

}
