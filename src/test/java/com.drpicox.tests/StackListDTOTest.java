package com.drpicox.tests;
import com.drpicox.game.card.api.StackListDTO;
import org.junit.Test;

public class StackListDTOTest {

	StackListDTO instance;

	@Test
	public void getStackTestGameDTOPredicate() {
		try{
			com.drpicox.game.card.api.DerivedStackDTO retorn = StackListDTO.getStack(null, null);
		} catch (Exception e) {}
	}

	@Test
	public void getFreePositionTestGameDTO() {
		try{
			int retorn = StackListDTO.getFreePosition(null);
		} catch (Exception e) {}
	}

	@Test
	public void lambda$getStackByPosition$0TestintCardDTO() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("lambda$getStackByPosition$0");
			method.setAccessible(true);
			boolean retorn = (boolean)method.invoke(instance, 0, null);
		} catch (Exception e) {}
	}

	@Test
	public void findAllStackTestGameDTOPredicate() {
		try{
			java.util.List retorn = StackListDTO.findAllStack(null, null);
		} catch (Exception e) {}
	}

	@Test
	public void findAllStackTestGameDTO() {
		try{
			java.util.List retorn = StackListDTO.findAllStack(null);
		} catch (Exception e) {}
	}

	@Test
	public void getStackByPositionTestListint() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("getStackByPosition");
			method.setAccessible(true);
			com.drpicox.game.card.api.DerivedStackDTO retorn = (com.drpicox.game.card.api.DerivedStackDTO)method.invoke(instance, null, 0);
		} catch (Exception e) {}
	}

}
