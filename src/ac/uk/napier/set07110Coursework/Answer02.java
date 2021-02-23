package ac.uk.napier.set07110Coursework;

import weather.WeatherData;

/**
 * QUESTION 02
 * 
 * If you decide to answer question 02 then the main method below should be used
 * as the entry point for your application You may use as many other classes as
 * you feel necessary as long as all code is supplied
 * 
 * Remember to add -Xmx1024m to the VM arguments using menu run --> run
 * configurations in eclipse
 */
public class Answer02 {
	public static void main(String[] args) {
		System.out.println("Question 02");
		// initialise variables which we will use later
		double minValue = Double.MAX_VALUE; // minValue holds a really big number
		int tempSiteId = 0;
		String tempSiteName = " ";
		int tempYear = 0;
		int tempMonth = 0;
		int tempDate = 0;
		int tempHour = 0;

		String[] weatherData = WeatherData.getData(); // get weather data
		// loop through every weather data element
		for (int i = 1; i < weatherData.length; i++) {
			String line = weatherData[i];
			// split all the elements in weather data
			String[] elements = line.split(",");
			// create a string called SiteId and store all the elements from weather data at
			// index 0 etc.
			String stringSiteId = elements[0];
			// convert siteId to an int etc.
			int siteId = Integer.parseInt(stringSiteId);
			String siteName = elements[1];
			String yearString = elements[4];
			int year = Integer.parseInt(yearString);
			String monthString = elements[5];
			int month = Integer.parseInt(monthString);
			String dateString = elements[6];
			int date = Integer.parseInt(dateString);
			String hourString = elements[7];
			int hour = Integer.parseInt(hourString);
			String temperature = elements[9];
			double temp = Double.parseDouble(temperature);
			/*
			 * each temperature is compared with the max number because we don't know what
			 * the biggest number could be and it then finds a number that is the smallest
			 * one against its comparison. then it sets these variables to my new variables
			 * in comparison with what this smallest temperature is.
			 */
			if (temp < minValue) {
				// the minimum value is now the temperature
				minValue = temp;
				tempSiteId = siteId;
				tempSiteName = siteName;
				tempYear = year;
				tempMonth = month;
				tempDate = date;
				tempHour = hour;
			}
		}
		// print the new variables
		System.out.println(tempSiteId + ", " + tempSiteName + ", " + minValue + ", " + tempYear + ", " + tempMonth
				+ ", " + tempDate + ", " + tempHour);
	}
}
