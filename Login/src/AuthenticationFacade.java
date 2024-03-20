//Facade Pattern(structural)
public class AuthenticationFacade {

	 private final AuthenticatorFactory factory;

	    public AuthenticationFacade(AuthenticatorFactory factory) {
	        this.factory = factory;
	    }

	    public boolean authenticate(String username, String password) {
	        Authenticator authenticator = factory.createAuthenticator();
	        return authenticator.authenticate(username, password);
	    }
}
