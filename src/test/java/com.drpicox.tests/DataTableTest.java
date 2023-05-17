package com.drpicox.tests;
import com.drpicox.game.util.DataTable;
import org.junit.Test;

public class DataTableTest {

	DataTable instance;

	@Test
	public void DataTableTestList() {
		try{
			instance = new DataTable(/*1*//*List*/new java.util.ArrayList());
		} catch (Exception e) {}
	}

	@Test
	public void lambda$getColumn$0TestStringDataTableRow() {
		try{
			java.lang.reflect.Method method = instance.getClass().getDeclaredMethod("lambda$getColumn$0");
			method.setAccessible(true);
			java.lang.String retorn = (java.lang.String)method.invoke(instance, " ", null);
		} catch (Exception e) {}
	}

	@Test
	public void getColumnTestString() {
		try{
			java.util.List retorn = instance.getColumn(" ");
		} catch (Exception e) {}
	}

	@Test
	public void getRowsTest() {
		try{
			java.util.List retorn = instance.getRows();
		} catch (Exception e) {}
	}

}
