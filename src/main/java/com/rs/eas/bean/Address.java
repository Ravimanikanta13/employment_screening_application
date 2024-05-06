package com.rs.eas.bean;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private int addressId;
	private String currentAddress;
	private String currentCity;
	private String currentPostcode;
	private String currentCountry;
	private String currentMovedIn;

	@ElementCollection
	@CollectionTable(name = "PreviousAddress", joinColumns = @JoinColumn(name = "addressId"))
	private List<PreviousAddress> previousAddresses;

	public List<PreviousAddress> getPreviousAddresses() {
		return previousAddresses;
	}

	public void setPreviousAddresses(List<PreviousAddress> previousAddresses) {
		this.previousAddresses = previousAddresses;
	}

	@Embeddable
	public class PreviousAddress {
		private String address;
		private String city;
		private String postcode;
		private String country;
		private String movedIn;

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getPostcode() {
			return postcode;
		}

		public void setPostcode(String postcode) {
			this.postcode = postcode;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public String getMovedIn() {
			return movedIn;
		}

		public void setMovedIn(String movedIn) {
			this.movedIn = movedIn;
		}

		// getters and setters
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}

	public String getCurrentCity() {
		return currentCity;
	}

	public void setCurrentCity(String currentCity) {
		this.currentCity = currentCity;
	}

	public String getCurrentPostcode() {
		return currentPostcode;
	}

	public void setCurrentPostcode(String currentPostcode) {
		this.currentPostcode = currentPostcode;
	}

	public String getCurrentCountry() {
		return currentCountry;
	}

	public void setCurrentCountry(String currentCountry) {
		this.currentCountry = currentCountry;
	}

	public String getCurrentMovedIn() {
		return currentMovedIn;
	}

	public void setCurrentMovedIn(String currentMovedIn) {
		this.currentMovedIn = currentMovedIn;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

}
