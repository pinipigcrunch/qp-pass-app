package offshorePass;

import java.util.Date;

public class OffshorePass {
	private Date validFrom;
	private Date validTo;
	private Person person;
	private String[] accessAreas;
	private String passType;
	
	/*
	 * Constructor
	 */
	public OffshorePass(){
		
	}
	
	public OffshorePass(Person person){
		this.setPerson(person);
	}
	/*
	 * Getters and setters
	 */
	public Person getPerson(){
		return this.person;
	}
	public void setPerson(Person person){
		this.person = person;
	}
	public Date getValidFrom(){
		return this.validFrom;
	}
	public void setValidFrom(Date validFrom){
		this.validFrom = validFrom;
	}
	public Date getValidTo(){
		return this.validTo;
	}
	public void setValidTo(Date validTo){
		this.validTo = validTo;
	}
	public String[] getAccessAreas(){
		return this.accessAreas;
	}
	public void setAccessAreas(String[] accessAreas){
		this.accessAreas = accessAreas;
	}
	public String getPassType(){
		return this.passType;
	}
	public void setPassType(String passType){
		this.passType = passType;
	}
}
