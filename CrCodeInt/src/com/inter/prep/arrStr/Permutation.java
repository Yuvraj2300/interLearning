package com.inter.prep.arrStr;

public class Permutation {
	public static void main(String[] args) {
		String s1 = "dog";
		String s2 = "god";

		checkPerm(s1, s2);
	}

	public static boolean checkPerm(String s1, String s2) {
		String srtS1 = sortString(s1);
		String srtS2 = sortString(s2);

		if (srtS1.length() != srtS2.length()) {
			return false;
		}

		if (!srtS1.equals(srtS2)) {
			return false;
		}
		return true;
	}

	public static String sortString(String s) {
		char[] content = s.toCharArray();
		java.util.Arrays.sort(content);
		return new String(content);
	}
}
