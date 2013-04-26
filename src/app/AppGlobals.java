package app;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JList;

import org.apache.commons.net.util.Base64;

import com.google.gson.Gson;

import network.*;

import room.Room;
import tournament.Tournament;

public class AppGlobals {

	public static Collection<Long> userList;
	public static Collection<Room> roomList;
	public static Collection<Tournament> tournamentList;
	public static Long localUserId;
	public static GameServerClient gameServer;
	public static Gson gson = new Gson();
	
	public static String hashPasswrod(String password)
	{
		
        //var salt = System.Text.Encoding.UTF8.GetBytes("&^%£$Ugdsgs:;");
        //var userpassword = System.Text.Encoding.UTF8.GetBytes(password);

        //var hmacMD5 = new HMACMD5(salt);
        //var saltedHash = hmacMD5.ComputeHash(userpassword);


        //Convert encoded bytes back to a 'readable' string
        //return Convert.ToBase64String(saltedHash);
		try {
			
		SecretKeySpec keySpec = new SecretKeySpec(
                "&^%£$Ugdsgs:;".getBytes("utf-8"),
                "HmacMD5");

        Mac mac;
		mac = Mac.getInstance("HmacMD5");
			
        mac.init(keySpec);
        byte[] rawHmac = mac.doFinal(password.getBytes("utf-8"));

        Base64 encode = new Base64();
        return encode.encodeToString(rawHmac);		
        
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
