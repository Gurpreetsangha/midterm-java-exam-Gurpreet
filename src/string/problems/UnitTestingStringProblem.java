package string.problems;

import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

import static string.problems.DetermineLargestWord.findTheLargestWord;

public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.
        Assert.assertEquals(true, Anagram.isAnagram("Army","Mary"));

        String s="Human brain is a biological learning machine";
        Map<Integer, String> Largest = new HashMap<Integer,String>();
        Largest.put(10,"biological");
        Assert.assertEquals(Largest,DetermineLargestWord.findTheLargestWord(s));

        Assert.assertEquals(true,Palindrome.isPalindrome("Mom"));
        Assert.assertEquals(true,Palindrome.isPalindrome("Dad"));
        Assert.assertEquals(true,Palindrome.isPalindrome("Madam"));

    }
}
