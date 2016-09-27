package offshorePass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class OffshorePassApplication {
	/*
	 * Member variables
	 */
	private Date applicationDate = null;
	private String applicationType;
	private List<OffshorePass> offshorePasses;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
	private Date appDate = new Date();
	//private Date today = Calendar.getInstance().getTime();
	/*
	 * Constructor/s
	 */
	public OffshorePassApplication(){
		
	}
	
	public OffshorePassApplication(Date applicationDate, String applicationType){
		this.applicationDate = applicationDate;
		this.applicationType = applicationType;
	}
	/*
	 * Getters and Setters
	 */
	public Date getApplicationDate() {
		return applicationDate;
	}

	public void setApplicationDate(Date dateString) {
		try {
			//appDate = sdf.parse(dateString);
			appDate = dateString;
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.applicationDate = appDate;
	}

	public String getApplicationType() {
		return applicationType;
	}

	public void setApplicationType(String applicationType) {
		this.applicationType = applicationType;
	}

	public List<OffshorePass> getOffshorePasses() {
		return this.offshorePasses;
	}

	public void setOffshorePasses(List<OffshorePass> offshorePasses) {
		this.offshorePasses = offshorePasses;
	}
	
}
