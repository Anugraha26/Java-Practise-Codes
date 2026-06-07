class PasswordManager {
    private String password = "admin123";
    void changePassword(String newPass) {
        password = newPass;
    }
    void verifyPassword(String pass) {
        if (password.equals(pass))
            System.out.println("Correct Password");
        else
            System.out.println("Wrong Password");
    }
    public static void main(String[] args) {
        PasswordManager p = new PasswordManager();
        p.verifyPassword("admin123");
        p.changePassword("java123");
        p.verifyPassword("java123");
    }
}