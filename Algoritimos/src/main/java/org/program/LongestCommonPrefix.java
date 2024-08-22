package org.program;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        // Verificar se o array está vazio
        if (strs == null || strs.length == 0 ) {
            return "";
        }
        if (strs.length == 1 && strs[0].isEmpty()) {
            return "";
        }
        // Ordenar o array para que o prefixo comum mais longo seja o prefixo do primeiro e do último elemento
        java.util.Arrays.sort(strs);

        // O primeiro e o último elementos na lista ordenada
        String first = strs[0];
        String last = strs[strs.length - 1];

        // Encontrar o prefixo comum entre o primeiro e o último elemento
        int i = 0;
        //Primeiro verifica se o tamanho do primeiro e o ultimo são menores que o valor de 0,
        //caso i for maior que o length e strs for "" ira cair fora do laço e retornar ""
        while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) {
            i++;
        }

        // Retornar o prefixo comum
        return first.substring(0, i);
    }
}
