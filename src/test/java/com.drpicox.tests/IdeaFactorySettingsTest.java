package com.drpicox.tests;
import com.drpicox.game.idea.IdeaFactorySettings;
import org.junit.Test;

public class IdeaFactorySettingsTest {

	IdeaFactorySettings instance;

	@Test
	public void IdeaFactorySettingsTestString() {
		try{
			instance = new IdeaFactorySettings(/*1*//*String*/" ");
		} catch (Exception e) {}
	}

	@Test
	public void getLevelTest() {
		try{
			int retorn = instance.getLevel();
		} catch (Exception e) {}
	}

	@Test
	public void getXpTest() {
		try{
			int retorn = instance.getXp();
		} catch (Exception e) {}
	}

	@Test
	public void getIdeaNameTest() {
		try{
			java.lang.String retorn = instance.getIdeaName();
		} catch (Exception e) {}
	}

	@Test
	public void withLevelTestint() {
		try{
			com.drpicox.game.idea.IdeaFactorySettings retorn = instance.withLevel(0);
		} catch (Exception e) {}
	}

	@Test
	public void withXpTestint() {
		try{
			com.drpicox.game.idea.IdeaFactorySettings retorn = instance.withXp(0);
		} catch (Exception e) {}
	}

}
