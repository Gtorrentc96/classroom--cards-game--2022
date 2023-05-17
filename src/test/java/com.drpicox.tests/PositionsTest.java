package com.drpicox.tests;
import com.drpicox.game.util.Positions;
import org.junit.Test;

public class PositionsTest {

	Positions instance;

	@Test
	public void byPositionTestint() {
		try{
			java.util.function.Predicate retorn = Positions.byPosition(0);
		} catch (Exception e) {}
	}

	@Test
	public void lambda$byPosition$0TestintHasPosition() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("lambda$byPosition$0");
			method.setAccessible(true);
			boolean retorn = (boolean)method.invoke(instance, 0, null);
		} catch (Exception e) {}
	}

}
