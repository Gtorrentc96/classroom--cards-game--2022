package com.drpicox.tests;
import com.drpicox.game.idea.IdeaProgressService;
import org.junit.Test;

public class IdeaProgressServiceTest {

	IdeaProgressService instance;

	@Test
	public void IdeaProgressServiceTestIdeaServiceCardService() {
		try{
			instance = new IdeaProgressService(/*1*//*IdeaService*/new com.drpicox.game.idea.IdeaService(
				/*2*//*IdeaRepository*/null),/*CardService*/new com.drpicox.game.card.CardService(
				/*2*//*CardRepository*/null,/*TagService*/new com.drpicox.game.tag.TagService(
					/*3*//*TagRepository*/null)));
		} catch (Exception e) {}
	}

	@Test
	public void progressTestIdeaEndMoonSettingsint() {
		try{
			com.drpicox.game.idea.IdeaProgress retorn = instance.progress(null, 0);
		} catch (Exception e) {}
	}

	@Test
	public void progressTestIdeaCardint() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("progress");
			method.setAccessible(true);
			com.drpicox.game.idea.IdeaProgress retorn = (com.drpicox.game.idea.IdeaProgress)method.invoke(instance, null, null, 0);
		} catch (Exception e) {}
	}

}
