package com.biz.classes.exec;

import com.biz.classes.service.children.Cat;
import com.biz.classes.service.children.Dog;
import com.biz.classes.service.parents.Animal;

public class AnimalEx_01 {

	public static void main(String[] args) {

		Animal am = new Animal();
		
		System.out.println(am.getName());
		
		Dog dog = new Dog();
		dog.setName();
		System.out.println(dog.getName());
		
		Cat cat = new Cat();
		cat.setName();
		System.out.println(cat.getName());
		
	}

}
