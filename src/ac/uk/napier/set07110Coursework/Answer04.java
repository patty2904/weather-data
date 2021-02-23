package ac.uk.napier.set07110Coursework;

import java.util.ArrayList;

import weather.WeatherData;

/**
 * QUESTION 04
 * 
 * If you decide to answer question 04 then the main method below should be used
 * as the entry point for your application You may use as many other classes as
 * you feel necessary as long as all code is supplied
 * 
 * Remember to add -Xmx1024m to the VM arguments using menu run --> run
 * configurations in eclipse
 */
public class Answer04 {
	public static void main(String[] args) {
		System.out.println("Question 04");
		double lowTemp = 0.0;
		ArrayList<String> dateList = new ArrayList<String>();
		// get the weather data
		String[] weatherData = WeatherData.getData();
		// go over every element in this array
		for (int i = 1; i < weatherData.length; i++) {
			String line = weatherData[i];
			String[] elements = line.split(",");
			// set the fifth element to month etc.
			String month = elements[5];
			String date = elements[6];
			String temperature = elements[9];
			// convert temperature to a double to store it as a decimal
			double temp = Double.parseDouble(temperature);
			// create a new string to store the date and month
			String currentdate = date + " " + month;
			// if the temperature is 0.0 or less
			if (temp <= lowTemp) {
				// checks if the date isn't in the array list
				if (!dateList.contains(currentdate)) {
					// if the datelist doesnt contain the date and month, add it to currentdate
					dateList.add(currentdate);
				}

			}

		}
		// print the size of dateList
		System.out.println(dateList.size());
	}
}
