package com.drpicox.tests;
import com.drpicox.game.idea.GameFactoryStep_100_Ideas;
import org.junit.Test;

public class GameFactoryStep_100_IdeasTest {

	GameFactoryStep_100_Ideas instance;

	@Test
	public void GameFactoryStep_100_IdeasTestIdeaFactory() {
		try{
			instance = new GameFactoryStep_100_Ideas(/*1*//*IdeaFactory*/new com.drpicox.game.idea.IdeaFactory(
				/*2*//*IdeaRepository*/null,/*CardConstantsCollection*/new com.drpicox.game.card.CardConstantsCollection(
					/*3*//*ConstantsLoader*/new com.drpicox.game.constants.ConstantsLoader(
						/*4*/))));
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
