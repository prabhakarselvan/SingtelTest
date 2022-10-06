package com.example.singtest.animalkingdom;

public class Chicken extends Bird{
	
	public Chicken() {
		super.canFly=false;
		super.sound="Cluck, cluck";
	}
	
	public Chicken(String sound) {
		this();
		super.sound=sound;
	}

}
