package javaHelloWorld;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int id;
String name;
String collegename;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the ID : ");
id=sc.nextInt();
System.out.print("Enter the name : ");
name=sc.next();
System.out.print("Enter the college name : ");
collegename=sc.nextLine();
System.out.println("ID : "+id);
System.out.println("Student name : "+name);
System.out.println("College name : "+collegename);
	}

}
