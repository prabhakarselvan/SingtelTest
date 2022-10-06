package com.example.singtest.animalkingdom;

import java.util.HashMap;
import java.util.Map;

public class Rooster extends Chicken implements LivingWith {

	private static Map<String, String> roosterLangMap;

	static {
		roosterLangMap = new HashMap<>();
		roosterLangMap.put("Danish", "kykyliky");
		roosterLangMap.put("Dutch", "kukeleku");
		roosterLangMap.put("Finnish", "kukko kiekuu");
		roosterLangMap.put("French", "cocorico");
		roosterLangMap.put("German", "kikeriki");
		roosterLangMap.put("Greek", "kikiriki");
		roosterLangMap.put("Hebrew", "coo- koo - ri-koo");
		roosterLangMap.put("Hungarian", "kukuriku");
		roosterLangMap.put("Italian", "chicchirichi");
		roosterLangMap.put("Japanese", "ko - ke - kok - ko -o");
		roosterLangMap.put("Portuguese", "cucurucu");
		roosterLangMap.put("Russian", "kukareku");
		roosterLangMap.put("Swedish", "kuckeliku");
		roosterLangMap.put("Turkish", "kuk-kurri-kuuu");
		roosterLangMap.put("Urdu", "kuklooku");
	}

	private String roosterSound;

	public Rooster() {
		super.sound = "Cock-a-doodle-doo";
		this.roosterSound = super.sound;
	}

	public Rooster(String language) {
		if (null != language && !"".equalsIgnoreCase(language) && roosterLangMap.containsKey(language)) {
			super.sound = roosterLangMap.get(language);
		} else {
			super.sound = "Cock-a-doodle-doo";
		}
		this.roosterSound = super.sound;
	}

	@Override
	public String getSound() {
		return roosterSound;
	}

}
