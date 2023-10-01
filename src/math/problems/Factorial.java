package math.problems;

import org.junit.Assert;

public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        int num=5;
        int num2=num;
        System.out.println(factorial(num));
        Assert.assertEquals(120,factorial(num));
        System.out.println("pass");

    }
    public static int factorial(int a){
        if(a==0)
            return 1;
        return a*factorial(a-1);
    }

}
