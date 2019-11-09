package ForEachLoop;

public class Task2 {
    public static void main(String[] args) {
        /*
        Given a String array with value of:
"Bread", "cucumber", "Apples", "Orange", "cookies", “Cake"
Print out how many of the words begin with uppercase letters

         */
        String [] array1 = {"Bread", "cucumber", "Apples", "Orange", "cookies", "Cake"};
        boolean check = false;
        int count = 0;

        for (String name : array1) {
            char first = name.charAt(0);
            if (Character.isUpperCase(first)) {
                check = true;
                count++;
                System.out.println(name);
            }

        }

            System.out.println(count);

    }
}
