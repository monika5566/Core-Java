package exceptionhandling;

public class studIdValidator {
	static void ValidateStudId (int studId) throws invalidException{
		if(studId< 100) {
			throw new invalidException("Invalid Id.");
		}
	}
}
