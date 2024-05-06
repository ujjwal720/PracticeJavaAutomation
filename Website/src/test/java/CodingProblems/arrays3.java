package CodingProblems;

import java.util.HashMap;
import java.util.Map;

public class arrays3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * count frequency of elements
		 * this is for the frequency of elements
		 * and now i undertand why we are using the hashmap thing
		 * as the key will contain the duplicates
		 */

		int[] a = { 1, 2, 3, 1, 2, 4 };
		Map<Integer, Integer> yu = new HashMap<Integer, Integer>();

		for (int i = 0; i <= a.length - 1; i++) {

			if (yu.containsKey(a[i])) {

				yu.put(a[i], yu.get(a[i]) + 1);

			}

			else {

				yu.put(a[i], 1);

			}

		}
		
		System.out.println(yu);

	}

}
