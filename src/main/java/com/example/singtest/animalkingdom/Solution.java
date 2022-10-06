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
		
		System.out.println("--------Rooster------------");
		Animal rooster = new Rooster();
		rooster.sing();
		rooster.makesound();
		rooster.fly();
		rooster.swim();
		rooster.walk();

		System.out.println("--------RoosterWithoutInheritance------------");
		RoosterWithoutInheritance roosterWithoutInheritance = new RoosterWithoutInheritance(
				new Chicken("Cock-a-doodle-doo "));
		Animal rooster1 = roosterWithoutInheritance.getChicken();
		rooster1.sing();
		rooster1.makesound();
		rooster1.fly();
		rooster1.swim();
		rooster1.walk();

	}
}
