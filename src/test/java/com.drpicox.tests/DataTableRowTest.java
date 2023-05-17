package com.drpicox.tests;
import com.drpicox.game.util.DataTableRow;
import org.junit.Test;

public class DataTableRowTest {

	DataTableRow instance;

	@Test
	public void DataTableRowTestString$$Map() {
		try{
			instance = new DataTableRow(/*1*//*String[]*/new java.lang.String[]{},/*Map*/new java.util.HashMap<>());
		} catch (Exception e) {}
	}

	@Test
	public void getTestString() {
		try{
			java.lang.String retorn = instance.get(" ");
		} catch (Exception e) {}
	}

	@Test
	public void getTestint() {
		try{
			java.lang.String retorn = instance.get(0);
		} catch (Exception e) {}
	}

	@Test
	public void getIntTestint() {
		try{
			int retorn = instance.getInt(0);
		} catch (Exception e) {}
	}

	@Test
	public void getIntTestString() {
		try{
			int retorn = instance.getInt(" ");
		} catch (Exception e) {}
	}

	@Test
	public void getFieldsTest() {
		try{
			java.lang.String[] retorn = instance.getFields();
		} catch (Exception e) {}
	}

}
