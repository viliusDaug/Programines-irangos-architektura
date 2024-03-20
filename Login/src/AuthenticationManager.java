import java.util.HashMap;
import java.util.Map;

//Singleton Pattern(creational)
public class AuthenticationManager {

	 private static final AuthenticationManager instance = new AuthenticationManager();
	    private final Map<String, String> credentials;

	    private AuthenticationManager() {
	        credentials = new HashMap<>();
	        credentials.put("Vilius", "12345");
	        credentials.put("aabbcc", "aabbcc");

	    }

	    public static AuthenticationManager getInstance() {
	        return instance;
	    }

	    public boolean validateCredentials(String username, String password) {
	        return credentials.containsKey(username) && credentials.get(username).equals(password);
	    }
}
