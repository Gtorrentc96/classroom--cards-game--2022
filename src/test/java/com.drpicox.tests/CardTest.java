package com.drpicox.tests;
import com.drpicox.game.card.Card;
import org.junit.Test;

public class CardTest {

	Card instance;

	@Test
	public void CardTestStringStringMapListintintString() {
		try{
			instance = new Card(/*1*//*String*/" ",/*String*/" ",/*Map*/new java.util.HashMap<>(),/*List*/new java.util.ArrayList(),/*int*/0,/*int*/0,/*String*/" ");
		} catch (Exception e) {}
	}

	@Test
	public void getNameTest() {
		try{
			java.lang.String retorn = instance.getName();
		} catch (Exception e) {}
	}

	@Test
	public void equalsTestObject() {
		try{
			boolean retorn = instance.equals(null);
		} catch (Exception e) {}
	}

	@Test
	public void toStringTest() {
		try{
			java.lang.String retorn = instance.toString();
		} catch (Exception e) {}
	}

	@Test
	public void getIdTest() {
		try{
			java.lang.String retorn = instance.getId();
		} catch (Exception e) {}
	}

	@Test
	public void getPositionTest() {
		try{
			int retorn = instance.getPosition();
		} catch (Exception e) {}
	}

	@Test
	public void lambda$getTagValue$0TestStringTag() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("lambda$getTagValue$0");
			method.setAccessible(true);
			boolean retorn = (boolean)method.invoke(instance, " ", null);
		} catch (Exception e) {}
	}

	@Test
	public void lambda$getTagValue$1TestTag() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("lambda$getTagValue$1");
			method.setAccessible(true);
			int retorn = (int)method.invoke(instance, null);
		} catch (Exception e) {}
	}

	@Test
	public void progressTestint() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("progress");
			method.setAccessible(true);
			int retorn = (int)method.invoke(instance, 0);
		} catch (Exception e) {}
	}

	@Test
	public void placeAtTestintint() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("placeAt");
			method.setAccessible(true);
			method.invoke(instance, 0, 0);
		} catch (Exception e) {}
	}

	@Test
	public void getMaxProgressTest() {
		try{
			int retorn = instance.getMaxProgress();
		} catch (Exception e) {}
	}

	@Test
	public void getZindexTest() {
		try{
			int retorn = instance.getZindex();
		} catch (Exception e) {}
	}

	@Test
	public void getDescriptionTest() {
		try{
			java.util.Map retorn = instance.getDescription();
		} catch (Exception e) {}
	}

	@Test
	public void getProgressTest() {
		try{
			int retorn = instance.getProgress();
		} catch (Exception e) {}
	}

	@Test
	public void getDescriptionTermTestString() {
		try{
			java.lang.String retorn = instance.getDescriptionTerm(" ");
		} catch (Exception e) {}
	}

	@Test
	public void getTagsTest() {
		try{
			java.util.List retorn = instance.getTags();
		} catch (Exception e) {}
	}

	@Test
	public void getTagValueTestString() {
		try{
			int retorn = instance.getTagValue(" ");
		} catch (Exception e) {}
	}

	@Test
	public void getLooksLikeTest() {
		try{
			java.lang.String retorn = instance.getLooksLike();
		} catch (Exception e) {}
	}

}
