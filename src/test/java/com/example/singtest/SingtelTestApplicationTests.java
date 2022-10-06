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
import com.example.singtest.animalkingdom.Chicken;
import com.example.singtest.animalkingdom.Duck;
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

}
