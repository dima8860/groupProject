package ClassAndObjects;

public class FacebookUserExecution {
    public static void main(String[] args) {
        FacebookUser myUser = new FacebookUser("dima1234", "dima123456","Dmytro Chernetskyi", 30, 1000);
        FacebookUser user2 = new FacebookUser("anton1234", "dima123456","Anton Chernetskyy", 35, 5000);
        myUser.sendFriendRequest(user2);
        myUser.info();
        System.out.println();
        user2.info();
    }
}
