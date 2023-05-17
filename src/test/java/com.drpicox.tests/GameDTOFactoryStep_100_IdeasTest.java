package com.drpicox.tests;
import com.drpicox.game.idea.api.GameDTOFactoryStep_100_Ideas;
import org.junit.Test;

public class GameDTOFactoryStep_100_IdeasTest {

	GameDTOFactoryStep_100_Ideas instance;

	@Test
	public void GameDTOFactoryStep_100_IdeasTestIdeaService() {
		try{
			instance = new GameDTOFactoryStep_100_Ideas(/*1*//*IdeaService*/new com.drpicox.game.idea.IdeaService(
				/*2*//*IdeaRepository*/null));
		} catch (Exception e) {}
	}

	@Test
	public void executeTestGameDTOFactorySettings() {
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
