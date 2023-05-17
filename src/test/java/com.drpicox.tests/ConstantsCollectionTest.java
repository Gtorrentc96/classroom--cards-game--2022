package com.drpicox.tests;
import com.drpicox.game.constants.ConstantsCollection;
import org.junit.Test;

public class ConstantsCollectionTest {

	ConstantsCollection instance;

	@Test
	public void ConstantsCollectionTestString() {
		try{
			instance = new ConstantsCollection(/*1*//*String*/" ");
		} catch (Exception e) {}
	}

	@Test
	public void addTestConstantsString() {
		try{
			instance.add(null, " ");
		} catch (Exception e) {}
	}

	@Test
	public void getByNameTestString() {
		try{
			com.drpicox.game.constants.Constants retorn = instance.getByName(" ");
		} catch (Exception e) {}
	}

}
