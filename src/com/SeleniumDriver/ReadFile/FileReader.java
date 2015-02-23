package com.SeleniumDriver.ReadFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.SeleniumDriver.Model.MainForm;

public class FileReader {

	
	private static final int FIRST_NAME = 0;
	private static final int LAST_NAME = 1;
	private static final int PASSWORD = 3;
	private static final int CONFIRM_PASSWORD = 4;
	private static final int EMAIL = 2;
	private static final int MONTH = 5;
	private static final int DAY = 6;
	private static final int YEAR = 7;
	private static final int GENDER = 8;
	private static final int COUNTRY_VALUE = 9;
	private static final int MOBILE = 10;
	private static final int CURRENT_EMAIL = 11;

	public static List<MainForm> readCsvData(String filePath) {
		BufferedReader br = null;
		String line = null;
		String cvsSplitBy = ",";
		List<MainForm> mainForms = new ArrayList<>();
		try {

			br = new BufferedReader(new java.io.FileReader(new File(filePath)));
			line = br.readLine();
			while ((line = br.readLine()) != null) {
				// use comma as separator
				String[] country = line.split(cvsSplitBy);

				MainForm mainForm = new MainForm(country[FIRST_NAME], country[LAST_NAME],country[EMAIL],country[PASSWORD],country[CONFIRM_PASSWORD],country[MONTH],country[DAY],country[YEAR],country[GENDER],country[COUNTRY_VALUE],country[MOBILE],country[CURRENT_EMAIL]);
				

				mainForms.add(mainForm);

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return mainForms;

	}

//	public static void main(String[] args) {
//		readCsvData("C:\\Users\\318759\\Desktop\\Book1.csv");
//	}
}
