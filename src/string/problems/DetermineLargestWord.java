package string.problems;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s="Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        System.out.println(wordNLength);
        //implement

    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();

        //implement
        String[] stringArray =wordGiven.split(" ");

        String  largest = stringArray[0];
        for(int i=1;i<stringArray.length;i++){

            if( largest.length()<stringArray[i].length())
                largest=stringArray[i];
        }
        map.put(largest.length(),largest);


        return map;
    }
}


