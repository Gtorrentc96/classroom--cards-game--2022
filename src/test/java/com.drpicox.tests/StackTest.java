package com.drpicox.tests;
import com.drpicox.game.card.Stack;
import org.junit.Test;

public class StackTest {

	Stack instance;

	@Test
	public void StackTestintList() {
		try{
			instance = new Stack(/*1*//*int*/0,/*List*/new java.util.ArrayList());
		} catch (Exception e) {}
	}

	@Test
	public void getNameTestint() {
		try{
			java.lang.String retorn = instance.getName(0);
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
	public void insertTestCardint() {
		try{
			java.util.ArrayList retorn = instance.insert(null, 0);
		} catch (Exception e) {}
	}

	@Test
	public void sizeTest() {
		try{
			int retorn = instance.size();
		} catch (Exception e) {}
	}

	@Test
	public void getPositionTest() {
		try{
			int retorn = instance.getPosition();
		} catch (Exception e) {}
	}

	@Test
	public void getTopCardTest() {
		try{
			com.drpicox.game.card.Card retorn = instance.getTopCard();
		} catch (Exception e) {}
	}

	@Test
	public void cutTestCard() {
		try{
			java.util.List retorn = instance.cut(null);
		} catch (Exception e) {}
	}

	@Test
	public void stackOverTestList() {
		try{
			java.util.List retorn = instance.stackOver(null);
		} catch (Exception e) {}
	}

	@Test
	public void getCardsTest() {
		try{
			java.util.List retorn = instance.getCards();
		} catch (Exception e) {}
	}

	@Test
	public void getBottomCardTest() {
		try{
			com.drpicox.game.card.Card retorn = instance.getBottomCard();
		} catch (Exception e) {}
	}

	@Test
	public void getSummaryTestintint() {
		try{
			com.drpicox.game.card.CardListSummary retorn = instance.getSummary(0, 0);
		} catch (Exception e) {}
	}

	@Test
	public void getMaxZindexTest() {
		try{
			int retorn = instance.getMaxZindex();
		} catch (Exception e) {}
	}

}
