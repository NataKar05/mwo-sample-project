import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter the number of retries: ");
        int retries = scanner.nextInt();

        System.out.println("Startup parameters:");
        System.out.println("Username: " + username);
        System.out.println("Retries: " + retries);

        scanner.close();
    }
}
