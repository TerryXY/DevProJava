package app;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.net.util.Base64;

import com.google.gson.Gson;

import network.*;

import room.Room;
import tournament.Tournament;

public class AppGlobals {

	public static Collection<Long> userList = new ArrayList<Long>();
	public static Collection<Room> roomList = new ArrayList<Room>();
	public static Collection<Tournament> tournamentList = new ArrayList<Tournament>();
	public static Long localUserId;
	public static GameServerClient gameServer;
	public static Gson gson = new Gson();
	
	public static String hashPasswrod(String password)
	{
		try {
			
		SecretKeySpec keySpec = new SecretKeySpec(
                "&^%£$Ugdsgs:;".getBytes("utf-8"),
                "HmacMD5");

        Mac mac;
		mac = Mac.getInstance("HmacMD5");
			
        mac.init(keySpec);
        byte[] rawHmac = mac.doFinal(password.getBytes("utf-8"));

        Base64 encode = new Base64();
        String pass = encode.encodeToString(rawHmac);
        return pass.substring(0, pass.length() - 2);
        
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
        } catch (InvalidKeyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "ERROR";
	}
	
	
}
