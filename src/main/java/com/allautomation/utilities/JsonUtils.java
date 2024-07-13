package com.allautomation.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

import com.allautomation.constants.FrameworkConstants;
import com.allautomation.enums.ConfigProperties;

public class JsonUtils {
	private JsonUtils() {

	}


	private static Map<String, String> CONIFGMAP=new HashMap<>();

	static {
		try {
			
			CONIFGMAP=new ObjectMapper().readValue(new File(FrameworkConstants.getJsonFilepath()), new TypeReference<HashMap<String,String>>(){});

			
		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}
	}

	public static String get(ConfigProperties key) throws Exception {
		if (Objects.isNull(key) || Objects.isNull(CONIFGMAP.get(key.name().toLowerCase()))) {
			throw new Exception("Property Name " + key + "is not found.Please check config.properties file ");
		}
		return CONIFGMAP.get(key.name().toLowerCase());
	}

	

}
