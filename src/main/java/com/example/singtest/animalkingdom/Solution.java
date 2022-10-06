package com.example.singtest.animalkingdom;

public class Solution {
	public static void main(String[] args) {
		System.out.println("--------Bird------------");
		Animal bird = new Bird();
		bird.sing();
		bird.fly();
		bird.walk();
		
		System.out.println("--------Chicken------------");
		Animal chicken = new Chicken();
		chicken.sing();
		chicken.makesound();
		chicken.fly();
		chicken.swim();
		chicken.walk();

		System.out.println("--------Duck------------");
		Animal duck = new Duck();
		duck.sing();
		duck.makesound();
		duck.fly();
		duck.swim();
		duck.walk();

	}
}
