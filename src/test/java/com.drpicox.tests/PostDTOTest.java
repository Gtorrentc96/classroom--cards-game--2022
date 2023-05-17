package com.drpicox.tests;
import com.drpicox.game.blog.api.PostDTO;
import org.junit.Test;

public class PostDTOTest {

	PostDTO instance;

	@Test
	public void PostDTOTestPost() {
		try{
			instance = new PostDTO(/*1*//*Post*/new com.drpicox.game.blog.Post(
				/*2*//*String*/" ",/*Map*/new java.util.HashMap<>(),/*String*/" ",/*String*/" ",/*String*/" "));
		} catch (Exception e) {}
	}

	@Test
	public void getIdTest() {
		try{
			java.lang.String retorn = instance.getId();
		} catch (Exception e) {}
	}

	@Test
	public void getBodyTest() {
		try{
			java.lang.String retorn = instance.getBody();
		} catch (Exception e) {}
	}

	@Test
	public void getTitleTest() {
		try{
			java.lang.String retorn = instance.getTitle();
		} catch (Exception e) {}
	}

}
