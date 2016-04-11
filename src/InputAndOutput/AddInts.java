package InputAndOutput;
/******************************************************************************
 *  Compilation:  javac AddInts.java
 *  Execution:    java AddInts
 *  Dependencies: StdIn.java StdOut.java
 *  
 *  This program takes a command line argument N, reads in N integers,
 *  and prints out their sum.
 *
 *  Note: you must hav the file StdIn.java in your working directory.
 *
 *  % java AddInts N
 *
 ******************************************************************************/

public class AddInts { 
    public static void main(String[] args) { 
        int N = Integer.parseInt(args[0]);
        int sum = 0;
        for (int i = 0; i < N; i++) {
            int x = StdIn.readInt();
            sum = sum + x;
        }
        StdOut.println("Sum is " + sum);
    }
}