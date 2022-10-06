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
		
		System.out.println("--------Parrot Living with Dog------------");
		Animal livingWithDog = new Parrot(new Dog());
		livingWithDog.makesound();

		System.out.println("--------Parrot Living Cat------------");
		Animal livingWithCat = new Parrot(new Cat());
		livingWithCat.makesound();

		System.out.println("--------Parrot Living Rooster------------");
		Animal livingWithRooster = new Parrot(new Rooster());
		livingWithRooster.makesound();

		System.out.println("--------Parrot Living Telephone------------");
		Animal livingWithTelelphone = new Parrot(new Telephone());
		livingWithTelelphone.makesound();

		System.out.println("--------Parrot Living Door------------");
		Animal parrotLivingWithRooster = new Parrot(new LivingWith() {
			@Override
			public String getSound() {
				return "Knock Knock";
			}
		});
		parrotLivingWithRooster.makesound();
		
		System.out.println("--------Fish------------");
		Animal fish = new Fish();
		fish.swim();
		fish.walk();
		fish.sing();

	}
}
