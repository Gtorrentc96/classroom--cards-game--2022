package com.drpicox.tests;
import com.drpicox.game.game.api.GameDTOFactory;
import org.junit.Test;

public class GameDTOFactoryTest {

	GameDTOFactory instance;

	@Test
	public void GameDTOFactoryTestList() {
		try{
			instance = new GameDTOFactory(/*1*//*List*/new java.util.ArrayList());
		} catch (Exception e) {}
	}

	@Test
	public void makeGameDTOTest() {
		try{
			com.drpicox.game.game.api.GameDTO retorn = instance.makeGameDTO();
		} catch (Exception e) {}
	}

}
