package org.program;

public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        //Transforma um numero inteiro em uma string e reverte essa string
        String palindromo = new StringBuilder(String.valueOf(x)).reverse().toString();
        //transforma o valor de x em string e verifica se é igual ao valor do palindromo
        if (String.valueOf(x).toString().equals(palindromo)) {
            return true;
        }
        return false;
    }
}
