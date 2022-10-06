package com.example.singtest.animalkingdom;

public class Rooster extends Chicken implements LivingWith {

	private String roosterSound;

	public Rooster() {
		super.sound = "Cock-a-doodle-doo";
		this.roosterSound = super.sound;
	}
	
	@Override
	public String getSound() {
		return roosterSound;
	}

}
