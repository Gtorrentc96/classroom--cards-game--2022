package com.drpicox.tests;
import com.drpicox.game.card.CardFactorySettings;
import org.junit.Test;

public class CardFactorySettingsTest {

	CardFactorySettings instance;

	CardFactorySettings instance2;

	@Test
	public void CardFactorySettingsTest() {
		try{
			instance = new CardFactorySettings(/*1*/);
		} catch (Exception e) {}
	}

	@Test
	public void CardFactorySettingsTestString() {
		try{
			instance2 = new CardFactorySettings(/*1*//*String*/" ");
		} catch (Exception e) {}
	}

	@Test
	public void getPositionTest() {
		try{
			int retorn = instance.getPosition();
		} catch (Exception e) {}
	}

	@Test
	public void getZindexTest() {
		try{
			int retorn = instance.getZindex();
		} catch (Exception e) {}
	}

	@Test
	public void withZindexTestint() {
		try{
			com.drpicox.game.card.CardFactorySettings retorn = instance.withZindex(0);
		} catch (Exception e) {}
	}

	@Test
	public void getCardConstantsTest() {
		try{
			com.drpicox.game.constants.Constants retorn = instance.getCardConstants();
		} catch (Exception e) {}
	}

	@Test
	public void withPositionTestint() {
		try{
			com.drpicox.game.card.CardFactorySettings retorn = instance.withPosition(0);
		} catch (Exception e) {}
	}

	@Test
	public void getCardNameTest() {
		try{
			java.lang.String retorn = instance.getCardName();
		} catch (Exception e) {}
	}

	@Test
	public void withCardConstantsTestConstants() {
		try{
			com.drpicox.game.card.CardFactorySettings retorn = instance.withCardConstants(null);
		} catch (Exception e) {}
	}

	@Test
	public void hasZindexTest() {
		try{
			boolean retorn = instance.hasZindex();
		} catch (Exception e) {}
	}

	@Test
	public void withCardNameTestString() {
		try{
			com.drpicox.game.card.CardFactorySettings retorn = instance.withCardName(" ");
		} catch (Exception e) {}
	}

	@Test
	public void hasPositionTest() {
		try{
			boolean retorn = instance.hasPosition();
		} catch (Exception e) {}
	}

}
