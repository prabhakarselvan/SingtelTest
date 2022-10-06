package com.example.singtest.animalkingdom;

public class Parrot extends Bird {

	private String parrotSound;
	
	public Parrot() {
		super.canFly=true;
	}

	public Parrot(LivingWith livingwith) {
		this.parrotSound = livingwith.getSound();
		super.sound = this.parrotSound;
	}

}
