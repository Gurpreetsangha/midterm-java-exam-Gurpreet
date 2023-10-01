package math.problems;

import org.junit.Assert;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.
        int[] findMissingNumber={10, 2, 1, 4, 5, 3, 7, 8, 6};

        Assert.assertEquals(120,Factorial.factorial(5));

        Assert.assertEquals(9,FindMissingNumber.getMissingNumber(findMissingNumber));

    }
}
