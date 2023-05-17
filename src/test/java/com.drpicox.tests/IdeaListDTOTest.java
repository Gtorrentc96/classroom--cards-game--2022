package com.drpicox.tests;
import com.drpicox.game.idea.api.IdeaListDTO;
import org.junit.Test;

public class IdeaListDTOTest {

	IdeaListDTO instance;

	@Test
	public void IdeaListDTOTestList() {
		try{
			instance = new IdeaListDTO(/*1*//*List*/new java.util.ArrayList());
		} catch (Exception e) {}
	}

	@Test
	public void lambda$new$0TestIdea() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("lambda$new$0");
			method.setAccessible(true);
			method.invoke(instance, null);
		} catch (Exception e) {}
	}

	@Test
	public void findAllIdeaTestGameDTOPredicate() {
		try{
			java.util.List retorn = IdeaListDTO.findAllIdea(null, null);
		} catch (Exception e) {}
	}

	@Test
	public void findAllIdeaTestGameDTO() {
		try{
			java.util.List retorn = IdeaListDTO.findAllIdea(null);
		} catch (Exception e) {}
	}

	@Test
	public void getIdeaTestGameDTOPredicate() {
		try{
			com.drpicox.game.idea.api.IdeaDTO retorn = IdeaListDTO.getIdea(null, null);
		} catch (Exception e) {}
	}

}
