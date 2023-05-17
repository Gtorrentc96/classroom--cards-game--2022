package com.drpicox.tests;
import com.drpicox.game.moon.EndMoonSettings;
import org.junit.Test;

public class EndMoonSettingsTest {

	EndMoonSettings instance;

	@Test
	public void EndMoonSettingsTest() {
		try{
			instance = new EndMoonSettings(/*1*/);
		} catch (Exception e) {}
	}

}
