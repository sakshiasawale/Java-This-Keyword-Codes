package com.thiskeyword;

//Write a Java program to demonstrate the use of the this keyword.

public class ThisKeyword {

	private int rollno = 29;
	private String name = "Sakshi";
	
	ThisKeyword()
	{
		System.out.println("---Default Constructor---");
	}
	
	ThisKeyword(int rollno,String name)
	{
		this.rollno= rollno;
		this.name = name;
	}
	
	public void studentDetails()
	{
		System.out.println("Roll No is:"+rollno);
		System.out.println("Name is:"+name);
	}
	
	public static void main(String[] args) {
		ThisKeyword t = new ThisKeyword();
		t.studentDetails();
	}
}


