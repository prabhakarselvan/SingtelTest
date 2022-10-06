package com.example.singtest;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.singtest.animalkingdom.Animal;
import com.example.singtest.animalkingdom.Bird;
import com.example.singtest.animalkingdom.Cat;
import com.example.singtest.animalkingdom.Chicken;
import com.example.singtest.animalkingdom.Dog;
import com.example.singtest.animalkingdom.Duck;
import com.example.singtest.animalkingdom.Fish;
import com.example.singtest.animalkingdom.LivingWith;
import com.example.singtest.animalkingdom.Parrot;
import com.example.singtest.animalkingdom.Rooster;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class SingtelTestApplicationTests {
	
	@Test
	void contextLoads() {
	}

	@Test
	void testBirdSinging() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		Animal bird = new Bird();
		bird.sing();
		Assert.assertEquals("I am singing\n", outContent.toString());
	}
	
	@Test
	void testDuckSound() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		Animal duck = new Duck();
		duck.makesound();
		Assert.assertEquals("Quack , quack\n", outContent.toString());
	}

	@Test
	void testDuckSwim() {
		Animal duck = new Duck();
		Assert.assertTrue(duck.isCanSwim());
	}

	@Test
	void testChickenSound() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		Animal duck = new Chicken();
		duck.makesound();
		Assert.assertEquals("Cluck, cluck\n", outContent.toString());
	}

	@Test
	void testChickenFly() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		Animal chicken = new Chicken();
		chicken.fly();
		Assert.assertEquals("I cannot fly\n", outContent.toString());
	}
	
	@Test
	void testRoosterSound() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		Animal rooster = new Rooster();
		rooster.makesound();
		Assert.assertEquals("Cock-a-doodle-doo\n", outContent.toString());
	}

	@Test
	void testRoosterChickenRelation() {
		Animal rooster = new Rooster();
		Assert.assertTrue(rooster instanceof Chicken);
	}
	
	@Test
	void testParrotLivingWithDog() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		Animal parrotLivingWithDog = new Parrot(new Dog());
		parrotLivingWithDog.makesound();
		Assert.assertEquals("Woof, woof\n", outContent.toString());
	}

	@Test
	void testParrotLivingWithCat() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		Animal parrotLivingWithCat = new Parrot(new Cat());
		parrotLivingWithCat.makesound();
		Assert.assertEquals("Me ow\n", outContent.toString());
	}

	@Test
	void testParrotLivingWithRooster() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		Animal parrotLivingWithRooster = new Parrot(new Rooster());
		parrotLivingWithRooster.makesound();
		Assert.assertEquals("Cock-a-doodle-doo\n", outContent.toString());
	}

	@Test
	void testParrotLivingWithDoorRing() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		Animal parrotLivingWithRooster = new Parrot(new LivingWith() {
			@Override
			public String getSound() {
				return "Knock Knock";
			}
		});
		parrotLivingWithRooster.makesound();
		Assert.assertEquals("Knock Knock\n", outContent.toString());
	}
	
	@Test
	void testFishDontSing() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		Animal fish = new Fish();
		fish.sing();
		Assert.assertEquals("Cannot sing\n", outContent.toString());
	}

	@Test
	void testFishDontWalk() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		Animal fish = new Fish();
		fish.walk();
		Assert.assertEquals("Cannot walk\n", outContent.toString());
	}

	@Test
	void testFishCanSwim() {
		Animal fish = new Fish();
		Assert.assertTrue(fish.isCanSwim());
	}

}
