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

}
