package springdemo;

import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import validation.MajorValid;


public class Student {
	private String firstName;
	@NotNull(message="is required")
	@Size(min=1,message="is required")
	private String lastName;
	@Min(value=0, message="must be greater than zero")
	@Max(value=99,message="must be smaller than 99")
	private int age;
	@MajorValid(value="F",message="Must start with F")
	private String major;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
}
