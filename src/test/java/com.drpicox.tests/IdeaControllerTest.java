package com.drpicox.tests;
import com.drpicox.game.idea.api.IdeaController;
import org.junit.Test;

public class IdeaControllerTest {

	IdeaController instance;

	@Test
	public void IdeaControllerTestIdeaServiceCardFactoryGameDTOFactory() {
		try{
			instance = new IdeaController(/*1*//*IdeaService*/new com.drpicox.game.idea.IdeaService(
				/*2*//*IdeaRepository*/null),/*CardFactory*/new com.drpicox.game.card.CardFactory(
				/*2*//*CardService*/new com.drpicox.game.card.CardService(
					/*3*//*CardRepository*/null,/*TagService*/new com.drpicox.game.tag.TagService(
						/*4*//*TagRepository*/null)),/*CardRepository*/null,/*CardPositionService*/new com.drpicox.game.card.CardPositionService(
					/*3*//*CardRepository*/null,/*CardService*/new com.drpicox.game.card.CardService(
						/*4*//*CardRepository*/null,/*TagService*/new com.drpicox.game.tag.TagService(
							/*5*//*TagRepository*/null))),/*TagFactory*/new com.drpicox.game.tag.TagFactory(
					/*3*//*TagRepository*/null),/*CardConstantsCollection*/new com.drpicox.game.card.CardConstantsCollection(
					/*3*//*ConstantsLoader*/new com.drpicox.game.constants.ConstantsLoader(
						/*4*/))),/*GameDTOFactory*/new com.drpicox.game.game.api.GameDTOFactory(
				/*2*//*List*/new java.util.ArrayList()));
		} catch (Exception e) {}
	}

	@Test
	public void drawIdeaTestString() {
		try{
			com.drpicox.game.game.api.GameDTO retorn = instance.drawIdea(" ");
		} catch (Exception e) {}
	}

}
