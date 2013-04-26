package network;

import org.json.simple.JSONObject;

public class LoginRequest {
	public String username;
	public String password;
	public String uid;
	
	public String getJson()
	{
		  JSONObject obj=new JSONObject();
		  obj.put("Username",username);
		  obj.put("Password",password);
		  obj.put("UID",uid);
		  return obj.toString();
	}
}
