package com.drpicox.tests;
import com.drpicox.game.idea.IdeaEndMoonSettings;
import org.junit.Test;

public class IdeaEndMoonSettingsTest {

	IdeaEndMoonSettings instance;

	@Test
	public void IdeaEndMoonSettingsTestEndMoonSettingsIdea() {
		try{
			instance = new IdeaEndMoonSettings(/*1*//*EndMoonSettings*/new com.drpicox.game.moon.EndMoonSettings(
				/*2*/),/*Idea*/new com.drpicox.game.idea.Idea(
				/*2*//*String*/" ",/*String*/" ",/*int*/0,/*int*/0,/*List*/new java.util.ArrayList(),/*List*/new java.util.ArrayList()));
		} catch (Exception e) {}
	}

	@Test
	public void getStackTest() {
		try{
			com.drpicox.game.card.Stack retorn = instance.getStack();
		} catch (Exception e) {}
	}

	@Test
	public void getPositionTest() {
		try{
			int retorn = instance.getPosition();
		} catch (Exception e) {}
	}

	@Test
	public void getIdeaCardTest() {
		try{
			com.drpicox.game.card.Card retorn = instance.getIdeaCard();
		} catch (Exception e) {}
	}

	@Test
	public void withStackTestStack() {
		try{
			com.drpicox.game.idea.IdeaEndMoonSettings retorn = instance.withStack(null);
		} catch (Exception e) {}
	}

	@Test
	public void getIdeaTest() {
		try{
			com.drpicox.game.idea.Idea retorn = instance.getIdea();
		} catch (Exception e) {}
	}

	@Test
	public void getSummaryTest() {
		try{
			com.drpicox.game.card.CardListSummary retorn = instance.getSummary();
		} catch (Exception e) {}
	}

}
