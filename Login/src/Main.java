import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        AuthenticationManager manager = AuthenticationManager.getInstance();
        AuthenticatorFactory factory = new UsernamePasswordAuthenticatorFactory();
        AuthenticationFacade facade = new AuthenticationFacade(factory);
        AuthenticationProxy proxy = new AuthenticationProxy(manager);
        AuthenticationObserver logger = new AuthenticationLogger();

        // Add logger as observer
        facade.authenticate("user1", "password1");

        System.out.println("Enter username:");
        String username = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();

        // Use proxy for authentication
        boolean isAuthenticated = proxy.authenticate(username, password);

        // Notify logger
        logger.notify(isAuthenticated);

        scanner.close();
	}

}
