package network;

public class LoginRequest {
	public String username;
	public String password;
	public String uid;
	
	public LoginRequest(String user, String pass, String id)
	{
		this.username = user;
		this.password = pass;
		this.uid = id;
	}
	
}
