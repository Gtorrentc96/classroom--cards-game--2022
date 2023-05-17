package com.drpicox.tests;
import com.drpicox.game.game.GameService;
import org.junit.Test;

public class GameServiceTest {

	GameService instance;

	@Test
	public void GameServiceTestGameRepository() {
		try{
			instance = new GameService(/*1*//*GameRepository*/null);
		} catch (Exception e) {}
	}

	@Test
	public void existsGameTest() {
		try{
			boolean retorn = instance.existsGame();
		} catch (Exception e) {}
	}

}
