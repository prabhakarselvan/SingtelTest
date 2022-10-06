package com.example.singtest.animalkingdom;

public abstract class Animal {

	boolean canFly;
	boolean canWalk;
	boolean canSing;

	public void fly() {
		if (canFly) {
			System.out.println("I am flying");
		} else {
			System.out.println("I cannot fly");
		}
	}

	public void walk() {
		if (canWalk) {
			System.out.println("I am walking");
		} else {
			System.out.println("Cannot walk");
		}
	}

	public void sing() {
		if (canSing) {
			System.out.println("I am singing");
		} else {
			System.out.println("Cannot sing");
		}
	}

}
