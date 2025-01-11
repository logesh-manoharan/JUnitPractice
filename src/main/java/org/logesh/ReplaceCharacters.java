package org.logesh;

public class ReplaceCharacters {

    public String replaceFirst2AsWith$(String inputStr) {
        if (inputStr.length() <= 2) {
            return inputStr.replaceAll("A", "");
        }
        String first2Chars = inputStr.substring(0, 2);
        first2Chars = first2Chars.replaceAll("A", "");
        return first2Chars + inputStr.substring(2, inputStr.length());
    }
}
