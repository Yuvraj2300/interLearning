package com.inter.prep.arrStr;

//To check if a string has repeating values. Without using any other data structure.
public class Repeating {

	public static void main(String args[]) {
		String str = "ghacghac";
		CheckRepeating(str);
	}

	public static boolean CheckRepeating(String str) {
		if (str.length() > 128) {
			return false;
		}

		boolean[] char_set = new boolean[128];
		for (int i = 0; i < str.length(); i++) {
			int	val	=	str.charAt(i);
			if(char_set[val]) {
				return	false;
			}
			char_set[val]	=	true;
		}
		return	true;
	}
}
