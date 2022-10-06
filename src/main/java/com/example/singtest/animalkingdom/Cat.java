package com.example.singtest.animalkingdom;

public class Cat extends Animal implements LivingWith{
	
	private String catSound;

	public Cat() {
		super.canWalk = true;
		super.sound="Me ow";
		this.catSound = super.sound;
	}
	
	@Override
	public String getSound() {
		return catSound;
	}

}
