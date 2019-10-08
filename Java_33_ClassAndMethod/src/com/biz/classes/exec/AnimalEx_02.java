package com.biz.classes.exec;

import com.biz.classes.service.children.Cat;
import com.biz.classes.service.children.Dog;
import com.biz.classes.service.parents.Animal;

public class AnimalEx_02 {

	public static void main(String[] args) {

		// 부모 클래스로 선언을 하고 child 클래스로 초기화
		
		Animal dog =new Dog();
		Animal cat =new Cat();
		
		
		viewName(dog);
		viewName(cat);
	}

	public static void viewName(Animal animal) {
		String name = animal.getName();
		System.out.println(name);
	}
	
}
