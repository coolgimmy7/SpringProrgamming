package com.bridgelabz.lombok.cleanup;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import lombok.Cleanup;
import lombok.extern.java.Log;

@Log
public class testCleanup {

	public static void main(String[] args) throws IOException {

		Properties properties = new Properties();
		@Cleanup
		InputStream in = new FileInputStream("/home/admin1/Desktop/test.txt");
		properties.load(in);
		String key = properties.getProperty("private_key");
		log.info("key: " + key);
	}
}
