package com.drpicox.tests;
import com.drpicox.game.card.api.DerivedStackDTO;
import org.junit.Test;

public class DerivedStackDTOTest {

	DerivedStackDTO instance;

	@Test
	public void DerivedStackDTOTestintList() {
		try{
			instance = new DerivedStackDTO(/*1*//*int*/0,/*List*/new java.util.ArrayList());
		} catch (Exception e) {}
	}

	@Test
	public void getNameTestint() {
		try{
			java.lang.String retorn = instance.getName(0);
		} catch (Exception e) {}
	}

	@Test
	public void toStringTest() {
		try{
			java.lang.String retorn = instance.toString();
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
	public void getCardsTest() {
		try{
			java.util.List retorn = instance.getCards();
		} catch (Exception e) {}
	}

}
