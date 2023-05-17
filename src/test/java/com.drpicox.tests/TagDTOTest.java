package com.drpicox.tests;
import com.drpicox.game.tag.api.TagDTO;
import org.junit.Test;

public class TagDTOTest {

	TagDTO instance;

	@Test
	public void TagDTOTestTag() {
		try{
			instance = new TagDTO(/*1*//*Tag*/new com.drpicox.game.tag.Tag(
				/*2*//*String*/" ",/*String*/" ",/*int*/0));
		} catch (Exception e) {}
	}

	@Test
	public void getValueTest() {
		try{
			int retorn = instance.getValue();
		} catch (Exception e) {}
	}

}
