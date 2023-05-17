package com.drpicox.tests;
import com.drpicox.game.card.api.CardListDTO;
import org.junit.Test;

public class CardListDTOTest {

	CardListDTO instance;

	@Test
	public void CardListDTOTestList() {
		try{
			instance = new CardListDTO(/*1*//*List*/new java.util.ArrayList());
		} catch (Exception e) {}
	}

	@Test
	public void lambda$new$0TestCard() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("lambda$new$0");
			method.setAccessible(true);
			method.invoke(instance, null);
		} catch (Exception e) {}
	}

	@Test
	public void getCardTestGameDTOPredicate() {
		try{
			com.drpicox.game.card.api.CardDTO retorn = CardListDTO.getCard(null, null);
		} catch (Exception e) {}
	}

	@Test
	public void lambda$new$1TestCardDTOCardDTO() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("lambda$new$1");
			method.setAccessible(true);
			int retorn = (int)method.invoke(instance, null, null);
		} catch (Exception e) {}
	}

	@Test
	public void findAllCardTestGameDTO() {
		try{
			java.util.List retorn = CardListDTO.findAllCard(null);
		} catch (Exception e) {}
	}

	@Test
	public void findAllCardTestGameDTOPredicate() {
		try{
			java.util.List retorn = CardListDTO.findAllCard(null, null);
		} catch (Exception e) {}
	}

}
