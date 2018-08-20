package com.trial1;

import java.util.Arrays;

public class LetterChanges {

	static final char[] vowels = {'A','E','I','O','U','a','e','i','o','u'};
	public static void main(String[] args) {
		String str = "hello*3";
		//String str = "fun times!";
		System.out.println(zToA(str));
	}
	
	public static String zToA(String str)
	{
		
		char[] ch = str.toCharArray();
		char[] op = new char[ch.length];
		for(int i=0; i<ch.length; i++)
		{
			String ss = Character.toString(ch[i]);
			if(containsSpecialCharacter(ss))
			{
				op[i] = ss.charAt(0);
			}
			
			if(ch[i]!=' ' && !containsSpecialCharacter(ss))
			{
				char c = (ch[i] == 'z' || ch[i] == 'Z')? 'a':(char)(ch[i]+1);
				op[i] = c;
				if(isVowel(op[i]))
				{
					op[i] = Character.toUpperCase(op[i]);
				}
			}else
			{
				op[i] = ch[i];
				//op[i] = Character.toUpperCase(op[i]);
			}
		}
		String out = new String(op);		
		
		return out;
	}
	
	public static boolean containsSpecialCharacter(String s) {
	    return (s == null) ? false : s.matches("[^A-Za-z]");
	}
	
	public static boolean isVowel(char ch)
	{
		for(char vowel:vowels)
		{
			if(vowel == ch)
				return true;
		}
		return false;
	}
}
