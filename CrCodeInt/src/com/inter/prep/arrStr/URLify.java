package com.inter.prep.arrStr;

public class URLify {
	public static void main(String[] args) {
		String value = "my name is John";
		makeUrl(value);
	}

	public	static	String	makeUrl(String	val) {
		//count number of spaces
		int	truelength	=	val.length();
		int	spaces	=	0;
		char	str[] = val.toCharArray();
		for(int	i=0;i<truelength;i++) {
			if(str[i]==' ') {
				spaces++;
			}
		}
		int	index	=	spaces*3;
		
	return	null;
	}
}
