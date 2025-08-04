package org.lit;

public class Name {
	public static void main(String[] args) {
		StringBuffer S1=new StringBuffer("OMR");
		StringBuffer S2=new StringBuffer("Thoraipakkam");
		StringBuffer S3=new StringBuffer("OMR Thoraipakkam");
		System.out.println("Non literal string");
		System.out.println(S1);
		System.out.println(S2);
		System.out.println(S3);
		System.out.println(System.identityHashCode(S1));
		System.out.println(System.identityHashCode(S2));
		System.out.println(System.identityHashCode(S3));
		S3 = S2.append(S3);
		System.out.println(S2);
	
	}

}
