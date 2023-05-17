package com.drpicox.tests;
import com.drpicox.game.tag.TagService;
import org.junit.Test;

public class TagServiceTest {

	TagService instance;

	@Test
	public void TagServiceTestTagRepository() {
		try{
			instance = new TagService(/*1*//*TagRepository*/null);
		} catch (Exception e) {}
	}

	@Test
	public void findAllByTagNameTestString() {
		try{
			java.util.List retorn = instance.findAllByTagName(" ");
		} catch (Exception e) {}
	}

}
