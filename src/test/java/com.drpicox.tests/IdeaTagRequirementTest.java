package com.drpicox.tests;
import com.drpicox.game.idea.IdeaTagRequirement;
import org.junit.Test;

public class IdeaTagRequirementTest {

	IdeaTagRequirement instance;

	@Test
	public void IdeaTagRequirementTestintintString() {
		try{
			instance = new IdeaTagRequirement(/*1*//*int*/0,/*int*/0,/*String*/" ");
		} catch (Exception e) {}
	}

	@Test
	public void getNameTest() {
		try{
			java.lang.String retorn = instance.getName();
		} catch (Exception e) {}
	}

	@Test
	public void getCardCountTest() {
		try{
			int retorn = instance.getCardCount();
		} catch (Exception e) {}
	}

	@Test
	public void getTagValueTest() {
		try{
			int retorn = instance.getTagValue();
		} catch (Exception e) {}
	}

}
