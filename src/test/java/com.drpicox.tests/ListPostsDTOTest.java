package com.drpicox.tests;
import com.drpicox.game.blog.api.ListPostsDTO;
import org.junit.Test;

public class ListPostsDTOTest {

	ListPostsDTO instance;

	@Test
	public void ListPostsDTOTest() {
		try{
			instance = new ListPostsDTO(/*1*/);
		} catch (Exception e) {}
	}

	@Test
	public void addPostTestPost() {
		try{
			instance.addPost(null);
		} catch (Exception e) {}
	}

	@Test
	public void getPostsTest() {
		try{
			java.util.List retorn = instance.getPosts();
		} catch (Exception e) {}
	}

}
