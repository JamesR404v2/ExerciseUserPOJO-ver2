package folder;

public class User {


    // declared private instance variables
    private String username;
    public String password;
    private String firstName;
    private String lastName;
    private int failedLoginAttempts;
    
    
	public User(String username, String password, String firstName, String lastName, int failedLoginAttempts) {
		// TODO Auto-generated constructor stub
		this.password = password;
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getFailedLoginAttempts() {
		return failedLoginAttempts;
	}
	public void setFailedLoginAttempts(int failedLoginAttempts) {
		this.failedLoginAttempts = failedLoginAttempts;
	}
    
    
    
    
}