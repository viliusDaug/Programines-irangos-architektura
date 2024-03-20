
//Proxy Pattern(structural)
public class AuthenticationProxy implements Authenticator {
    private final AuthenticationManager authenticationManager;

    public AuthenticationProxy(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }

    @Override
    public boolean authenticate(String username, String password) {
        return authenticationManager.validateCredentials(username, password);
    }
}
