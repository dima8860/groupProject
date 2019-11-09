package ReturnMethods;

public class Login {
    public static void main(String[] args) {
        System.out.println(checkLogin("james123", "password")) ;

    }

    public static boolean checkLogin(String inputUserName, String inputUserPassword) {
        String validUserName = "james123";
        String validPassword = "password";
        if(validUserName.equalsIgnoreCase(inputUserName) && validPassword.equalsIgnoreCase(inputUserPassword)) {
            return true;
        }
        else {
            return false;
        }

    }
}
