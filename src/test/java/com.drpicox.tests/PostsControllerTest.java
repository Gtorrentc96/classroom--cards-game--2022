package com.drpicox.tests;
import com.drpicox.game.blog.api.PostsController;
import org.junit.Test;

public class PostsControllerTest {

	PostsController instance;

	@Test
	public void PostsControllerTestBlogService() {
		try{
			instance = new PostsController(/*1*//*BlogService*/new com.drpicox.game.blog.BlogService(
				/*2*/));
		} catch (Exception e) {}
	}

	@Test
	public void listPostsTest() {
		try{
			com.drpicox.game.blog.api.ListPostsDTO retorn = instance.listPosts();
		} catch (Exception e) {}
	}

	@Test
	public void getPostTestString() {
		try{
			com.drpicox.game.blog.api.PostDTO retorn = instance.getPost(" ");
		} catch (Exception e) {}
	}

	@Test
	public void lambda$listPosts$0TestListPostsDTOPost() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("lambda$listPosts$0");
			method.setAccessible(true);
			method.invoke(instance, null, null);
		} catch (Exception e) {}
	}

}
