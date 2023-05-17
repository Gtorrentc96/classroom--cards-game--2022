package com.drpicox.tests;
import com.drpicox.game.game.api.GameController;
import org.junit.Test;

public class GameControllerTest {

	GameController instance;

	@Test
	public void GameControllerTestGameServiceGameFactoryMoonServiceGameDTOFactory() {
		try{
			instance = new GameController(/*1*//*GameService*/new com.drpicox.game.game.GameService(
				/*2*//*GameRepository*/null),/*GameFactory*/new com.drpicox.game.game.GameFactory(
				/*2*//*ConstantsLoader*/new com.drpicox.game.constants.ConstantsLoader(
					/*3*/),/*GameRepository*/null,/*List*/new java.util.ArrayList(),/*List*/new java.util.ArrayList()),/*MoonService*/new com.drpicox.game.moon.MoonService(
				/*2*//*List*/new java.util.ArrayList()),/*GameDTOFactory*/new com.drpicox.game.game.api.GameDTOFactory(
				/*2*//*List*/new java.util.ArrayList()));
		} catch (Exception e) {}
	}

	@Test
	public void getGameTest() {
		try{
			com.drpicox.game.game.api.GameDTO retorn = instance.getGame();
		} catch (Exception e) {}
	}

	@Test
	public void endMoonTest() {
		try{
			com.drpicox.game.game.api.GameDTO retorn = instance.endMoon();
		} catch (Exception e) {}
	}

}
