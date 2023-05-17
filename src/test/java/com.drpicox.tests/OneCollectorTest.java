package com.drpicox.tests;
import com.drpicox.game.util.OneCollector;
import org.junit.Test;

public class OneCollectorTest {

	OneCollector instance;

	@Test
	public void lambda$toOne$0TestList() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("lambda$toOne$0");
			method.setAccessible(true);
			java.lang.Object retorn = (java.lang.Object)method.invoke(instance, null);
		} catch (Exception e) {}
	}

	@Test
	public void toOneTest() {
		try{
			java.util.stream.Collector retorn = OneCollector.toOne();
		} catch (Exception e) {}
	}

}
