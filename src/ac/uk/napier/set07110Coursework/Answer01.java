package ac.uk.napier.set07110Coursework;

import java.util.HashSet;
import java.util.Set;
import weather.WeatherData;

/**
 * QUESTION 01
 * 
 * If you decide to answer question 01 then the main method below should be used
 * as the entry point for your application You may use as many other classes as
 * you feel necessary as long as all code is supplied
 * 
 * Remember to add -Xmx1024m to the VM arguments using menu run --> run
 * configurations in eclipse
 */
public class Answer01 {
	public static void main(String[] args) {
		System.out.println("Question 01");
		// hashset stores all the site id's
		Set<String> weatherSiteId = new HashSet<String>();
		// get all weather data
		String[] weatherData = WeatherData.getData();
		// loop through every weather data element
		for (int i = 1; i < weatherData.length; i++) {
			String line = weatherData[i];
			// split using a comma
			String[] elements = line.split(",");
			// create a string called SiteId and store all 
			// the elements from weather data at index 0
			String siteId = elements[0];
			// add all the siteId's to weatherSiteId
			weatherSiteId.add(siteId);
		}
		// print the size of weatherSiteId which we generated from the line above
		System.out.println(weatherSiteId.size());

	}
}
