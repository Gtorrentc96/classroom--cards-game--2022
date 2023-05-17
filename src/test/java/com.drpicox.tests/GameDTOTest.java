package com.drpicox.tests;
import com.drpicox.game.game.api.GameDTO;
import org.junit.Test;

public class GameDTOTest {

	GameDTO instance;

	@Test
	public void GameDTOTest() {
		try{
			instance = new GameDTO(/*1*/);
		} catch (Exception e) {}
	}

	@Test
	public void getFieldTestStringClass() {
		try{
			java.lang.Object retorn = instance.getField(" ", null);
		} catch (Exception e) {}
	}

}
