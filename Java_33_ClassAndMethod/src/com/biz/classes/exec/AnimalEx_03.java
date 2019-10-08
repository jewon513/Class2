package com.biz.classes.exec;

import com.biz.classes.service.children.Cat;
import com.biz.classes.service.children.Dog;
import com.biz.classes.service.parents.Animal;

public class AnimalEx_03 {

	public static void main(String[] args) {

		Animal am = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		viewName(am);
		dog.setName();
		viewName(dog);
		cat.setName();
		viewName(cat);
	}
	
	public static void viewName(Animal animal) {
		String name = animal.getName();
		System.out.println(name);
	}
//	
//	public static void viewName(Dog animal) {
//		String name = animal.getName();
//		System.out.println("Dog");
//		System.out.println(name);
//	}
//	
//	public static void viewName(Cat animal) {
//		String name = animal.getName();
//		System.out.println("Cat");
//		System.out.println(name);
//	}
	

}
