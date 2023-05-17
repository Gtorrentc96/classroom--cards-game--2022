package com.drpicox.tests;
import com.drpicox.game.blog.IllegalPostFileFormatException;
import org.junit.Test;

public class IllegalPostFileFormatExceptionTest {

	IllegalPostFileFormatException instance;

	@Test
	public void IllegalPostFileFormatExceptionTestStringintString() {
		try{
			instance = new IllegalPostFileFormatException(/*1*//*String*/" ",/*int*/0,/*String*/" ");
		} catch (Exception e) {}
	}

}
