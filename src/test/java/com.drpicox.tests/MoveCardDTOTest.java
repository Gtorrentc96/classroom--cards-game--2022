package com.drpicox.tests;
import com.drpicox.game.card.api.MoveCardDTO;
import org.junit.Test;

public class MoveCardDTOTest {

	MoveCardDTO instance;

	@Test
	public void MoveCardDTOTestintint() {
		try{
			instance = new MoveCardDTO(/*1*//*int*/0,/*int*/0);
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

}
