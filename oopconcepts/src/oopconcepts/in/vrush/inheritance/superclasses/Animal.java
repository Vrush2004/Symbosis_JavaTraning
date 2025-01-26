package oopconcepts.in.vrush.inheritance.superclasses;

public class Animal {
	protected String color;
	protected int age;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Animal(String color, int age) {
		this.color = color;
		this.age = age;
	}
	public Animal() {
		System.out.println("Animal constructor");
	}
	
	
}
