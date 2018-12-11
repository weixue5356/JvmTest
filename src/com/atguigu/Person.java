package com.atguigu;

public class Person {
	

	public static void main(String[] args) {
		Person person = new Person();
		System.out.println(person.getClass().getClassLoader().getParent().getParent());
		System.out.println(person.getClass().getClassLoader().getParent());
		System.out.println(person.getClass().getClassLoader());
	}

}
