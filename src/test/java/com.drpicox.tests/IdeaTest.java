package com.drpicox.tests;
import com.drpicox.game.idea.Idea;
import org.junit.Test;

public class IdeaTest {

	Idea instance;

	@Test
	public void IdeaTestStringStringintintListList() {
		try{
			instance = new Idea(/*1*//*String*/" ",/*String*/" ",/*int*/0,/*int*/0,/*List*/new java.util.ArrayList(),/*List*/new java.util.ArrayList());
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
	public void getLevelTest() {
		try{
			int retorn = instance.getLevel();
		} catch (Exception e) {}
	}

	@Test
	public void getCardRewardsTest() {
		try{
			java.util.List retorn = instance.getCardRewards();
		} catch (Exception e) {}
	}

	@Test
	public void getXpTest() {
		try{
			int retorn = instance.getXp();
		} catch (Exception e) {}
	}

	@Test
	public void increaseXpTest() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("increaseXp");
			method.setAccessible(true);
			method.invoke(instance);
		} catch (Exception e) {}
	}

	@Test
	public void countRequiredCardsTest() {
		try{
			int retorn = instance.countRequiredCards();
		} catch (Exception e) {}
	}

	@Test
	public void getTagRequirementsTest() {
		try{
			java.util.List retorn = instance.getTagRequirements();
		} catch (Exception e) {}
	}

	@Test
	public void lambda$countRequiredCards$0TestIdeaTagRequirement() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("lambda$countRequiredCards$0");
			method.setAccessible(true);
			int retorn = (int)method.invoke(instance, null);
		} catch (Exception e) {}
	}

	@Test
	public void lambda$getCardRewards$1TestIdeaCardReward() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("lambda$getCardRewards$1");
			method.setAccessible(true);
			boolean retorn = (boolean)method.invoke(instance, null);
		} catch (Exception e) {}
	}

}
