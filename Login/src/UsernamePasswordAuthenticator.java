
public class UsernamePasswordAuthenticator implements Authenticator {
    @Override
    public boolean authenticate(String username, String password) {
        AuthenticationManager manager = AuthenticationManager.getInstance();
        return manager.validateCredentials(username, password);
    }
}
