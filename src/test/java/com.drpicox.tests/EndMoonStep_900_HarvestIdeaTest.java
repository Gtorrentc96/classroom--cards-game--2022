package com.drpicox.tests;
import com.drpicox.game.idea.plants.EndMoonStep_900_HarvestIdea;
import org.junit.Test;

public class EndMoonStep_900_HarvestIdeaTest {

	EndMoonStep_900_HarvestIdea instance;

	@Test
	public void EndMoonStep_900_HarvestIdeaTestCardFactoryIdeaEndMoonStepExecutorIdeaFactoryIdeaProgressService() {
		try{
			instance = new EndMoonStep_900_HarvestIdea(/*1*//*CardFactory*/new com.drpicox.game.card.CardFactory(
				/*2*//*CardService*/new com.drpicox.game.card.CardService(
					/*3*//*CardRepository*/null,/*TagService*/new com.drpicox.game.tag.TagService(
						/*4*//*TagRepository*/null)),/*CardRepository*/null,/*CardPositionService*/new com.drpicox.game.card.CardPositionService(
					/*3*//*CardRepository*/null,/*CardService*/new com.drpicox.game.card.CardService(
						/*4*//*CardRepository*/null,/*TagService*/new com.drpicox.game.tag.TagService(
							/*5*//*TagRepository*/null))),/*TagFactory*/new com.drpicox.game.tag.TagFactory(
					/*3*//*TagRepository*/null),/*CardConstantsCollection*/new com.drpicox.game.card.CardConstantsCollection(
					/*3*//*ConstantsLoader*/new com.drpicox.game.constants.ConstantsLoader(
						/*4*/))),/*IdeaEndMoonStepExecutor*/new com.drpicox.game.idea.IdeaEndMoonStepExecutor(
				/*2*//*StackService*/new com.drpicox.game.card.StackService(
					/*3*//*CardPositionService*/new com.drpicox.game.card.CardPositionService(
						/*4*//*CardRepository*/null,/*CardService*/new com.drpicox.game.card.CardService(
							/*5*//*CardRepository*/null,/*TagService*/new com.drpicox.game.tag.TagService(
								/*6*//*TagRepository*/null))),/*CardService*/new com.drpicox.game.card.CardService(
						/*4*//*CardRepository*/null,/*TagService*/new com.drpicox.game.tag.TagService(
							/*5*//*TagRepository*/null)),/*CardRepository*/null),/*IdeaService*/new com.drpicox.game.idea.IdeaService(
					/*3*//*IdeaRepository*/null)),/*IdeaFactory*/new com.drpicox.game.idea.IdeaFactory(
				/*2*//*IdeaRepository*/null,/*CardConstantsCollection*/new com.drpicox.game.card.CardConstantsCollection(
					/*3*//*ConstantsLoader*/new com.drpicox.game.constants.ConstantsLoader(
						/*4*/))),/*IdeaProgressService*/new com.drpicox.game.idea.IdeaProgressService(
				/*2*//*IdeaService*/new com.drpicox.game.idea.IdeaService(
					/*3*//*IdeaRepository*/null),/*CardService*/new com.drpicox.game.card.CardService(
					/*3*//*CardRepository*/null,/*TagService*/new com.drpicox.game.tag.TagService(
						/*4*//*TagRepository*/null))));
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
	public void executeIdeaTestIdeaEndMoonSettings() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("executeIdea");
			method.setAccessible(true);
			method.invoke(instance, null);
		} catch (Exception e) {}
	}

}
