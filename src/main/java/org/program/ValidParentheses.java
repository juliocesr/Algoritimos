package org.program;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.HashMap;
import java.util.Map;

public class ValidParentheses {
    private static final Map<Character, Character> inverterCaracter = new HashMap<Character, Character>();
    static {
        inverterCaracter.put(')', '(');
        inverterCaracter.put('}', '{');
        inverterCaracter.put(']', '[');
    }
    public static char inverter(char c) {
        return inverterCaracter.getOrDefault(c, c);
    }
    public static boolean isValid(String s) {
        Map<String, Boolean> valoresVerdadeiros = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length() - 1; j > i; j--) {
                if (s.charAt(i) == inverter(s.charAt(j))) {
                    valoresVerdadeiros.put(s.charAt(i) + "," + s.charAt(j), true);
                    System.out.println(s.indexOf(s.charAt(i)));
                    System.out.println(s.indexOf(s.charAt(j)));
                }
            }
        }
        if (valoresVerdadeiros.isEmpty()) {
            return false;
        }
        boolean teste = valoresVerdadeiros.values().stream().allMatch(Boolean::booleanValue);
        if (teste) {
            return true;
        } else {
            return false;
        }
    }
}
