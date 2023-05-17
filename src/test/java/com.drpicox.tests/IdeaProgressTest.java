package com.drpicox.tests;
import com.drpicox.game.idea.IdeaProgress;
import org.junit.Test;

public class IdeaProgressTest {

	IdeaProgress instance;

	IdeaProgress instance2;

	@Test
	public void IdeaProgressTestIdeaCardint() {
		try{
			instance = new IdeaProgress(/*1*//*Idea*/new com.drpicox.game.idea.Idea(
				/*2*//*String*/" ",/*String*/" ",/*int*/0,/*int*/0,/*List*/new java.util.ArrayList(),/*List*/new java.util.ArrayList()),/*Card*/new com.drpicox.game.card.Card(
				/*2*//*String*/" ",/*String*/" ",/*Map*/new java.util.HashMap<>(),/*List*/new java.util.ArrayList(),/*int*/0,/*int*/0,/*String*/" "),/*int*/0);
		} catch (Exception e) {}
	}

	@Test
	public void IdeaProgressTestIdeaCard() {
		try{
			instance2 = new IdeaProgress(/*1*//*Idea*/new com.drpicox.game.idea.Idea(
				/*2*//*String*/" ",/*String*/" ",/*int*/0,/*int*/0,/*List*/new java.util.ArrayList(),/*List*/new java.util.ArrayList()),/*Card*/new com.drpicox.game.card.Card(
				/*2*//*String*/" ",/*String*/" ",/*Map*/new java.util.HashMap<>(),/*List*/new java.util.ArrayList(),/*int*/0,/*int*/0,/*String*/" "));
		} catch (Exception e) {}
	}

	@Test
	public void getLevelTest() {
		try{
			int retorn = instance.getLevel();
		} catch (Exception e) {}
	}

	@Test
	public void hasBecomeLevelTestint() {
		try{
			boolean retorn = instance.hasBecomeLevel(0);
		} catch (Exception e) {}
	}

	@Test
	public void hasCompletedProgressTest() {
		try{
			boolean retorn = instance.hasCompletedProgress();
		} catch (Exception e) {}
	}

}
