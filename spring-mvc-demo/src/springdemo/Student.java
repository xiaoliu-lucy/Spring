package springdemo;

import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private String favoritePL;
	private String[] ops;



	private LinkedHashMap<String,String> countryOption;
	
	// Empty constructor
	public Student() {
		countryOption = new LinkedHashMap<>();
		countryOption.put("BR", "Brazil");
		countryOption.put("CHN", "China");
		countryOption.put("UK", "United Kingdom");
		countryOption.put("JAP", "Japan");		
	}
	
	public LinkedHashMap<String, String> getCountryOption() {
		return countryOption;
	}

	// Getter and setter
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFavoritePL() {
		return favoritePL;
	}

	public void setFavoritePL(String favoritePL) {
		this.favoritePL = favoritePL;
	}
	public String[] getOps() {
		return ops;
	}

	public void setOps(String[] ops) {
		this.ops = ops;
	}
}
