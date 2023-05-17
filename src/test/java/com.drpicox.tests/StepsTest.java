package com.drpicox.tests;
import com.drpicox.game.util.Steps;
import org.junit.Test;

public class StepsTest {

	Steps instance;

	@Test
	public void fromTestList() {
		try{
			com.drpicox.game.util.Steps retorn = Steps.from(null);
		} catch (Exception e) {}
	}

	@Test
	public void executeTestSettings() {
		try{
			instance.execute(null);
		} catch (Exception e) {}
	}

	@Test
	public void lambda$from$0TestStepStep() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("lambda$from$0");
			method.setAccessible(true);
			int retorn = (int)method.invoke(instance, null, null);
		} catch (Exception e) {}
	}

}
