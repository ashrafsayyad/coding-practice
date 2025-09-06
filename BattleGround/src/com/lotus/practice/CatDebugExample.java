package com.lotus.practice;

public class CatDebugExample {

	public static void main(String[] args) {
		Cat cat1 = new Cat("Kramer");
		cat1.setBreed("Persian");
		cat1.setAge(3);
		
		Cat cat2 = new Cat("George");
		cat2.setBreed("Indian");
		cat2.getBreed();
		cat2.setAge(5);
		cat2.getAge();
		System.out.println(cat2.getAge());
		
		Cat cat[] = new Cat[2];
		cat[0] = cat1;
		cat[1] = cat2;
	}

}
