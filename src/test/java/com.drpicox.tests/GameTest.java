package com.drpicox.tests;
import com.drpicox.game.game.Game;
import org.junit.Test;

public class GameTest {

	Game instance;

	@Test
	public void GameTestString() {
		try{
			instance = new Game(/*1*//*String*/" ");
		} catch (Exception e) {}
	}

}
