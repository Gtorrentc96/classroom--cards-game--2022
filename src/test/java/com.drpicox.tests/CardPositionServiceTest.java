package com.drpicox.tests;
import com.drpicox.game.card.CardPositionService;
import org.junit.Test;

public class CardPositionServiceTest {

	CardPositionService instance;

	@Test
	public void CardPositionServiceTestCardRepositoryCardService() {
		try{
			instance = new CardPositionService(/*1*//*CardRepository*/null,/*CardService*/new com.drpicox.game.card.CardService(
				/*2*//*CardRepository*/null,/*TagService*/new com.drpicox.game.tag.TagService(
					/*3*//*TagRepository*/null)));
		} catch (Exception e) {}
	}

	@Test
	public void getCardFreePositionTest() {
		try{
			int retorn = instance.getCardFreePosition();
		} catch (Exception e) {}
	}

	@Test
	public void getMaxPositionTest() {
		try{
			int retorn = instance.getMaxPosition();
		} catch (Exception e) {}
	}

	@Test
	public void moveCardTestCardCard() {
		try{
			instance.moveCard(null, null);
		} catch (Exception e) {}
	}

	@Test
	public void moveCardTestCardintint() {
		try{
			instance.moveCard(null, 0, 0);
		} catch (Exception e) {}
	}

	@Test
	public void moveCardTestCardint() {
		try{
			instance.moveCard(null, 0);
		} catch (Exception e) {}
	}

	@Test
	public void getStackByPositionTestint() {
		try{
			com.drpicox.game.card.Stack retorn = instance.getStackByPosition(0);
		} catch (Exception e) {}
	}

}
