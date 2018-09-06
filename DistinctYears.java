package Misc;

import java.util.HashSet;
import java.util.Set;

public class DistinctYears {

	Set<Integer> distinctYear = new HashSet<Integer>();

	public static void main(String[] args) {
		String s = "UN was established on 24-10-1945 and 23-10-1934 and 23-09-1946.";
		DistinctYears y = new DistinctYears();
		System.out.println("No. of distinct years - " + y.distinct_years(s));
	}

	public int distinct_years(String s) {
		String[] sa = s.split(" ");

		for (int i = 0; i < sa.length; i++) {
			if (Character.isDigit(sa[i].charAt(0))) {
				addDate(sa[i]);
			}
		}
		return distinctYear.size();
	}

	public void addDate(String s) {

		if ((Character.isDigit(s.charAt(1))) && (Character.isDigit(s.charAt(3))) && (Character.isDigit(s.charAt(4)))
				&& (Character.isDigit(s.charAt(6))) && (Character.isDigit(s.charAt(7)))
				&& (Character.isDigit(s.charAt(8))) && (Character.isDigit(s.charAt(9))) && ((s.charAt(2)) == '-')
				&& ((s.charAt(5) == '-'))) {

			int y = (int) s.charAt(6) * 1000 + (int) s.charAt(7) * 100 + (int) s.charAt(8) * 10 + (int) s.charAt(9);

			distinctYear.add(y);
		}
	}

}
