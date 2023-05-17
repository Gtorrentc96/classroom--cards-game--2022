package com.drpicox.tests;
import com.drpicox.game.card.GameDeleteStep_100_Cards;
import org.junit.Test;

public class GameDeleteStep_100_CardsTest {

	GameDeleteStep_100_Cards instance;

	@Test
	public void GameDeleteStep_100_CardsTestCardRepository() {
		try{
			instance = new GameDeleteStep_100_Cards(/*1*//*CardRepository*/null);
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
