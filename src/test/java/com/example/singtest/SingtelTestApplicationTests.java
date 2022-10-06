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
import com.example.singtest.animalkingdom.Butterfly;
import com.example.singtest.animalkingdom.Cat;
import com.example.singtest.animalkingdom.Caterpillar;
import com.example.singtest.animalkingdom.Chicken;
import com.example.singtest.animalkingdom.ClownFish;
import com.example.singtest.animalkingdom.Dog;
import com.example.singtest.animalkingdom.Dolphin;
import com.example.singtest.animalkingdom.Duck;
import com.example.singtest.animalkingdom.Fish;
import com.example.singtest.animalkingdom.Frog;
import com.example.singtest.animalkingdom.LivingWith;
import com.example.singtest.animalkingdom.Parrot;
import com.example.singtest.animalkingdom.Rooster;
import com.example.singtest.animalkingdom.Shark;

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
	
	@Test
	void testSharksSize() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		Fish shark = new Shark();
		shark.size();
		Assert.assertEquals("Size is large\n", outContent.toString());
	}

	@Test
	void testSharksColor() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		Fish shark = new Shark();
		shark.color();
		Assert.assertEquals("Color is grey\n", outContent.toString());
	}

	@Test
	void testClownFishSize() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		Fish shark = new ClownFish();
		shark.size();
		Assert.assertEquals("Size is small\n", outContent.toString());
	}

	@Test
	void testClownFishColor() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		Fish shark = new ClownFish();
		shark.color();
		Assert.assertEquals("Color is orange\n", outContent.toString());
	}
	
	@Test
	void testFishMakeJokes() {
		Fish fish = new ClownFish();
		Assert.assertTrue(fish.isCanMakeJokes());
	}

	@Test
	void testSharksEatOtherFish() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		Fish shark = new Shark();
		shark.eatOtherFish();
		Assert.assertEquals("Eats other Fish\n", outContent.toString());
	}
	
	@Test
	void testDolphinSwims() {
		Fish dolphin = new Dolphin().getDolphin();
		Assert.assertTrue(dolphin.isCanSwim());
	}
	
	@Test
	void testButterFlyFlies() {
		Animal butterfly = new Butterfly();
		Assert.assertTrue(butterfly.isCanFly());
	}

	@Test
	void testButterFlyDoesntSound() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		Animal butterfly = new Butterfly();
		butterfly.makesound();
		Assert.assertEquals("Doesn't make sound\n", outContent.toString());
	}
	
	@Test
	void testCaterPillarcannotFly() {
		Animal catterpillar = new Caterpillar();
		Assert.assertFalse(catterpillar.isCanFly());
	}

	@Test
	void testCaterPillarWalk() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		Animal caterpillar = new Caterpillar();
		caterpillar.walk();
		Assert.assertEquals("I am walking\n", outContent.toString());
	}
	
	@Test
	void testcountAnimal() {
		Animal[] animals = new Animal[] { new Bird(), new Duck(), new Chicken(), new Rooster(), new Parrot(),
				new Fish(), new Shark(), new ClownFish(), new Dolphin(), new Frog(), new Dog(), new Butterfly(),
				new Cat() };
		int totalSwim = 0;
		int totalFly = 0;
		int totalWalk = 0;
		int totalSing = 0;
		for (Animal anim : animals) {
			if (anim.isCanFly()) {
				totalFly++;
			}
			if (anim.isCanSwim()) {
				totalSwim++;
			}
			if (anim.isCanWalk()) {
				totalWalk++;
			}
			if (anim.isCanSing()) {
				totalSing++;
			}
		}
		Assert.assertTrue(totalFly == 4);
		Assert.assertTrue(totalSwim == 4);
		Assert.assertTrue(totalWalk == 8);
		Assert.assertTrue(totalSing == 5);
	}
	
	@Test
	void testRoosterLanguages() {
		Animal rooster = new Rooster();
		Animal roosterDanish = new Rooster("Danish");
		Animal roosterDutch = new Rooster("Dutch");
		Animal roosterFinnish = new Rooster("Finnish");
		Animal roosterFrench = new Rooster("French");
		Animal roosterGerman = new Rooster("German");
		Animal roosterGreek = new Rooster("Greek");
		Animal roosterHebrew = new Rooster("Hebrew");
		Animal roosterHungarian = new Rooster("Hungarian");
		Animal roosterItalian = new Rooster("Italian");
		Animal roosterJapanese = new Rooster("Japanese");
		Animal roosterPortuguese = new Rooster("Portuguese");
		Animal roosterRussian = new Rooster("Russian");
		Animal roosterSwedish = new Rooster("Swedish");
		Animal roosterTurkish = new Rooster("Turkish");
		Animal roosterUrdu = new Rooster("Urdu");
		Assert.assertEquals("Cock-a-doodle-doo", rooster.getSound());
		Assert.assertEquals("kykyliky", roosterDanish.getSound());
		Assert.assertEquals("kukeleku", roosterDutch.getSound());
		Assert.assertEquals("kukko kiekuu", roosterFinnish.getSound());
		Assert.assertEquals("cocorico", roosterFrench.getSound());
		Assert.assertEquals("kikeriki", roosterGerman.getSound());
		Assert.assertEquals("kikiriki", roosterGreek.getSound());
		Assert.assertEquals("coo- koo - ri-koo", roosterHebrew.getSound());
		Assert.assertEquals("kukuriku", roosterHungarian.getSound());
		Assert.assertEquals("chicchirichi", roosterItalian.getSound());
		Assert.assertEquals("ko - ke - kok - ko -o", roosterJapanese.getSound());
		Assert.assertEquals("cucurucu", roosterPortuguese.getSound());
		Assert.assertEquals("kukareku", roosterRussian.getSound());
		Assert.assertEquals("kuckeliku", roosterSwedish.getSound());
		Assert.assertEquals("kuk-kurri-kuuu", roosterTurkish.getSound());
		Assert.assertEquals("kuklooku", roosterUrdu.getSound());
	}

}
