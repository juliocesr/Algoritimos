package org.program;

import java.util.HashMap;
import java.util.Map;

import static org.program.LongestCommonPrefix.longestCommonPrefix;
import static org.program.PalindromeNumber.isPalindrome;
import static org.program.RomanToInteger.romanToInt;
import static org.program.TwoSums.twoSum;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        twoSum(arr, 9);
        isPalindrome(121);
        romanToInt("IV");
        String[] arr1 = {"caixa", "caixote", "caixinha"};
        longestCommonPrefix(arr1);


//        String texto = "teste";
//        String teste1 = texto.substring(3);
//        String teste2 = texto.substring(0, 3);
//        String teste3 = String.valueOf(texto.charAt(4));
//        System.out.println(teste1);
//        System.out.println(teste2);
//        System.out.println(teste3);
//
//        Map<Character, String> texto2 = new HashMap<Character, String>();
//        texto2.put('t', "t");
//        texto2.put('e', "e");
//        texto2.put('s', "s");
//        texto2.put('t', "t");
//        texto2.put('e', "e");
//
//        for (int i = texto.length() - 1; i >= 0; i--) {
//            System.out.println(texto2.get(texto.charAt(i)));
//        }

    }
}