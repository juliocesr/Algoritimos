package org.program;

import java.math.BigInteger;
import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        if (digits.length == 0) {
            return null;
        }
        StringBuilder numeroInteiro = new StringBuilder();
        for (int digitos : digits) {
            numeroInteiro.append(digitos);
        }
        BigInteger numero = new BigInteger(numeroInteiro.toString());
        BigInteger stringToInteger = numero.add(BigInteger.ONE);
        String integerToString = stringToInteger.toString();

        int[] resultado = new int[integerToString.length()];
        for (int i = 0; i < resultado.length; i++) {
            resultado[i] = Character.getNumericValue(integerToString.charAt(i));
        }
        System.out.println(Arrays.toString(resultado));
        return resultado;
    }
}
