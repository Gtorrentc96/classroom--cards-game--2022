package com.drpicox.tests;
import com.drpicox.game.card.CardConstantsCollection;
import org.junit.Test;

public class CardConstantsCollectionTest {

	CardConstantsCollection instance;

	@Test
	public void CardConstantsCollectionTestConstantsLoader() {
		try{
			instance = new CardConstantsCollection(/*1*//*ConstantsLoader*/new com.drpicox.game.constants.ConstantsLoader(
				/*2*/));
		} catch (Exception e) {}
	}

	@Test
	public void getByCardNameTestString() {
		try{
			com.drpicox.game.constants.Constants retorn = instance.getByCardName(" ");
		} catch (Exception e) {}
	}

}
