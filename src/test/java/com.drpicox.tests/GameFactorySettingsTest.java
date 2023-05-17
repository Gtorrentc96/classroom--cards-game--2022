package com.drpicox.tests;
import com.drpicox.game.game.GameFactorySettings;
import org.junit.Test;

public class GameFactorySettingsTest {

	GameFactorySettings instance;

	GameFactorySettings instance2;

	@Test
	public void GameFactorySettingsTest() {
		try{
			instance = new GameFactorySettings(/*1*/);
		} catch (Exception e) {}
	}

	@Test
	public void GameFactorySettingsTestString() {
		try{
			instance2 = new GameFactorySettings(/*1*//*String*/" ");
		} catch (Exception e) {}
	}

	@Test
	public void getGameNameTest() {
		try{
			java.lang.String retorn = instance.getGameName();
		} catch (Exception e) {}
	}

	@Test
	public void withGameConstantsTestConstants() {
		try{
			com.drpicox.game.game.GameFactorySettings retorn = instance.withGameConstants(null);
		} catch (Exception e) {}
	}

	@Test
	public void getGameConstantsTest() {
		try{
			com.drpicox.game.constants.Constants retorn = instance.getGameConstants();
		} catch (Exception e) {}
	}

}
