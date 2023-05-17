package com.drpicox.tests;
import com.drpicox.game.card.GameFactoryStep_100_Cards;
import org.junit.Test;

public class GameFactoryStep_100_CardsTest {

	GameFactoryStep_100_Cards instance;

	@Test
	public void GameFactoryStep_100_CardsTestCardFactory() {
		try{
			instance = new GameFactoryStep_100_Cards(/*1*//*CardFactory*/new com.drpicox.game.card.CardFactory(
				/*2*//*CardService*/new com.drpicox.game.card.CardService(
					/*3*//*CardRepository*/null,/*TagService*/new com.drpicox.game.tag.TagService(
						/*4*//*TagRepository*/null)),/*CardRepository*/null,/*CardPositionService*/new com.drpicox.game.card.CardPositionService(
					/*3*//*CardRepository*/null,/*CardService*/new com.drpicox.game.card.CardService(
						/*4*//*CardRepository*/null,/*TagService*/new com.drpicox.game.tag.TagService(
							/*5*//*TagRepository*/null))),/*TagFactory*/new com.drpicox.game.tag.TagFactory(
					/*3*//*TagRepository*/null),/*CardConstantsCollection*/new com.drpicox.game.card.CardConstantsCollection(
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
