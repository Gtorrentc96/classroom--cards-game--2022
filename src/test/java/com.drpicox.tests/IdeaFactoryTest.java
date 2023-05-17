package com.drpicox.tests;
import com.drpicox.game.idea.IdeaFactory;
import org.junit.Test;

public class IdeaFactoryTest {

	IdeaFactory instance;

	@Test
	public void IdeaFactoryTestIdeaRepositoryCardConstantsCollection() {
		try{
			instance = new IdeaFactory(/*1*//*IdeaRepository*/null,/*CardConstantsCollection*/new com.drpicox.game.card.CardConstantsCollection(
				/*2*//*ConstantsLoader*/new com.drpicox.game.constants.ConstantsLoader(
					/*3*/)));
		} catch (Exception e) {}
	}

	@Test
	public void makeIdeaTestIdeaFactorySettings() {
		try{
			instance.makeIdea(null);
		} catch (Exception e) {}
	}

	@Test
	public void getCardRewardsTestConstants() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("getCardRewards");
			method.setAccessible(true);
			java.util.List retorn = (java.util.List)method.invoke(instance, null);
		} catch (Exception e) {}
	}

	@Test
	public void getIdFromNameTestString() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("getIdFromName");
			method.setAccessible(true);
			java.lang.String retorn = (java.lang.String)method.invoke(instance, " ");
		} catch (Exception e) {}
	}

	@Test
	public void getCardRequirementsTestConstants() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("getCardRequirements");
			method.setAccessible(true);
			java.util.List retorn = (java.util.List)method.invoke(instance, null);
		} catch (Exception e) {}
	}

}
