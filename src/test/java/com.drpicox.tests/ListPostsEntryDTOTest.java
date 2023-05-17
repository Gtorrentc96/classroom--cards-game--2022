package com.drpicox.tests;
import com.drpicox.game.blog.api.ListPostsEntryDTO;
import org.junit.Test;

public class ListPostsEntryDTOTest {

	ListPostsEntryDTO instance;

	@Test
	public void ListPostsEntryDTOTestPost() {
		try{
			instance = new ListPostsEntryDTO(/*1*//*Post*/new com.drpicox.game.blog.Post(
				/*2*//*String*/" ",/*Map*/new java.util.HashMap<>(),/*String*/" ",/*String*/" ",/*String*/" "));
		} catch (Exception e) {}
	}

	@Test
	public void getPropertyTestString() {
		try{
			java.lang.String retorn = instance.getProperty(" ");
		} catch (Exception e) {}
	}

	@Test
	public void getIdTest() {
		try{
			java.lang.String retorn = instance.getId();
		} catch (Exception e) {}
	}

	@Test
	public void getTitleTest() {
		try{
			java.lang.String retorn = instance.getTitle();
		} catch (Exception e) {}
	}

	@Test
	public void getFrontMatterTest() {
		try{
			java.util.Map retorn = instance.getFrontMatter();
		} catch (Exception e) {}
	}

}
