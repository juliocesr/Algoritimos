package org.program;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AddBinary {
    public static String addBinary(String a, String b) {
        BigInteger aToDecimal = new BigInteger(a, 2);
        BigInteger bToDecimal = new BigInteger(b, 2);
        BigInteger somaDecimal = aToDecimal.add(bToDecimal);
        String resultado = somaDecimal.toString();
        System.out.println(resultado);

        return null;
    }
}
