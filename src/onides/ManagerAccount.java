package onides;

public class ManagerAccount {
	private String username;
	private String password;
	
	public ManagerAccount(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	protected String getUsername() {
		return username;
	}
	protected void setUsername(String username) {
		this.username = username;
	}
	protected String getPassword() {
		return password;
	}
	protected void setPassword(String password) {
		this.password = password;
	}
	
	
}
