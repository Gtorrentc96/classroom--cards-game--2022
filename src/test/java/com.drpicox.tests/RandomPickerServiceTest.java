package com.drpicox.tests;
import com.drpicox.game.util.RandomPickerService;
import org.junit.Test;

public class RandomPickerServiceTest {

	RandomPickerService instance;

	@Test
	public void RandomPickerServiceTest() {
		try{
			instance = new RandomPickerService(/*1*/);
		} catch (Exception e) {}
	}

	@Test
	public void pickTestStringList() {
		try{
			com.drpicox.game.util.PossiblePick retorn = instance.pick(" ", null);
		} catch (Exception e) {}
	}

	@Test
	public void lambda$pick$0TestPossiblePick() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("lambda$pick$0");
			method.setAccessible(true);
			int retorn = (int)method.invoke(instance, null);
		} catch (Exception e) {}
	}

}
