package com.drpicox.tests;
import com.drpicox.game.blog.AuthorsService;
import org.junit.Test;

public class AuthorsServiceTest {

	AuthorsService instance;

	@Test
	public void AuthorsServiceTestConstantsLoader() {
		try{
			instance = new AuthorsService(/*1*//*ConstantsLoader*/new com.drpicox.game.constants.ConstantsLoader(
				/*2*/));
		} catch (Exception e) {}
	}

	@Test
	public void getAuthorsTest() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("getAuthors");
			method.setAccessible(true);
			com.drpicox.game.constants.Constants retorn = (com.drpicox.game.constants.Constants)method.invoke(instance);
		} catch (Exception e) {}
	}

	@Test
	public void readAuthorsFileTest() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("readAuthorsFile");
			method.setAccessible(true);
			com.drpicox.game.constants.Constants retorn = (com.drpicox.game.constants.Constants)method.invoke(instance);
		} catch (Exception e) {}
	}

	@Test
	public void getGitHubUsersTest() {
		try{
			java.util.Collection retorn = instance.getGitHubUsers();
		} catch (Exception e) {}
	}

	@Test
	public void containsGitHubUserTestString() {
		try{
			boolean retorn = instance.containsGitHubUser(" ");
		} catch (Exception e) {}
	}

}
