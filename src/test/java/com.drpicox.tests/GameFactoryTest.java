package com.drpicox.tests;
import com.drpicox.game.game.GameFactory;
import org.junit.Test;

public class GameFactoryTest {

	GameFactory instance;

	@Test
	public void GameFactoryTestConstantsLoaderGameRepositoryListList() {
		try{
			instance = new GameFactory(/*1*//*ConstantsLoader*/new com.drpicox.game.constants.ConstantsLoader(
				/*2*/),/*GameRepository*/null,/*List*/new java.util.ArrayList(),/*List*/new java.util.ArrayList());
		} catch (Exception e) {}
	}

	@Test
	public void deleteOldGameIfExistsTestGameFactorySettings() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("deleteOldGameIfExists");
			method.setAccessible(true);
			method.invoke(instance, null);
		} catch (Exception e) {}
	}

	@Test
	public void makeGameTestGameFactorySettings() {
		try{
			instance.makeGame(null);
		} catch (Exception e) {}
	}

}
