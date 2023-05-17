package com.drpicox.tests;
import com.drpicox.game.card.api.CardController;
import org.junit.Test;

public class CardControllerTest {

	CardController instance;

	@Test
	public void CardControllerTestCardServiceCardPositionServiceGameDTOFactory() {
		try{
			instance = new CardController(/*1*//*CardService*/new com.drpicox.game.card.CardService(
				/*2*//*CardRepository*/null,/*TagService*/new com.drpicox.game.tag.TagService(
					/*3*//*TagRepository*/null)),/*CardPositionService*/new com.drpicox.game.card.CardPositionService(
				/*2*//*CardRepository*/null,/*CardService*/new com.drpicox.game.card.CardService(
					/*3*//*CardRepository*/null,/*TagService*/new com.drpicox.game.tag.TagService(
						/*4*//*TagRepository*/null))),/*GameDTOFactory*/new com.drpicox.game.game.api.GameDTOFactory(
				/*2*//*List*/new java.util.ArrayList()));
		} catch (Exception e) {}
	}

	@Test
	public void moveCardTestStringMoveCardDTO() {
		try{
			com.drpicox.game.game.api.GameDTO retorn = instance.moveCard(" ", null);
		} catch (Exception e) {}
	}

	@Test
	public void discardCardTestString() {
		try{
			com.drpicox.game.game.api.GameDTO retorn = instance.discardCard(" ");
		} catch (Exception e) {}
	}

}
