package com.persistent.learning;

public class Student {

	String name;
	int age;
	String address;
	
	//Constructor
	public Student(String name,int age,String address) {
		// this,name refers to the class member and simple 'name' means function parameter  
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
	
	
	
	//main function
	public static void main(String[] args) {
		Student s1 = new Student("Animesh" , 19 , "Home");
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		System.out.println(s1.getAddress());
		
	}

}
