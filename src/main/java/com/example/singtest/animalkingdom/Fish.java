package com.example.singtest.animalkingdom;

public class Fish extends Animal {

	String size;
	String color;
	boolean canMakeJokes;
	boolean eatOtherFish;

	public Fish() {
		super.canSwim = true;
	}

	public void size() {
		System.out.println("Size is " + size);
	}

	public void color() {
		System.out.println("Color is " + color);
	}

	public void canMakeJokes() {
		if (canMakeJokes) {
			System.out.println("CanMakeJokes");
		} else {
			System.out.println("CannotMakeJokes");
		}
	}

	public void eatOtherFish() {
		if (eatOtherFish) {
			System.out.println("Eats other Fish");
		}
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isCanMakeJokes() {
		return canMakeJokes;
	}

	public void setCanMakeJokes(boolean canMakeJokes) {
		this.canMakeJokes = canMakeJokes;
	}

	public boolean isEatOtherFish() {
		return eatOtherFish;
	}

	public void setEatOtherFish(boolean eatOtherFish) {
		this.eatOtherFish = eatOtherFish;
	}

}
