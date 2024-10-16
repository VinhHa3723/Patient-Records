/** 
  The BadVisitDateException class contains an exception that is 
	thrown when attempting to create a PatientRecord object with
	an invalid date.
*/
public class BadVisitDateException extends Exception
{
	/** 
		A constructor that throws an exception.
		@param message Describes the reason for the exception.
	*/
	public BadVisitDateException(String message)
	{
		super(message);
	}
}
