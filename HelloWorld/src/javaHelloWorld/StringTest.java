package javaHelloWorld;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Welcome";
		String s2="Welcome";
		String s3=new String("Welcome");
		String s4=new String("Welcome");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s1.charAt(2));
		System.out.println(s1.length());
		System.out.println(s1.substring(2,4));
		System.out.println(s1.contains(s2));
		
		
		
		StringBuffer sb1=new StringBuffer("Hellooo");
		System.out.println(sb1);
		System.out.println(sb1.reverse());
		
		StringBuilder sb2=new StringBuilder("Hellobuildd");
		System.out.println(sb2);
		System.out.println(sb2.reverse());
		
	}

}
