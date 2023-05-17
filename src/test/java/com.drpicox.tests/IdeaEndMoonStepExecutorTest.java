package com.drpicox.tests;
import com.drpicox.game.idea.IdeaEndMoonStepExecutor;
import org.junit.Test;

public class IdeaEndMoonStepExecutorTest {

	IdeaEndMoonStepExecutor instance;

	@Test
	public void IdeaEndMoonStepExecutorTestStackServiceIdeaService() {
		try{
			instance = new IdeaEndMoonStepExecutor(/*1*//*StackService*/new com.drpicox.game.card.StackService(
				/*2*//*CardPositionService*/new com.drpicox.game.card.CardPositionService(
					/*3*//*CardRepository*/null,/*CardService*/new com.drpicox.game.card.CardService(
						/*4*//*CardRepository*/null,/*TagService*/new com.drpicox.game.tag.TagService(
							/*5*//*TagRepository*/null))),/*CardService*/new com.drpicox.game.card.CardService(
					/*3*//*CardRepository*/null,/*TagService*/new com.drpicox.game.tag.TagService(
						/*4*//*TagRepository*/null)),/*CardRepository*/null),/*IdeaService*/new com.drpicox.game.idea.IdeaService(
				/*2*//*IdeaRepository*/null));
		} catch (Exception e) {}
	}

	@Test
	public void executeTestEndMoonSettingsStringConsumer() {
		try{
			instance.execute(null, " ", null);
		} catch (Exception e) {}
	}

	@Test
	public void validateRequirementsTestIdeaEndMoonSettings() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("validateRequirements");
			method.setAccessible(true);
			boolean retorn = (boolean)method.invoke(instance, null);
		} catch (Exception e) {}
	}

}
