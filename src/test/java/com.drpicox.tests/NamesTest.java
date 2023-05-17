package com.drpicox.tests;
import com.drpicox.game.util.Names;
import org.junit.Test;

public class NamesTest {

	Names instance;

	@Test
	public void getNameTestint() {
		try{
			java.lang.String retorn = instance.getName(0);
		} catch (Exception e) {}
	}

	@Test
	public void getTest() {
		try{
			java.lang.String[] retorn = instance.get();
		} catch (Exception e) {}
	}

	@Test
	public void testTestHasNames() {
		try{
			boolean retorn = instance.test(null);
		} catch (Exception e) {}
	}

	@Test
	public void testTestObject() {
		try{
			boolean retorn = instance.test(null);
		} catch (Exception e) {}
	}

	@Test
	public void sizeTest() {
		try{
			int retorn = instance.size();
		} catch (Exception e) {}
	}

	@Test
	public void iteratorTest() {
		try{
			java.util.Iterator retorn = instance.iterator();
		} catch (Exception e) {}
	}

	@Test
	public void andTestintString() {
		try{
			com.drpicox.game.util.Names retorn = instance.and(0, " ");
		} catch (Exception e) {}
	}

	@Test
	public void andTestString$$() {
		try{
			com.drpicox.game.util.Names retorn = instance.and(" ", " ");
		} catch (Exception e) {}
	}

	@Test
	public void byNameTestString() {
		try{
			java.util.function.Predicate retorn = Names.byName(" ");
		} catch (Exception e) {}
	}

	@Test
	public void byNamesTestString$$() {
		try{
			com.drpicox.game.util.Names retorn = Names.byNames(" ", " ");
		} catch (Exception e) {}
	}

	@Test
	public void byNamesTestintString() {
		try{
			com.drpicox.game.util.Names retorn = Names.byNames(0, " ");
		} catch (Exception e) {}
	}

	@Test
	public void lambda$get$1Testint() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("lambda$get$1");
			method.setAccessible(true);
			java.lang.String[] retorn = (java.lang.String[])method.invoke(instance, 0);
		} catch (Exception e) {}
	}

	@Test
	public void lambda$byName$0TestStringHasName() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("lambda$byName$0");
			method.setAccessible(true);
			boolean retorn = (boolean)method.invoke(instance, " ", null);
		} catch (Exception e) {}
	}

}
