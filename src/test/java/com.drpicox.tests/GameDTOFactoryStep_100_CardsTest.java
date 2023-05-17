package com.drpicox.tests;
import com.drpicox.game.card.api.GameDTOFactoryStep_100_Cards;
import org.junit.Test;

public class GameDTOFactoryStep_100_CardsTest {

	GameDTOFactoryStep_100_Cards instance;

	@Test
	public void GameDTOFactoryStep_100_CardsTestCardService() {
		try{
			instance = new GameDTOFactoryStep_100_Cards(/*1*//*CardService*/new com.drpicox.game.card.CardService(
				/*2*//*CardRepository*/null,/*TagService*/new com.drpicox.game.tag.TagService(
					/*3*//*TagRepository*/null)));
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
