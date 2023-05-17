package com.drpicox.tests;
import com.drpicox.game.idea.IdeaCardReward;
import org.junit.Test;

public class IdeaCardRewardTest {

	IdeaCardReward instance;

	@Test
	public void IdeaCardRewardTestStringintint() {
		try{
			instance = new IdeaCardReward(/*1*//*String*/" ",/*int*/0,/*int*/0);
		} catch (Exception e) {}
	}

	@Test
	public void getLevelTest() {
		try{
			int retorn = instance.getLevel();
		} catch (Exception e) {}
	}

	@Test
	public void getCardNameTest() {
		try{
			java.lang.String retorn = instance.getCardName();
		} catch (Exception e) {}
	}

}
