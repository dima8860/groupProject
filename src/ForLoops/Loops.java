package ForLoops;

public class Loops {
    public static void main(String[] args) {
        /* LOOPS
        Execute certain set of block of code/statement within certain conditions
        i = 0; ----> initialization: happens only once in the beginning
        i < 5; -----> termination condition;
        i++ -------> update: increasing or decreasing a value
        keyword: iteration: one execution
        for (int i = 0; i > -1;  ) -----> infinitive loop. i = 0 is always > - 1.
        note: how many times to iterate through a statement
        -break; this is a keyword used within the loop to stop the loop
        -continue; skip the rest of that iteration

         */
        for  (int i = 0; i < 5; i++) {
            System.out.println("Hello world " + i); // -----> iteration
        }
        for ( int i = 0; i < 5; i++) {
            System.out.println("bye world " + i); // -----> iteration
        }

        System.out.println("End");
    }
}
