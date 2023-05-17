package com.drpicox.tests;
import com.drpicox.game.tag.food.EndMoonStep_100_EatersEatFood;
import org.junit.Test;

public class EndMoonStep_100_EatersEatFoodTest {

	EndMoonStep_100_EatersEatFood instance;

	@Test
	public void EndMoonStep_100_EatersEatFoodTestCardServiceCardFactory() {
		try{
			instance = new EndMoonStep_100_EatersEatFood(/*1*//*CardService*/new com.drpicox.game.card.CardService(
				/*2*//*CardRepository*/null,/*TagService*/new com.drpicox.game.tag.TagService(
					/*3*//*TagRepository*/null)),/*CardFactory*/new com.drpicox.game.card.CardFactory(
				/*2*//*CardService*/new com.drpicox.game.card.CardService(
					/*3*//*CardRepository*/null,/*TagService*/new com.drpicox.game.tag.TagService(
						/*4*//*TagRepository*/null)),/*CardRepository*/null,/*CardPositionService*/new com.drpicox.game.card.CardPositionService(
					/*3*//*CardRepository*/null,/*CardService*/new com.drpicox.game.card.CardService(
						/*4*//*CardRepository*/null,/*TagService*/new com.drpicox.game.tag.TagService(
							/*5*//*TagRepository*/null))),/*TagFactory*/new com.drpicox.game.tag.TagFactory(
					/*3*//*TagRepository*/null),/*CardConstantsCollection*/new com.drpicox.game.card.CardConstantsCollection(
					/*3*//*ConstantsLoader*/new com.drpicox.game.constants.ConstantsLoader(
						/*4*/))));
		} catch (Exception e) {}
	}

	@Test
	public void executeTestSettings() {
		try{
			instance.execute(null);
		} catch (Exception e) {}
	}

	@Test
	public void executeTestEndMoonSettings() {
		try{
			instance.execute(null);
		} catch (Exception e) {}
	}

	@Test
	public void lambda$execute$1TestCard() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("lambda$execute$1");
			method.setAccessible(true);
			int retorn = (int)method.invoke(instance, null);
		} catch (Exception e) {}
	}

	@Test
	public void lambda$execute$0TestCard() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("lambda$execute$0");
			method.setAccessible(true);
			int retorn = (int)method.invoke(instance, null);
		} catch (Exception e) {}
	}

	@Test
	public void removeBestSuitedFoodTestListint() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("removeBestSuitedFood");
			method.setAccessible(true);
			com.drpicox.game.card.Card retorn = (com.drpicox.game.card.Card)method.invoke(instance, null, 0);
		} catch (Exception e) {}
	}

}
