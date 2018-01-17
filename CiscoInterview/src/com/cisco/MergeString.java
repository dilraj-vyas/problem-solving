package com.cisco;

public class MergeString {
	public static void main(String[] args) {
		mergeString("zsd", "ab");
	}
	
	public static String mergeString(String a, String b) {
		String resultString = new String();
		int length=Math.min(a.length(),b.length());	
		int i = 0;
		int j=0;
		String bigString= a.length() > b.length() ? a :b;
		boolean flag=true;
		while(length > j) {
		if(flag)
		{
			resultString+=a.charAt(i);
			flag=false;
			i++;             
		
		}else
		{
			resultString+=b.charAt(j);
			flag=true;
			j++;
		}	
		
		}
		if(i<j)
		resultString+=(bigString.substring(i));
		else
			resultString+=(bigString.substring(j));
		
		
		System.out.println(resultString);
		
		return resultString;
	}

}
