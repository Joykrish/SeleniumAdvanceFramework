package com.allautomation.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

import com.allautomation.constants.FrameworkConstants;
import com.allautomation.enums.ConfigProperties;

public class PropertyUtils {

	private PropertyUtils() {

	}

	private static Properties property = new Properties();
	private static final Map<String, String> CONIFGMAP = new HashMap<>();

	static {
		try {
			FileInputStream file = new FileInputStream(FrameworkConstants.getPropertyFilepath());
			property.load(file);

			for (Map.Entry<Object, Object> entry : property.entrySet()) {
				CONIFGMAP.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()).trim());
			}
			
			//property.entrySet().forEach(entry->CONIFGMAP.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue())));
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

	public static String getValue(String key) throws Exception {

		if (Objects.isNull(property.getProperty(key)) || Objects.isNull(key)) {
			throw new Exception("Property Name " + key + "is not found.Please check config.properties file ");
		}
		return property.getProperty(key);
	}

}
