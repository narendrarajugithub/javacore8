package com.ust.core.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text="ab";
		String ptrn="[a-zA-Z]";
		
		Pattern pattrn=Pattern.compile(ptrn);
		Matcher mat=pattrn.matcher(text);
				
		System.out.println(mat.matches());
		
	}

}
