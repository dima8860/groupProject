package ClassAndObjects;

public class FacebookUser {
    String username;
    String password;
    String name;
    int age;
    int numberOfFriends;

    public boolean sendFriendRequest(FacebookUser facebookUser2) {
        if (this.numberOfFriends < 5000 && facebookUser2.numberOfFriends < 5000) {

            this.numberOfFriends++;
            facebookUser2.numberOfFriends++;
            System.out.println("Friend request sent to " + facebookUser2.name);
            return true;

        } else if (this.numberOfFriends == 5000 && facebookUser2.numberOfFriends < 5000) {
            System.out.println("You have reached the limit of your friends");
        return false;
    }
        else if(this.numberOfFriends < 5000 && facebookUser2.numberOfFriends == 5000) {
            System.out.println(facebookUser2.name + " can not accept any more friend request");
            return false;
        }
        else {
            System.out.println("Request not sent :(");
            return false;
        }


    }
    public void info() {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Name: " + name);;
        System.out.println("Age: " + age);
        System.out.println("Number of friends: " + numberOfFriends);
    }

    public FacebookUser(String username, String password) {
        if(password.contains(username)) {
            System.out.println("Password contained username.Default password created: 'password' ");
            this.password = "password";
        }
        else this.password = password;
        this.username = username;
    }

    public FacebookUser(String username, String password, String name) {
        this(username,password);
        int count = 0;
        String charNew = "";
        boolean valid = true;
        for (int i = 0; i < name.length(); i++) {
            charNew = name.charAt(i) + "";
            if (!Character.isLetter(name.charAt(i)) || !charNew.equals(" ")) {
                count++;
                valid = false;
            }
        }
        if(count == name.length() ) {
            this.name = name;
        }
        else {
            System.out.println("Invalid name");
            this.name = "no name";
        }
    }

    public FacebookUser(String username, String password, String name,int age, int numberOfFriends) {
        this( username,  password,  name);
        if(age >= 0 ) {
            this.age = age;
        }
        else {
            System.out.println("Invalid age");
         //   this.age = 0; by default it is zero
        }

        if(numberOfFriends >= 0 && numberOfFriends <= 5000) {
            this.numberOfFriends = numberOfFriends;
        }
        else {
            System.out.println("Invalid number of friends");
          //   this.numberOfFriends = 0; by default it is zero
        }
    }
}
