package ac.uk.napier.set07110Coursework;

import weather.WeatherData;

/**
 * QUESTION 03
 * 
 * If you decide to answer question 03 then the main method below should be used
 * as the entry point for your application You may use as many other classes as
 * you feel necessary as long as all code is supplied
 * 
 * Remember to add -Xmx1024m to the VM arguments using menu run --> run
 * configurations in eclipse
 */
public class Answer03 {
	public static void main(String[] args) {
		System.out.println("Question 03");
		// declare variables
		// declare variable but set to be empty
		String tempSiteName = "";
		// desired siteId to compare values with later
		int wantedId = 3210;
		int sumSites = 0;
		double sumTemp = 0;
		double average;
		double minValue = Double.MAX_VALUE; // minimum temperature, compare with the biggest number
		double maxValue = Double.MIN_VALUE; // maximum temperature, compare with the smallest number
		String[] weatherData = WeatherData.getData(); // get the array
		for (int i = 1; i < weatherData.length; i++) { // go over every element in this array
			String line = weatherData[i];
			String[] elements = line.split(","); // split the weather data
			// create a string called SiteId and store all the elements from weather data at
			// index 0 etc.
			String siteIdString = elements[0];
			int siteIdInt = Integer.parseInt(siteIdString); // change siteId to be an int
			String siteName = elements[1];
			String temperature = elements[9];
			String monthString = elements[5];
			int monthInt = Integer.parseInt(monthString); // change Month to be an int
			double temp = Double.parseDouble(temperature); // change temperature to be a double
			// if the site id is the one we want and it is march and the temperature is the
			// lowest
			if (siteIdInt == wantedId && monthInt == 3 && temp < minValue) {
				// set the variables to new variables
				minValue = temp;
				tempSiteName = siteName;
			}
			// if the site id is the one we want and it is march and the temperature is the
			// highest
			if (siteIdInt == wantedId && monthInt == 3 && temp > maxValue) {
				// set the variables to new variables
				maxValue = temp;
				tempSiteName = siteName;
			}
			// if the site id is the one we want and it is march
			if (monthInt == 3 && siteIdInt == wantedId) {
				// increment sumSites each time
				sumSites++; // gets you the amount of entries for the particular weather station
				sumTemp += Double.parseDouble(temperature); // convert temperature to a double - add all the
															// temperatures to the variable
			}
		}
		average = sumTemp / sumSites; // number of all temperatures divided by all the number of all sites
		// print min value, max value and the average which we found out using the
		// variables below
		System.out.println("the minumum temperature is: " + minValue + " degrees" + " at site " + tempSiteName);
		System.out.println("the maximum temperature is: " + maxValue + " degrees " + " at site " + tempSiteName);
		System.out.println("the average temperature is: " + average + " degrees" + " at site " + tempSiteName);
	}
}
