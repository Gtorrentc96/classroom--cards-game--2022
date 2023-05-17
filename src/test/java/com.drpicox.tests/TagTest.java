package com.drpicox.tests;
import com.drpicox.game.tag.Tag;
import org.junit.Test;

public class TagTest {

	Tag instance;

	@Test
	public void TagTestStringStringint() {
		try{
			instance = new Tag(/*1*//*String*/" ",/*String*/" ",/*int*/0);
		} catch (Exception e) {}
	}

	@Test
	public void getNameTest() {
		try{
			java.lang.String retorn = instance.getName();
		} catch (Exception e) {}
	}

	@Test
	public void getValueTest() {
		try{
			int retorn = instance.getValue();
		} catch (Exception e) {}
	}

	@Test
	public void getCardIdTest() {
		try{
			java.lang.String retorn = instance.getCardId();
		} catch (Exception e) {}
	}

}
