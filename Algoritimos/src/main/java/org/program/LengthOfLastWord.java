package org.program;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int j = 0;
        String novaString = s.trim();
        for (int i = novaString.length() - 1; i >= 0; i--) {
            j++;
            if (novaString.charAt(i) == ' ') {
                j = j - 1;
                break;
            }
        }
        return j;
    }
}
