package com.drpicox.tests;
import com.drpicox.game.constants.ConstantsLoader;
import org.junit.Test;

public class ConstantsLoaderTest {

	ConstantsLoader instance;

	@Test
	public void ConstantsLoaderTest() {
		try{
			instance = new ConstantsLoader(/*1*/);
		} catch (Exception e) {}
	}

	@Test
	public void loadTestString() {
		try{
			com.drpicox.game.constants.Constants retorn = instance.load(" ");
		} catch (Exception e) {}
	}

	@Test
	public void loadCollectionTestString() {
		try{
			com.drpicox.game.constants.ConstantsCollection retorn = instance.loadCollection(" ");
		} catch (Exception e) {}
	}

	@Test
	public void loadDirectoryTestConstantsCollectionFile() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("loadDirectory");
			method.setAccessible(true);
			method.invoke(instance, null, null);
		} catch (Exception e) {}
	}

	@Test
	public void loadFileTestConstantsCollectionFile() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("loadFile");
			method.setAccessible(true);
			method.invoke(instance, null, null);
		} catch (Exception e) {}
	}

	@Test
	public void loadFileTestFile() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("loadFile");
			method.setAccessible(true);
			com.drpicox.game.constants.Constants retorn = (com.drpicox.game.constants.Constants)method.invoke(instance, null);
		} catch (Exception e) {}
	}

	@Test
	public void getUriTestString() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("getUri");
			method.setAccessible(true);
			java.net.URI retorn = (java.net.URI)method.invoke(instance, " ");
		} catch (Exception e) {}
	}

}
