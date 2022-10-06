package com.example.singtest.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.singtest.animalkingdom.Animal;
import com.example.singtest.animalkingdom.Bird;
import com.example.singtest.animalkingdom.Butterfly;
import com.example.singtest.animalkingdom.Cat;
import com.example.singtest.animalkingdom.Chicken;
import com.example.singtest.animalkingdom.ClownFish;
import com.example.singtest.animalkingdom.Dog;
import com.example.singtest.animalkingdom.Dolphin;
import com.example.singtest.animalkingdom.Duck;
import com.example.singtest.animalkingdom.Fish;
import com.example.singtest.animalkingdom.Frog;
import com.example.singtest.animalkingdom.Parrot;
import com.example.singtest.animalkingdom.Rooster;
import com.example.singtest.animalkingdom.Shark;
import com.example.singtest.exception.AnimalException;
import com.example.singtest.vo.AnimalResponse;

@RestController
public class AnimalController {

	static Map<String, Animal> animalMap;

	static {
		animalMap = new HashMap<>();
		animalMap.put("Bird", new Bird());
		animalMap.put("Duck", new Duck());
		animalMap.put("Chicken", new Chicken());
		animalMap.put("Rooster", new Rooster());
		animalMap.put("Parrot", new Parrot());
		animalMap.put("Fish", new Fish());
		animalMap.put("Shark", new Shark());
		animalMap.put("ClownFish", new ClownFish());
		animalMap.put("Dolphin", (new Dolphin().getDolphin()));
		animalMap.put("Frog", new Frog());
		animalMap.put("Dog", new Dog());
		animalMap.put("Butterfly", new Butterfly());
		animalMap.put("Cat", new Cat());
	}

	@GetMapping("/animal/{name}")
	public ResponseEntity<AnimalResponse> get(@PathVariable String name) throws AnimalException {
		return new ResponseEntity<>(new AnimalResponse(true, null, getAnimal(name)), HttpStatus.OK);
	}

	private Object getAnimal(String animalName) throws AnimalException {
		if (animalMap.containsKey(animalName)) {
			return animalMap.get(animalName);
		} else {
			throw new AnimalException("E0000", "Animal not found", "Animal not found");
		}
	}

}
