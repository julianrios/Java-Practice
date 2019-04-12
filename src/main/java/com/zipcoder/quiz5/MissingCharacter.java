package com.zipcoder.quiz5;

import java.util.ArrayList;
import java.util.List;

public class MissingCharacter {

    /**
     * Given a text, return a list of all the characters that are missing from
     * the text. For example, if the text is `abc`, then the missing chars
     * are `defghijklmnopqrstuvwxyz`.
     * @param text
     * @return a list of all the missing characters from the text
     */
    List<Character> missingChars = new ArrayList<>();

    public List<Character> getMissingChars(String text) {
        char[] givenText = text.toCharArray();
        System.out.println(givenText);
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();


        for (int i = 0; i < givenText.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if(!(givenText[i] == alphabet[j])) {
                    missingChars.add(alphabet[j]);
                }
            }
        }
        return missingChars;
    }

    public List<Character> getMissingChars() {
        return missingChars;
    }
}
