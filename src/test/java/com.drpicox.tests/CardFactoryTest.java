package com.drpicox.tests;
import com.drpicox.game.card.CardFactory;
import org.junit.Test;

public class CardFactoryTest {

	CardFactory instance;

	@Test
	public void CardFactoryTestCardServiceCardRepositoryCardPositionServiceTagFactoryCardConstantsCollection() {
		try{
			instance = new CardFactory(/*1*//*CardService*/new com.drpicox.game.card.CardService(
				/*2*//*CardRepository*/null,/*TagService*/new com.drpicox.game.tag.TagService(
					/*3*//*TagRepository*/null)),/*CardRepository*/null,/*CardPositionService*/new com.drpicox.game.card.CardPositionService(
				/*2*//*CardRepository*/null,/*CardService*/new com.drpicox.game.card.CardService(
					/*3*//*CardRepository*/null,/*TagService*/new com.drpicox.game.tag.TagService(
						/*4*//*TagRepository*/null))),/*TagFactory*/new com.drpicox.game.tag.TagFactory(
				/*2*//*TagRepository*/null),/*CardConstantsCollection*/new com.drpicox.game.card.CardConstantsCollection(
				/*2*//*ConstantsLoader*/new com.drpicox.game.constants.ConstantsLoader(
					/*3*/)));
		} catch (Exception e) {}
	}

	@Test
	public void makeCardTestCardFactorySettings() {
		try{
			com.drpicox.game.card.Card retorn = instance.makeCard(null);
		} catch (Exception e) {}
	}

	@Test
	public void getCardDescriptionTestCardFactorySettings() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("getCardDescription");
			method.setAccessible(true);
			java.util.Map retorn = (java.util.Map)method.invoke(instance, null);
		} catch (Exception e) {}
	}

	@Test
	public void getNextIdTestCardFactorySettings() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("getNextId");
			method.setAccessible(true);
			java.lang.String retorn = (java.lang.String)method.invoke(instance, null);
		} catch (Exception e) {}
	}

	@Test
	public void makeCardsTestintCardFactorySettings() {
		try{
			instance.makeCards(0, null);
		} catch (Exception e) {}
	}

	@Test
	public void lambda$getNextId$0TestCard() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("lambda$getNextId$0");
			method.setAccessible(true);
			java.lang.String retorn = (java.lang.String)method.invoke(instance, null);
		} catch (Exception e) {}
	}

	@Test
	public void lambda$getNextId$1TestStringString() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("lambda$getNextId$1");
			method.setAccessible(true);
			java.lang.String retorn = (java.lang.String)method.invoke(instance, " ", " ");
		} catch (Exception e) {}
	}

	@Test
	public void lambda$getNextId$2TestString() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("lambda$getNextId$2");
			method.setAccessible(true);
			java.lang.Integer retorn = (java.lang.Integer)method.invoke(instance, " ");
		} catch (Exception e) {}
	}

	@Test
	public void replaceCardTestCardString() {
		try{
			instance.replaceCard(null, " ");
		} catch (Exception e) {}
	}

}
