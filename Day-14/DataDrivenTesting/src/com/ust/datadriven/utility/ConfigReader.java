package com.ust.datadriven.utility;

import java.util.ResourceBundle;

public interface ConfigReader {
	/*
	 * To read the Config.properties file , we need a readymate class
	 * and that class is ResourceBundle
	 */
	final static ResourceBundle rb = ResourceBundle.getBundle("config");
	
	public static String getXLSPath(){
		// It is reading the xlspath key and giving the value of xlspath key
		return rb.getString("xlspath");
	}

}
