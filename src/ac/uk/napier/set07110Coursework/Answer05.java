package ac.uk.napier.set07110Coursework;

import java.util.ArrayList;

import weather.WeatherData;

/**
 * QUESTION 05
 * 
 * If you decide to answer question 05 then the main method below should be used
 * as the entry point for your application You may use as many other classes as
 * you feel necessary as long as all code is supplied
 * 
 * Remember to add -Xmx1024m to the VM arguments using menu run --> run
 * configurations in eclipse
 */
public class Answer05 {
	public static void main(String[] args) {
		System.out.println("Question 05");
		//class called "Stations" is used for Answer05
		// create an array list
		ArrayList<Stations> station = new ArrayList<>();
		// get the array
		String[] weatherData = WeatherData.getData(); 
		// go over every element in this array
		for (int i = 1; i < weatherData.length; i++) { 
			String line = weatherData[i];
			String[] elements = line.split(",");
			String siteIdString = elements[0];
			//convert to integer
			int siteIdInt = Integer.parseInt(siteIdString);
			String siteName = elements[1];
			String latitudeString = elements[2];
			double latitudeDouble = Double.parseDouble(latitudeString);
			String longitudeString = elements[3];
			double longitudeDouble = Double.parseDouble(longitudeString);
            //create new object linking back to the class Stations
			Stations stat = new Stations(siteIdInt, siteName, latitudeDouble, longitudeDouble);
			//add the stations to stat
			station.add(stat);
		}
		//sets the variable to the specified index of station
		Stations mostNortherlyStation = station.get(0);
		//go over all the stations
		for (Stations stat : station) {
			/* if the station's lat is greater than the most northerly stations' lat
			 * this station becomes the most northerly station
			 */
			if (stat.getLat() > mostNortherlyStation.getLat()) {
				mostNortherlyStation = stat;

			}
		}
		System.out.println("Site name: " + mostNortherlyStation.getSiteName());
		System.out.println("Site ID: " + mostNortherlyStation.getSiteId());
		System.out.println("Longitude: " + mostNortherlyStation.getLon());
		System.out.println("Latitude: " + mostNortherlyStation.getLat());
	}
}
