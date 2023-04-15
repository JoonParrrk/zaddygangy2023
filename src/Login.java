public class Login {

    private String username;

    private String password;

    private int accountNumber;

    public Login(String username, String password, int accountNumber) {
        this.username = username;
        this.password = password;
        this.accountNumber = accountNumber;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    
}
