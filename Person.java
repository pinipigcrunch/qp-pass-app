package offshorePass;

import java.util.Date;
import java.util.List;

public class Person {
	// These are the member variables of a person
	private String firstName;
	private String secondName;
	private String thirdName;
	private String fourthName;
	private String lastName;
	private String AfirstName;
	private String AsecondName;
	private String AthirdName;
	private String AfourthName;
	private String AlastName;
	private Date birthDate;
	private String sex;
	private String nationality;
	private String remarks;
	private List<Document> documents;
	
	/*
	 * Constructors
	 */
	public Person(String fName, String sName, String tName, String fthName, String lName){
		this.firstName = fName;
		this.secondName = sName;
		this.thirdName = tName;
		this.fourthName = fName;
		this.lastName = lName;
	}
	
	public String getName() {
		/**
		 * This method combines the firstName, secondName and lastName of the person
		 * and return the name of the person. If secondName is empty, only firstName and lastName is combined.
		 */
		String name;
		if (secondName != null && !secondName.isEmpty() && secondName.length() > 0){
			name = firstName + " " + secondName + " " + lastName;
		} else {
			name = firstName + " " + lastName;
		}
		return name;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public String getThirdName() {
		return thirdName;
	}
	public void setThirdName(String thirdName) {
		this.thirdName = thirdName;
	}
	public String getFourthName() {
		return fourthName;
	}
	public void setFourthName(String fourthName) {
		this.fourthName = fourthName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getAsecondName() {
		return AsecondName;
	}
	
	public void setAsecondName(String asecondName) {
		AsecondName = asecondName;
	}
	/**
	 * @return the afirstName
	 */
	public String getAfirstName() {
		return AfirstName;
	}
	/**
	 * @param afirstName the afirstName to set
	 */
	public void setAfirstName(String afirstName) {
		AfirstName = afirstName;
	}
	/**
	 * @return the afourthName
	 */
	public String getAfourthName() {
		return AfourthName;
	}
	/**
	 * @param afourthName the afourthName to set
	 */
	public void setAfourthName(String afourthName) {
		AfourthName = afourthName;
	}
	public String getAthirdName() {
		return AthirdName;
	}
	public void setAthirdName(String athirdName) {
		AthirdName = athirdName;
	}
	public String getAlastName() {
		return AlastName;
	}
	public void setAlastName(String alastName) {
		AlastName = alastName;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
}
