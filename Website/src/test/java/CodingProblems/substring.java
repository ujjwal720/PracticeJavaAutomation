package CodingProblems;

public class substring {

	public static void main(String[] args) {

		/*
		 * // TODO Auto-generated method stub a ab abc abcd b bc bcd d
		 */

		String level = "abcd";
		String level2 = "";

		for (int i = 0; i <= level.length() - 1; i++) {

			for (int j = i; j <= level.length() - 1; j++) {

				for (int k = i; k <= j; k++) {

					level2 = level2 + level.charAt(k);

				}
				System.out.println(level2);
				level2="";

			}

		}

	}

}
