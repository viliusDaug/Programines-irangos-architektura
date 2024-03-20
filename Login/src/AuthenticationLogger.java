
public class AuthenticationLogger implements AuthenticationObserver {
    @Override
    public void notify(boolean isAuthenticated) {
        if (isAuthenticated) {
            System.out.println("Authentication successful. Logging in...");
        } else {
            System.out.println("Authentication failed. Invalid username or password.");
        }
    }
}
