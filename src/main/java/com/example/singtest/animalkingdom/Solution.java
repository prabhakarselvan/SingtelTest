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
		
		System.out.println("--------Shark------------");
		Fish shark = new Shark();
		shark.swim();
		shark.walk();
		shark.size();
		shark.color();
		shark.canMakeJokes();
		shark.eatOtherFish();

		System.out.println("--------ClownFish------------");
		Fish clownFish = new ClownFish();
		clownFish.swim();
		clownFish.walk();
		clownFish.size();
		clownFish.color();
		clownFish.canMakeJokes();
		
		System.out.println("--------Dolphin------------");
		Fish dolphinFish = new Dolphin().getDolphin();
		dolphinFish.swim();
		dolphinFish.walk();
		
		System.out.println("--------Butterfly------------");
		Animal butterfly = new Butterfly();
		butterfly.fly();
		butterfly.makesound();
		
		System.out.println("--------Caterpillar------------");
		Caterpillar caterPillar = new Caterpillar();
		caterPillar.fly();
		caterPillar.walk();
		
		System.out.println("--------ButterflyWithTransformation------------");
		Butterfly transformButterfly = caterPillar.transform();
		transformButterfly.fly();
		transformButterfly.makesound();

		System.out.println("--------Count------------");
		Animal[] animals = new Animal[] { new Bird(), new Duck(), new Chicken(), new Rooster(), new Parrot(),
				new Fish(), new Shark(), new ClownFish(), new Dolphin(), new Frog(), new Dog(), new Butterfly(),
				new Cat() };
		int totalSwim = 0;
		int totalFly = 0;
		int totalWalk = 0;
		int totalSing = 0;
		for (Animal anim : animals) {
			if (anim.isCanFly()) {
				totalFly++;
			}
			if (anim.isCanSwim()) {
				totalSwim++;
			}
			if (anim.isCanWalk()) {
				totalWalk++;
			}
			if (anim.isCanSing()) {
				totalSing++;
			}
		}
		System.out.println("Total Fly:- " + totalFly);
		System.out.println("Total Swim:- " + totalSwim);
		System.out.println("Total Walk:- " + totalWalk);
		System.out.println("Total Sing:- " + totalSing);

	}
}
