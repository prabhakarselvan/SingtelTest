package com.example.singtest.animalkingdom;

public abstract class Animal {

	boolean canFly;
	boolean canSwim;
	boolean canWalk;
	String sound;
	boolean canSing;

	public void swim() {
		if (canSwim) {
			System.out.println("I can swim");
		} else {
			System.out.println("I cannot swim");
		}
	}

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

	public void makesound() {
		if (null != sound && !"".equalsIgnoreCase(sound.trim())) {
			System.out.println(sound);
		}else {
			System.out.println("Doesn't make sound");
		}
	}

	public void sing() {
		if (canSing) {
			System.out.println("I am singing");
		} else {
			System.out.println("Cannot sing");
		}
	}

	public boolean isCanFly() {
		return canFly;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

	public boolean isCanSwim() {
		return canSwim;
	}

	public void setCanSwim(boolean canSwim) {
		this.canSwim = canSwim;
	}

	public boolean isCanWalk() {
		return canWalk;
	}

	public void setCanWalk(boolean canWalk) {
		this.canWalk = canWalk;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public boolean isCanSing() {
		return canSing;
	}

	public void setCanSing(boolean canSing) {
		this.canSing = canSing;
	}

}
