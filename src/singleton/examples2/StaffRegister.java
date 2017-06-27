package singleton.examples2;

public class StaffRegister {

	private static final StaffRegister uniqueInstance;
	
	static {
		uniqueInstance = new StaffRegister();
		
		//Perform additional steps
	}
	
	private StaffRegister() {
	}

	public static StaffRegister getInstance() {
		return uniqueInstance;
	}
	
	//Data access methods
}
