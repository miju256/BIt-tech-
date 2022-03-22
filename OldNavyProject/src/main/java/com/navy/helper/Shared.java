package com.navy.helper;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Shared {
	public static Properties readPropertyfile(String path) throws IOException {
		FileInputStream file = new FileInputStream(new File(path));
	Properties prop = new Properties();
	prop.load(file);
	return prop;
	
	}

	

}
