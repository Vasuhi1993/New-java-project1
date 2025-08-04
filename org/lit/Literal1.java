package org.lit;

public class Literal1 {
	public static void main(String[] args) {
		String S1="OMR";
		String S2="Thoraipakkam";
		String S3="OMR Thoraipakkam";
		System.out.println("Literal String");
		System.out.println(S1);
		System.out.println(S2);
		System.out.println(S3);
		System.out.println(System.identityHashCode(S1));
		System.out.println(System.identityHashCode(S2));
		System.out.println(System.identityHashCode(S3));
		String concat = S1.concat(S3);
		System.out.println(concat);
		}

}
