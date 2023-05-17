package com.drpicox.tests;
import com.drpicox.game.util.Settings;
import org.junit.Test;

public class SettingsTest {

	Settings instance;

	@Test
	public void SettingsTest() {
		try{
			instance = new Settings(/*1*/);
		} catch (Exception e) {}
	}

	@Test
	public void getTestString() {
		try{
			java.lang.Object retorn = instance.get(" ");
		} catch (Exception e) {}
	}

	@Test
	public void setTestStringObject() {
		try{
			com.drpicox.game.util.Settings retorn = instance.set(" ", null);
		} catch (Exception e) {}
	}

	@Test
	public void getOrDefaultTestStringObject() {
		try{
			java.lang.Object retorn = instance.getOrDefault(" ", null);
		} catch (Exception e) {}
	}

	@Test
	public void hasTestString() {
		try{
			boolean retorn = instance.has(" ");
		} catch (Exception e) {}
	}

	@Test
	public void extendTestSettings() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("extend");
			method.setAccessible(true);
			method.invoke(instance, null);
		} catch (Exception e) {}
	}

}
