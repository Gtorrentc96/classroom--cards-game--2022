package com.drpicox.tests;
import com.drpicox.game.tag.TagFactorySettings;
import org.junit.Test;

public class TagFactorySettingsTest {

	TagFactorySettings instance;

	@Test
	public void TagFactorySettingsTestString() {
		try{
			instance = new TagFactorySettings(/*1*//*String*/" ");
		} catch (Exception e) {}
	}

	@Test
	public void getCardIdTest() {
		try{
			java.lang.String retorn = instance.getCardId();
		} catch (Exception e) {}
	}

	@Test
	public void getCardConstantsTest() {
		try{
			com.drpicox.game.constants.Constants retorn = instance.getCardConstants();
		} catch (Exception e) {}
	}

	@Test
	public void withCardConstantsTestConstants() {
		try{
			com.drpicox.game.tag.TagFactorySettings retorn = instance.withCardConstants(null);
		} catch (Exception e) {}
	}

}
