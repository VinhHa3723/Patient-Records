import java.util.Objects;

/** 
    The PatientRecord class represents a record of a patient's information. 
    It captures information like the patient's ID, the date of the visit, 
    the reason for the visit, and the treatment that the patient received.
 */
public class PatientRecord
{
   	private int id;
   	private int month;
    	private int day;
    	private int year;
    	private String reason;
    	private String treatment;
	
	/** 
	*	Constructor with specified parameters that initializes the state of 
	*	the object when it is created.
	*
	*	@param id 		The patient's ID number.
	*	@param month 	The month of the visit (1-12).
	*	@param day 		The day of the visit (1-31). 
	*	@param year 	The year of the visit (>1900).
	*	@param reason 	The reason for the visit. 
	*	@param treatment The prescribed treatment.
	* 	@throws BadVisitDateException 	If the provided date is not valid.
	*/
	public PatientRecord(int id, int month, int day, int year, String reason, String treatment) throws BadVisitDateException
	{
		this.id = id;
        	this.month = month;
        	this.day = day;
        	this.year = year;
        	this.reason = reason;
        	this.treatment = treatment;
		
		// Checks to see if the date meets requirements, throws an 
		// exception if not.
		if (month < 1 || month > 12)
		{
			throw new BadVisitDateException("Month not in range 1-12");
		}
		else if (day < 1 || day > 31)
		{
			throw new BadVisitDateException("Day not in range 1-31");
		}
		else if (year < 1900)
		{
			throw new BadVisitDateException("Year not greater than 1900");
		}
	}
	
	/** 
	*	Displays a summary of the patient's information with correct format.
	*	@return A string representation of the patient's records.	
	*/
	public String toString()
	{
		return "Patient:" + id + " [" + month + "/" + day + "/" + year + 
		       "] " + "Complaint: " + reason + " Prescribed: " + treatment;
	}
	
	/** 
	*	Create a hash code value for a patient's record.
	*	@return result The computed hash code.
	*/
	@Override
	public int hashCode()
	{
		// Prime hash number
		final int prime = 37;
		// Holds the accumulated hash code
		int result = 1;
		
		result = prime * result + id;
		result = prime * result + month;
		result = prime * result + day;
		result = prime * result + year;
		result = prime * result + reason.hashCode();
		result = prime * result + treatment.hashCode();
		
		return result;
	}
}
