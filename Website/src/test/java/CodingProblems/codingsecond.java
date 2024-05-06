package CodingProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class codingsecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * largest and smallest in an array
		 */

		int[] a = { 1, 2, 3, 4, 5, 1 };
		List<Integer> im = new ArrayList<Integer>();
		for (int i = 0; i <= a.length - 1; i++) {

			im.add(a[i]);
		}

		Collections.sort(im);

		System.out.println(
				"The smallest element is" + " " + im.get(0) + " " + "The largest ellent is" + im.get(im.size() - 1));

	}

}
