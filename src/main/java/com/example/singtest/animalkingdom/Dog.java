package com.example.singtest.animalkingdom;

public class Dog extends Animal implements LivingWith {

	private String dogSound;

	public Dog() {
		super.canWalk = true;
		super.sound = "Woof, woof";
		this.dogSound = super.sound;
	}

	@Override
	public String getSound() {
		return dogSound;
	}

}
