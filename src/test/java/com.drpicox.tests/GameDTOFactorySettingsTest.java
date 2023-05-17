package com.drpicox.tests;
import com.drpicox.game.game.api.GameDTOFactorySettings;
import org.junit.Test;

public class GameDTOFactorySettingsTest {

	GameDTOFactorySettings instance;

	@Test
	public void GameDTOFactorySettingsTestGameDTO() {
		try{
			instance = new GameDTOFactorySettings(/*1*//*GameDTO*/new com.drpicox.game.game.api.GameDTO(
				/*2*/));
		} catch (Exception e) {}
	}

	@Test
	public void getGameDTOTest() {
		try{
			com.drpicox.game.game.api.GameDTO retorn = instance.getGameDTO();
		} catch (Exception e) {}
	}

}
