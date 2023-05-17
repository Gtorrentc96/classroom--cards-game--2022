package com.drpicox.tests;
import com.drpicox.game.idea.IdeaService;
import org.junit.Test;

public class IdeaServiceTest {

	IdeaService instance;

	@Test
	public void IdeaServiceTestIdeaRepository() {
		try{
			instance = new IdeaService(/*1*//*IdeaRepository*/null);
		} catch (Exception e) {}
	}

	@Test
	public void findAllTest() {
		try{
			java.util.List retorn = instance.findAll();
		} catch (Exception e) {}
	}

	@Test
	public void findIdeaByIdTestString() {
		try{
			java.util.Optional retorn = instance.findIdeaById(" ");
		} catch (Exception e) {}
	}

	@Test
	public void findIdeaTestPredicate() {
		try{
			java.util.Optional retorn = instance.findIdea(null);
		} catch (Exception e) {}
	}

	@Test
	public void increaseXpTestIdea() {
		try{
			instance.increaseXp(null);
		} catch (Exception e) {}
	}

	@Test
	public void findByNameTestString() {
		try{
			java.util.Optional retorn = instance.findByName(" ");
		} catch (Exception e) {}
	}

}
