package com.drpicox.tests;
import com.drpicox.game.idea.api.IdeaTagRequirementDTO;
import org.junit.Test;

public class IdeaTagRequirementDTOTest {

	IdeaTagRequirementDTO instance;

	@Test
	public void IdeaTagRequirementDTOTestIdeaTagRequirement() {
		try{
			instance = new IdeaTagRequirementDTO(/*1*//*IdeaTagRequirement*/new com.drpicox.game.idea.IdeaTagRequirement(
				/*2*//*int*/0,/*int*/0,/*String*/" "));
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
