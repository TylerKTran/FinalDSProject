package application;

public class Restaurant {
	private String address;
	private String phoneNumber;
	private String email;
	private String hours;
	private String cuisineType;
	private String diningType;
	private String priceRange;

	public Restaurant(String address, String phoneNumber, String email, String hours, String cuisineType,
			String diningType, String priceRange) {
			this.address = address;
			this.phoneNumber = phoneNumber;
			this.email = email;
			this.hours = hours;
			this.cuisineType = cuisineType;
			this.diningType = diningType;
			this.priceRange = priceRange;

	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHours() {
		return hours;
	}

	public void setHours(String hours) {
		this.hours = hours;
	}

	public String getCuisineType() {
		return cuisineType;
	}

	public void setCuisineType(String cuisineType) {
		this.cuisineType = cuisineType;
	}

	public String getDiningType() {
		return diningType;
	}

	public void setDiningType(String diningType) {
		this.diningType = diningType;
	}

	public String getPriceRange() {
		return priceRange;
	}

	public void setPriceRange(String priceRange) {
		this.priceRange = priceRange;
	}

}
