
public class ThrowException extends Exception {

	public String getMessage() {
		return "Invalid Message";
	}
	
	

}

class InvalidPswd extends Exception{
	public String getMessage() {
		return "Invaid Passoword";
	}
	
}

class ServiceUnavailableException extends Exception{
	public String getMessage() {
		return "Service Unavailable";
	}
	
}

class AccessDeniedException extends Exception{
	public String getMessage() {
		return "Access Denied";
	}
	
}

class ResourceNotFoundException extends Exception{
	public String getMessage() {
		return "Resource Not Found";
	}
	
}

class ServiceUnavailableException extends Exception{
	public String getMessage() {
		return "Service Unavailable";
	}
	
}










