package com.drpicox.tests;
import com.drpicox.game.idea.GameDeleteStep_100_Ideas;
import org.junit.Test;

public class GameDeleteStep_100_IdeasTest {

	GameDeleteStep_100_Ideas instance;

	@Test
	public void GameDeleteStep_100_IdeasTestIdeaRepository() {
		try{
			instance = new GameDeleteStep_100_Ideas(/*1*//*IdeaRepository*/null);
		} catch (Exception e) {}
	}

	@Test
	public void executeTestGameFactorySettings() {
		try{
			instance.execute(null);
		} catch (Exception e) {}
	}

	@Test
	public void executeTestSettings() {
		try{
			instance.execute(null);
		} catch (Exception e) {}
	}

}
