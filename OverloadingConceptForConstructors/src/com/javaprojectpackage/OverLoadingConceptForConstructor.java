package com.javaprojectpackage;
//constructor over loading...(compile time polymorphism)
//super class creation
class Parent
{
	//private variables creation
	private int sal;
	//constructor without argument
	public Parent()
	{
		System.out.println("parent class constructor");
	}
	//constructor with private argument
	public Parent(int sal)
	{
		this.sal=sal;
	}
}
//child class creation 
class Child extends Parent//extending super class
{
	//constructor without argument
	public Child()
	{
		System.out.println("child class constructor");
	}
	//constructor with private argument
	public Child(int sal)
	{
		super(sal);//using super we can initiate another class private data members
		System.out.println(sal);
		System.out.println("other statements are after super class performance");
	}
}

public class OverLoadingConceptForConstructor {

	public static void main(String[] args)
	{

		//	Parent ob1=new Parent();
		Child ob2=new Child();

		Child ob3=new Child(12345);



	}

}
