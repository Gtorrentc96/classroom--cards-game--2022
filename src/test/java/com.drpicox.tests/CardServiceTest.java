package com.drpicox.tests;
import com.drpicox.game.card.CardService;
import org.junit.Test;

public class CardServiceTest {

	CardService instance;

	@Test
	public void CardServiceTestCardRepositoryTagService() {
		try{
			instance = new CardService(/*1*//*CardRepository*/null,/*TagService*/new com.drpicox.game.tag.TagService(
				/*2*//*TagRepository*/null));
		} catch (Exception e) {}
	}

	@Test
	public void findAllTest() {
		try{
			java.util.List retorn = instance.findAll();
		} catch (Exception e) {}
	}

	@Test
	public void lambda$findAllByTagName$0TestTag() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("lambda$findAllByTagName$0");
			method.setAccessible(true);
			java.lang.String retorn = (java.lang.String)method.invoke(instance, null);
		} catch (Exception e) {}
	}

	@Test
	public void findByIdTestString() {
		try{
			java.util.Optional retorn = instance.findById(" ");
		} catch (Exception e) {}
	}

	@Test
	public void findAllByTagNameTestString() {
		try{
			java.util.List retorn = instance.findAllByTagName(" ");
		} catch (Exception e) {}
	}

	@Test
	public void findAllCardsTestPredicate() {
		try{
			java.util.List retorn = instance.findAllCards(null);
		} catch (Exception e) {}
	}

	@Test
	public void findCardTestPredicate() {
		try{
			java.util.Optional retorn = instance.findCard(null);
		} catch (Exception e) {}
	}

	@Test
	public void discardCardsTestList() {
		try{
			instance.discardCards(null);
		} catch (Exception e) {}
	}

	@Test
	public void progressCardTestCardint() {
		try{
			int retorn = instance.progressCard(null, 0);
		} catch (Exception e) {}
	}

	@Test
	public void findAllByNameTestString() {
		try{
			java.util.List retorn = instance.findAllByName(" ");
		} catch (Exception e) {}
	}

	@Test
	public void discardCardTestCard() {
		try{
			instance.discardCard(null);
		} catch (Exception e) {}
	}

}
