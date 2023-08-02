package com.persistent.learning;

public class Student {

	String name;
	int age;
	String address;
	
	//Constructor
	public Student(String name,int age,String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	//Setter functions
	 public void setName(String name) {
		 this.name = name;
	 }
	 public void setAge(int age) {
		 this.age = age;
	 }
	 public void setAddress(String address) {
		 this.address = address;
	 }
	 
	 //Getter functions
	public String getName() {
		return this.name ;
	}
	public int getAge() {
		return this.age ;
	}
	public String getAddress() {
		return this.address ;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student("Animesh" , 19 , "Home");
		String a = s1.getName();
		System.out.println(a);
	}

}
