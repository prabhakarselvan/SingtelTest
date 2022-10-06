package com.example.singtest.animalkingdom;

public class Caterpillar extends Animal {

	public Caterpillar() {
		super.canWalk = true;
	}

	public Butterfly transform() {
		return new Butterfly();
	}

}
