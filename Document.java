package offshorePass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Document {
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
	private Date expiryDate = new Date();
	private Date today = Calendar.getInstance().getTime();
	
	//Constructors
	public Document(String dateString){
		setExpiryDate(dateString);
	}
	
	public Boolean isValid(){
		if (expiryDate.before(today)) {
			return false;
		}
		return true;
	}
	
	public Date getExpiryDate(){
		return expiryDate;
	}
	
	public void setExpiryDate(String dateString){
		
		try {
			expiryDate = sdf.parse(dateString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
