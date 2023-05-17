package com.drpicox.tests;
import com.drpicox.game.util.PossiblePick;
import org.junit.Test;

public class PossiblePickTest {

	PossiblePick instance;

	@Test
	public void PossiblePickTestStringint() {
		try{
			instance = new PossiblePick(/*1*//*String*/" ",/*int*/0);
		} catch (Exception e) {}
	}

	@Test
	public void getNameTest() {
		try{
			java.lang.String retorn = instance.getName();
		} catch (Exception e) {}
	}

	@Test
	public void getPossibilitiesTest() {
		try{
			int retorn = instance.getPossibilities();
		} catch (Exception e) {}
	}

}
