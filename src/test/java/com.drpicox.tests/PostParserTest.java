package com.drpicox.tests;
import com.drpicox.game.blog.PostParser;
import org.junit.Test;

public class PostParserTest {

	PostParser instance;

	@Test
	public void PostParserTestStringListbyte$$() {
		try{
			instance = new PostParser(/*1*//*String*/" ",/*List*/new java.util.ArrayList(),/*byte[]*/new byte[]{});
		} catch (Exception e) {}
	}

	@Test
	public void isPeekEmptyLineTest() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("isPeekEmptyLine");
			method.setAccessible(true);
			boolean retorn = (boolean)method.invoke(instance);
		} catch (Exception e) {}
	}

	@Test
	public void isNotEofTest() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("isNotEof");
			method.setAccessible(true);
			boolean retorn = (boolean)method.invoke(instance);
		} catch (Exception e) {}
	}

	@Test
	public void parseTitleTest() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("parseTitle");
			method.setAccessible(true);
			method.invoke(instance);
		} catch (Exception e) {}
	}

	@Test
	public void parseFrontMatterTest() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("parseFrontMatter");
			method.setAccessible(true);
			method.invoke(instance);
		} catch (Exception e) {}
	}

	@Test
	public void parseBodyTest() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("parseBody");
			method.setAccessible(true);
			method.invoke(instance);
		} catch (Exception e) {}
	}

	@Test
	public void computeMd5TestString() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("computeMd5");
			method.setAccessible(true);
			java.lang.String retorn = (java.lang.String)method.invoke(instance, " ");
		} catch (Exception e) {}
	}

	@Test
	public void skipEmptyLinesTest() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("skipEmptyLines");
			method.setAccessible(true);
			method.invoke(instance);
		} catch (Exception e) {}
	}

	@Test
	public void parseTest() {
		try{
			com.drpicox.game.blog.Post retorn = instance.parse();
		} catch (Exception e) {}
	}

	@Test
	public void validateTitleTest() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("validateTitle");
			method.setAccessible(true);
			method.invoke(instance);
		} catch (Exception e) {}
	}

	@Test
	public void expectNotEofTestString() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("expectNotEof");
			method.setAccessible(true);
			method.invoke(instance, " ");
		} catch (Exception e) {}
	}

	@Test
	public void nextLineTest() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("nextLine");
			method.setAccessible(true);
			java.lang.String retorn = (java.lang.String)method.invoke(instance);
		} catch (Exception e) {}
	}

	@Test
	public void peekLineTest() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("peekLine");
			method.setAccessible(true);
			java.lang.String retorn = (java.lang.String)method.invoke(instance);
		} catch (Exception e) {}
	}

	@Test
	public void newErrorTestString() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("newError");
			method.setAccessible(true);
			com.drpicox.game.blog.IllegalPostFileFormatException retorn = (com.drpicox.game.blog.IllegalPostFileFormatException)method.invoke(instance, " ");
		} catch (Exception e) {}
	}

	@Test
	public void isPeekStartingWithTestString() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("isPeekStartingWith");
			method.setAccessible(true);
			boolean retorn = (boolean)method.invoke(instance, " ");
		} catch (Exception e) {}
	}

	@Test
	public void expectPeekStartWithTestStringString() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("expectPeekStartWith");
			method.setAccessible(true);
			method.invoke(instance, " ", " ");
		} catch (Exception e) {}
	}

	@Test
	public void parseFrontMatterLineTest() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("parseFrontMatterLine");
			method.setAccessible(true);
			method.invoke(instance);
		} catch (Exception e) {}
	}

}
