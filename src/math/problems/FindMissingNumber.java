package math.problems;

import org.junit.Assert;

import java.util.Arrays;

public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
        int[] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        int missing;
        missing=getMissingNumber(array);
        System.out.println("Missing number is"+" "+missing );
        Assert.assertEquals(9,missing);
        System.out.println("pass");
    }
    public static int getMissingNumber(int[] arr){
        int n= arr.length;
        int m=n+1;
        int total= m*(m+1)/ 2;
        int sum= Arrays.stream(arr).sum();
        return total-sum;
    }

}
