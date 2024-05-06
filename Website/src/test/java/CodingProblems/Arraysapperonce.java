package CodingProblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Arraysapperonce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * appear twice return true anau number
		 */

		int[] b = { 1, 2, 1, 3, 4 };
		Arraysapperonce d = new Arraysapperonce();
		boolean iu=d.im(b);
		System.out.println(iu);

	}

	public boolean im(int[] a) {

		List<Integer> io = new ArrayList<Integer>();
		boolean value = false;
		for (int i = 0; i <= a.length - 1; i++) {

			io.add(a[i]);

		}

		Set<Integer> im = new HashSet<Integer>(io);
		List<Integer> iov = new ArrayList<Integer>(im);

		for (int i = 0; i <= iov.size() - 1; i++) {

			int count = 0;

			for (int j = 0; j <= io.size() - 1; j++) {

				if (iov.get(i) == io.get(j)) {

					count++;

				}

			}

			if (count > 0) {

				value = true;

				break;
			}

		}

		return value;

	}

}
