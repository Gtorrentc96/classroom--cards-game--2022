package com.drpicox.tests;
import com.drpicox.game.constants.Constants;
import org.junit.Test;

public class ConstantsTest {

	Constants instance;

	@Test
	public void ConstantsTestMap() {
		try{
			instance = new Constants(/*1*//*Map*/new java.util.HashMap<>());
		} catch (Exception e) {}
	}

	@Test
	public void loadTestFile() {
		try{
			com.drpicox.game.constants.Constants retorn = Constants.load(null);
		} catch (Exception e) {}
	}

	@Test
	public void containsKeyTestString() {
		try{
			boolean retorn = instance.containsKey(" ");
		} catch (Exception e) {}
	}

	@Test
	public void keySetTest() {
		try{
			java.util.Collection retorn = instance.keySet();
		} catch (Exception e) {}
	}

	@Test
	public void getStringTestString() {
		try{
			java.lang.String retorn = instance.getString(" ");
		} catch (Exception e) {}
	}

	@Test
	public void findAllNumberedKeysTestString() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("findAllNumberedKeys");
			method.setAccessible(true);
			java.util.List retorn = (java.util.List)method.invoke(instance, " ");
		} catch (Exception e) {}
	}

	@Test
	public void lambda$findAllNumberedKeys$1TestStringString() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("lambda$findAllNumberedKeys$1");
			method.setAccessible(true);
			boolean retorn = (boolean)method.invoke(instance, " ", " ");
		} catch (Exception e) {}
	}

	@Test
	public void lambda$findAllNumberedKeys$0TestStringString() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("lambda$findAllNumberedKeys$0");
			method.setAccessible(true);
			boolean retorn = (boolean)method.invoke(instance, " ", " ");
		} catch (Exception e) {}
	}

	@Test
	public void getCsvTestString() {
		try{
			com.drpicox.game.util.DataTableRow retorn = instance.getCsv(" ");
		} catch (Exception e) {}
	}

	@Test
	public void getCsvTestStringMap() {
		try{
			com.drpicox.game.util.DataTableRow retorn = instance.getCsv(" ", null);
		} catch (Exception e) {}
	}

	@Test
	public void getCsvTableTestString() {
		try{
			com.drpicox.game.util.DataTable retorn = instance.getCsvTable(" ");
		} catch (Exception e) {}
	}

	@Test
	public void getCsvTableHeadingTestString() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("getCsvTableHeading");
			method.setAccessible(true);
			java.util.Map retorn = (java.util.Map)method.invoke(instance, " ");
		} catch (Exception e) {}
	}

	@Test
	public void getCsvTableRowsTestStringMap() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("getCsvTableRows");
			method.setAccessible(true);
			java.util.List retorn = (java.util.List)method.invoke(instance, " ", null);
		} catch (Exception e) {}
	}

}
