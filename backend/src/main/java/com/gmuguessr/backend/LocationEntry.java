
/** 
 * @author Alex Choi
 * 
 * Creates a location entry structure that holds 2 values that define
 * a location: Latitude and Longitude.
 *
 */
public class LocationEntry {
	
	// Instance variables
	private double latitude;
	private double longitude;
	
	/**
	 *  Default constructor that initializes values to 0
	 */
	public LocationEntry() {
		latitude = 0;
		longitude = 0;
	}
	
	/**
	 * Overloaded constructor that initializes values using input
	 * 
	 * @param 	newLatitude
	 * @param 	newLongitude
	 */
	public LocationEntry(double newLatitude, double newLongitude) {
		latitude = newLatitude;
		longitude = newLongitude;
	}
	
	/**
	 * Returns the latitude value of location entry. 
	 * 
	 * @return	The latitude value of location entry
	 */
	public double getLatitude() {
		return latitude;
	}
	
	/**
	 * Sets a new latitude for location entry.
	 * 
	 * @param 	latitude
	 */
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	
	/**
	 * Returns the longitude value of location entry. 
	 * 
	 * @return	The longitude value of location entry
	 */
	public double getLongitude() {
		return longitude;
	}

	/**
	 * Sets a new longitude for location entry.
	 * 
	 * @param	longitude
	 */
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}


}
