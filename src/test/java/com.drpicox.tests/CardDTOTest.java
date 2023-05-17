package com.drpicox.tests;
import com.drpicox.game.card.api.CardDTO;
import org.junit.Test;

public class CardDTOTest {

	CardDTO instance;

	@Test
	public void CardDTOTestCard() {
		try{
			instance = new CardDTO(/*1*//*Card*/new com.drpicox.game.card.Card(
				/*2*//*String*/" ",/*String*/" ",/*Map*/new java.util.HashMap<>(),/*List*/new java.util.ArrayList(),/*int*/0,/*int*/0,/*String*/" "));
		} catch (Exception e) {}
	}

	@Test
	public void getNameTest() {
		try{
			java.lang.String retorn = instance.getName();
		} catch (Exception e) {}
	}

	@Test
	public void toStringTest() {
		try{
			java.lang.String retorn = instance.toString();
		} catch (Exception e) {}
	}

	@Test
	public void getIdTest() {
		try{
			java.lang.String retorn = instance.getId();
		} catch (Exception e) {}
	}

	@Test
	public void lambda$new$0TestTag() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("lambda$new$0");
			method.setAccessible(true);
			method.invoke(instance, null);
		} catch (Exception e) {}
	}

	@Test
	public void getPositionTest() {
		try{
			int retorn = instance.getPosition();
		} catch (Exception e) {}
	}

	@Test
	public void getTagTestString() {
		try{
			int retorn = instance.getTag(" ");
		} catch (Exception e) {}
	}

	@Test
	public void getMaxProgressTest() {
		try{
			int retorn = instance.getMaxProgress();
		} catch (Exception e) {}
	}

	@Test
	public void getZindexTest() {
		try{
			int retorn = instance.getZindex();
		} catch (Exception e) {}
	}

	@Test
	public void getProgressTest() {
		try{
			int retorn = instance.getProgress();
		} catch (Exception e) {}
	}

	@Test
	public void getDescriptionTermTestString() {
		try{
			java.lang.String retorn = instance.getDescriptionTerm(" ");
		} catch (Exception e) {}
	}

}
