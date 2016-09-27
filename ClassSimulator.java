package offshorePass;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class ClassSimulator {
	/*
	 * Member variables
	 */
	private static OffshorePassApplication passApplication;
	private static Date todayDate;
	private static List<OffshorePass> offshorePasses = new LinkedList<OffshorePass>();
	private static Person person1 = new Person("John","","","","Doe");
	private static Person person2 = new Person("Maria","","","","Keys");
	private static OffshorePass pass1 = new OffshorePass(person1);
	private static OffshorePass pass2 = new OffshorePass(person2);
	//private static SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Create new application
		//Today's date is the default date
		todayDate = Calendar.getInstance().getTime();
		passApplication = new OffshorePassApplication(todayDate, "Temporary");
		//When using GUI, date can be specified by user
		//today = getDateInputfromUser
		//2. Create person/s
		//3. Create documents and tie in to the person object
		//4. Create offshore passes and pass the person object
		
		//5. Add the pass objects to the offshore pass list object
		offshorePasses.add(pass1);
		offshorePasses.add(pass2);
		//6. Assign offshore pass object to the pass application object
		passApplication.setOffshorePasses(offshorePasses);
		//7. Display details of the application
		System.out.println("The date of this application is " + passApplication.getApplicationDate());
		System.out.println("This application is for " + passApplication.getApplicationType() + " pass/es.");
		for (OffshorePass op : offshorePasses) {
			System.out.println(op.getPerson().getName());
		}
	}
	
}
