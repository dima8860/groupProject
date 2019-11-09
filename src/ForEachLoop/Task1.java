package ForEachLoop;

public class Task1 {
    public static void main(String[] args) {
        /*
        Write a program and create String array called cities. Initialize the cities with cities below:
Chicago, New York, Madison, Miami, Washington
Iterate through each city and check if Chicago is inside the cities.
Print "Windy city found" if Chicago exists in the array. "Windy city not found" otherwise.
         */
        String[] cities = {"Chicago", "New York", "Chicago", "Madison", "Miami", "Chicago", "Washington"};
        int count = 0;
        boolean check = false;
        for (String city : cities) {
            if (city.equalsIgnoreCase("Chicago")) {
                count++;
                check = true;
            }
        }
        if (check) {
            System.out.println("Windy city found " + count + " times");
        } else if (!check) {
            System.out.println("Windy city not found");
        }
        System.out.println(count);

    }
}
