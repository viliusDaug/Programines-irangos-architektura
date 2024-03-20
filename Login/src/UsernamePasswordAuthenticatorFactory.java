
public class UsernamePasswordAuthenticatorFactory implements AuthenticatorFactory {

	@Override
    public Authenticator createAuthenticator() {
        return new UsernamePasswordAuthenticator();
    }
}
