package com.drpicox.tests;
import com.drpicox.game.card.StackService;
import org.junit.Test;

public class StackServiceTest {

	StackService instance;

	@Test
	public void StackServiceTestCardPositionServiceCardServiceCardRepository() {
		try{
			instance = new StackService(/*1*//*CardPositionService*/new com.drpicox.game.card.CardPositionService(
				/*2*//*CardRepository*/null,/*CardService*/new com.drpicox.game.card.CardService(
					/*3*//*CardRepository*/null,/*TagService*/new com.drpicox.game.tag.TagService(
						/*4*//*TagRepository*/null))),/*CardService*/new com.drpicox.game.card.CardService(
				/*2*//*CardRepository*/null,/*TagService*/new com.drpicox.game.tag.TagService(
					/*3*//*TagRepository*/null)),/*CardRepository*/null);
		} catch (Exception e) {}
	}

	@Test
	public void getStackTestint() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("getStack");
			method.setAccessible(true);
			com.drpicox.game.card.Stack retorn = (com.drpicox.game.card.Stack)method.invoke(instance, 0);
		} catch (Exception e) {}
	}

	@Test
	public void getStackTestCard() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("getStack");
			method.setAccessible(true);
			com.drpicox.game.card.Stack retorn = (com.drpicox.game.card.Stack)method.invoke(instance, null);
		} catch (Exception e) {}
	}

	@Test
	public void findAllStackTestPredicate() {
		try{
			java.util.List retorn = instance.findAllStack(null);
		} catch (Exception e) {}
	}

	@Test
	public void findAllStackTest() {
		try{
			java.util.List retorn = instance.findAllStack();
		} catch (Exception e) {}
	}

	@Test
	public void discardStackTestint() {
		try{
			instance.discardStack(0);
		} catch (Exception e) {}
	}

	@Test
	public void discardStackTestStack() {
		try{
			instance.discardStack(null);
		} catch (Exception e) {}
	}

	@Test
	public void splitAndDiscardTestCard() {
		try{
			instance.splitAndDiscard(null);
		} catch (Exception e) {}
	}

	@Test
	public void findAllStackByBottomCardNameTestString() {
		try{
			java.util.List retorn = instance.findAllStackByBottomCardName(" ");
		} catch (Exception e) {}
	}

	@Test
	public void splitAndStackOnTopOfTestCardCard() {
		try{
			instance.splitAndStackOnTopOf(null, null);
		} catch (Exception e) {}
	}

	@Test
	public void splitAndStackOnTopOfTestCardint() {
		try{
			instance.splitAndStackOnTopOf(null, 0);
		} catch (Exception e) {}
	}

}
