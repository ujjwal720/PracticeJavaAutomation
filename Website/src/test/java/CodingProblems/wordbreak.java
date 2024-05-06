package CodingProblems;

public class wordbreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 766;
		String words = Integer.toString(x);
		String resultant = "";
		int sum = 0;
		int length = words.length();
		while (resultant.length() != 1) {

			resultant = "";

			for (int i = 0; i <= length-1; i++) {

				sum = sum + Integer.parseInt(Character.toString(words.charAt(i)));

			}
			resultant = Integer.toString(sum);

			length = resultant.length();
			
			words="";
			
			sum=0;
			
			words=resultant;

		}

		System.out.println(resultant);

	}

}
