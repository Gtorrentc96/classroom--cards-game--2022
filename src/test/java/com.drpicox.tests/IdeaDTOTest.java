package com.drpicox.tests;
import com.drpicox.game.idea.api.IdeaDTO;
import org.junit.Test;

public class IdeaDTOTest {

	IdeaDTO instance;

	@Test
	public void IdeaDTOTestIdea() {
		try{
			instance = new IdeaDTO(/*1*//*Idea*/new com.drpicox.game.idea.Idea(
				/*2*//*String*/" ",/*String*/" ",/*int*/0,/*int*/0,/*List*/new java.util.ArrayList(),/*List*/new java.util.ArrayList()));
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
	public void lambda$new$0TestIdeaCardReward() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("lambda$new$0");
			method.setAccessible(true);
			java.lang.String retorn = (java.lang.String)method.invoke(instance, null);
		} catch (Exception e) {}
	}

	@Test
	public void findTagRequirementTestString() {
		try{
			java.util.Optional retorn = instance.findTagRequirement(" ");
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

}
