package com.example.staticexample;

public class StudentTest {

	public static void main(String[] args) {
		
		Student s1= new Student(1111, "sudheer");
		Student s2= new Student(1112, "kumar");
		Student s3= new Student(1113, "kb");
		Student s4= new Student(1114, "surendra");
		Student s5= new Student(1115, "narayana");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		
		System.out.println("=============static varaible access=================");
		
		System.out.println(Student.collegeName);
		
		
		
		
	}

}
