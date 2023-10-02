package string.problems;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        System.out.println(isAnagram("Army", "Mary"));
    }

    public static boolean isAnagram(String a, String m) {
        a=a.toLowerCase();
        m=m.toLowerCase();
        if (a.length()!=m.length()){
            return false;
        }
        char[] temp1=a.toCharArray();
        char[] temp2=m.toCharArray();

        Arrays.sort(temp1);
        Arrays.sort(temp2);

        for (int i=0; i<temp1.length;i++){
            if(temp1[i]!=temp2[i])
                return false;
        }
        return true;
    }

}
