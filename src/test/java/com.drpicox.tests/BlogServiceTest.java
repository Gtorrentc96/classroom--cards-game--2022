package com.drpicox.tests;
import com.drpicox.game.blog.BlogService;
import org.junit.Test;

public class BlogServiceTest {

	BlogService instance;

	@Test
	public void BlogServiceTest() {
		try{
			instance = new BlogService(/*1*/);
		} catch (Exception e) {}
	}

	@Test
	public void lambda$findPost$0TestStringPost() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("lambda$findPost$0");
			method.setAccessible(true);
			boolean retorn = (boolean)method.invoke(instance, " ", null);
		} catch (Exception e) {}
	}

	@Test
	public void findAllTest() {
		try{
			java.util.List retorn = instance.findAll();
		} catch (Exception e) {}
	}

	@Test
	public void getResourceBlogFilesTest() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("getResourceBlogFiles");
			method.setAccessible(true);
			java.io.File[] retorn = (java.io.File[])method.invoke(instance);
		} catch (Exception e) {}
	}

	@Test
	public void loadPostTestStringFile() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("loadPost");
			method.setAccessible(true);
			com.drpicox.game.blog.Post retorn = (com.drpicox.game.blog.Post)method.invoke(instance, " ", null);
		} catch (Exception e) {}
	}

	@Test
	public void loadAllTest() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("loadAll");
			method.setAccessible(true);
			java.util.List retorn = (java.util.List)method.invoke(instance);
		} catch (Exception e) {}
	}

	@Test
	public void getBlogUriTest() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("getBlogUri");
			method.setAccessible(true);
			java.net.URI retorn = (java.net.URI)method.invoke(instance);
		} catch (Exception e) {}
	}

	@Test
	public void findPostTestString() {
		try{
			java.util.Optional retorn = instance.findPost(" ");
		} catch (Exception e) {}
	}

}
