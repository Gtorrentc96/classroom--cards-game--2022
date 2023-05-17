package com.drpicox.tests;
import com.drpicox.game.tag.TagFactory;
import org.junit.Test;

public class TagFactoryTest {

	TagFactory instance;

	@Test
	public void TagFactoryTestTagRepository() {
		try{
			instance = new TagFactory(/*1*//*TagRepository*/null);
		} catch (Exception e) {}
	}

	@Test
	public void makeAllTagsTestTagFactorySettings() {
		try{
			java.util.List retorn = instance.makeAllTags(null);
		} catch (Exception e) {}
	}

}
