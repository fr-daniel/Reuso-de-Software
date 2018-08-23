package br.ufc.reuso.model;

public class Address {

	private int houseNumber;
	private String streetAddress;
	private String city;
	private String state;
	
	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", streetAddress=" + streetAddress + ", city=" + city
				+ ", state=" + state + "]";
	}

}