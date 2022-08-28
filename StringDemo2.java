package com.cg.core;

public class StringDemo2 {

	public static void main(String[] args) {
	String s1="JAVA";
	String s2="JAVA";
	String s3="SQL";
	String s4="J2EE";
		
		
	// NON-CONSTATNT POOL AREA
	String str1=new String("JAVA");
	String str2=new String("JAVA");
	String str3=new String("SQL");
	String str4=new String("j2ee");
		
	//COMPARE STRING OBJECT
	System.out.println(s1==s2);
	System.out.println(s1==s3);
	System.out.println(s2==str1);
	System.out.println(str1==str2);
	
	//EQUAL 
	System.out.println(s1.equals(s2));
	System.out.println(s1.equals(str1));
	System.out.println(s3.equals(str3));
	System.out.println(s4.equals(str4));
	
	//EQUAL IGNOR
	System.out.println(s4.equalsIgnoreCase(str4));
	
		}

	
}
