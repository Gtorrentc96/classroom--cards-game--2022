package com.drpicox.tests;
import com.drpicox.game.blog.Post;
import org.junit.Test;

public class PostTest {

	Post instance;

	@Test
	public void PostTestStringMapStringStringString() {
		try{
			instance = new Post(/*1*//*String*/" ",/*Map*/new java.util.HashMap<>(),/*String*/" ",/*String*/" ",/*String*/" ");
		} catch (Exception e) {}
	}

	@Test
	public void compareToTestPost() {
		try{
			int retorn = instance.compareTo(null);
		} catch (Exception e) {}
	}

	@Test
	public void compareToTestObject() {
		try{
			int retorn = instance.compareTo(null);
		} catch (Exception e) {}
	}

	@Test
	public void getValueTestString() {
		try{
			java.lang.String retorn = instance.getValue(" ");
		} catch (Exception e) {}
	}

	@Test
	public void getIdTest() {
		try{
			java.lang.String retorn = instance.getId();
		} catch (Exception e) {}
	}

	@Test
	public void getKeysTest() {
		try{
			java.util.Set retorn = instance.getKeys();
		} catch (Exception e) {}
	}

	@Test
	public void getBodyTest() {
		try{
			java.lang.String retorn = instance.getBody();
		} catch (Exception e) {}
	}

	@Test
	public void getTitleTest() {
		try{
			java.lang.String retorn = instance.getTitle();
		} catch (Exception e) {}
	}

	@Test
	public void getMd5Test() {
		try{
			java.lang.String retorn = instance.getMd5();
		} catch (Exception e) {}
	}

	@Test
	public void getFrontMatterTest() {
		try{
			java.util.Map retorn = instance.getFrontMatter();
		} catch (Exception e) {}
	}

}
