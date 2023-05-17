package com.drpicox.tests;
import com.drpicox.game.moon.MoonService;
import org.junit.Test;

public class MoonServiceTest {

	MoonService instance;

	@Test
	public void MoonServiceTestList() {
		try{
			instance = new MoonService(/*1*//*List*/new java.util.ArrayList());
		} catch (Exception e) {}
	}

	@Test
	public void endMoonTest() {
		try{
			instance.endMoon();
		} catch (Exception e) {}
	}

}
