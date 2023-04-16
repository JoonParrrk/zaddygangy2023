import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username = "";
        String password = "";
        Scanner scan = new Scanner(System.in);

        System.out.println("Please create a username: ");
        username = scan.nextLine();
        System.out.println("Please create a password: ");
        password = scan.nextLine();

        Login loginInfo = new Login(username, password);

        System.out.println(loginInfo.getPassword());
        System.out.println(loginInfo.getUsername());


    }
}
