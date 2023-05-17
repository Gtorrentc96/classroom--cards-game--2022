package com.drpicox.tests;
import com.drpicox.game.card.CardListSummary;
import org.junit.Test;

public class CardListSummaryTest {

	CardListSummary instance;

	@Test
	public void CardListSummaryTestList() {
		try{
			instance = new CardListSummary(/*1*//*List*/new java.util.ArrayList());
		} catch (Exception e) {}
	}

	@Test
	public void getCardByDescriptionTermAndTagNameTestStringString() {
		try{
			com.drpicox.game.card.Card retorn = instance.getCardByDescriptionTermAndTagName(" ", " ");
		} catch (Exception e) {}
	}

	@Test
	public void lambda$sumTagValue$0TestStringCard() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("lambda$sumTagValue$0");
			method.setAccessible(true);
			int retorn = (int)method.invoke(instance, " ", null);
		} catch (Exception e) {}
	}

	@Test
	public void lambda$findAllCardByDescriptionTermAndTagName$2TestStringCard() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("lambda$findAllCardByDescriptionTermAndTagName$2");
			method.setAccessible(true);
			boolean retorn = (boolean)method.invoke(instance, " ", null);
		} catch (Exception e) {}
	}

	@Test
	public void lambda$findAllCardByDescriptionTermAndTagName$1TestStringCard() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("lambda$findAllCardByDescriptionTermAndTagName$1");
			method.setAccessible(true);
			boolean retorn = (boolean)method.invoke(instance, " ", null);
		} catch (Exception e) {}
	}

	@Test
	public void findAllCardByDescriptionTermAndTagNameTestStringString() {
		try{
			java.util.List retorn = instance.findAllCardByDescriptionTermAndTagName(" ", " ");
		} catch (Exception e) {}
	}

	@Test
	public void sumTagValueTestString() {
		try{
			int retorn = instance.sumTagValue(" ");
		} catch (Exception e) {}
	}

}
