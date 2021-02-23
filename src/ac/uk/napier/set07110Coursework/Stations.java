package ac.uk.napier.set07110Coursework;

//create instance variables for the appropriate sections
public class Stations {
	private int siteId;
	private String siteName;
	private double lat;
	private double lon;

	// constructor to initialise objects before use
	public Stations(int siteId, String siteName, double lat, double lon) {
		this.siteId = siteId;
		this.siteName = siteName;
		this.lat = lat;
		this.lon = lon;
	}

	// method to return the instance variables 
	public int getSiteId() {
		return siteId;
	}
	public String getSiteName() {
		return siteName;
	}
	public double getLat() {
		return lat;
	}
	public double getLon() {
		return lon;
	}
    //generate toString method
	@Override
	public String toString() {
		return "Stations [siteId=" + siteId + ", siteName=" + siteName + ", lat=" + lat + ", lon=" + lon + "]";
	}

}
