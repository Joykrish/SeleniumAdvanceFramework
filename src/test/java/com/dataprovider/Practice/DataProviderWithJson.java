package com.dataprovider.Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataProviderWithJson {
	
	@Test(dataProvider = "getData1")
	public void test2(Map<String,Object>map) {
		map.forEach((k,v)->System.out.println(k+""+v));;
	}
	@DataProvider
	public Object[]   getData() throws IOException {
		HashMap<String,Object> map1=new ObjectMapper().readValue(new File(System.getProperty("user.dir")+"\\src\\test\\resources\\config\\config1.json"),new TypeReference<HashMap<String,Object>>(){});
		HashMap<String,Object> map2=new ObjectMapper().readValue(new File(System.getProperty("user.dir")+"\\src\\test\\resources\\config\\config2.json"),new TypeReference<HashMap<String,Object>>(){});
		return new Object[] {map1,map2};	
	}
	
	

		
		
	
	
	

}
