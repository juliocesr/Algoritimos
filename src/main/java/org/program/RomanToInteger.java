package org.program;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    //Usando Map para armazenar chave e valor Map<tipo, valor>
    private static final Map<Character, Integer> romanToInt = new HashMap<Character, Integer>();
    //inicializa somente uma vez quando a classe é carregada, passando dentro de put o tipo(String) e o valor(int)
    static {
        romanToInt.put('I', 1);
        romanToInt.put('V', 5);
        romanToInt.put('X', 10);
        romanToInt.put('L', 50);
        romanToInt.put('C', 100);
        romanToInt.put('D', 500);
        romanToInt.put('M', 1000);
    }

    public static int romanToInt(String roman) {
        //inicializa com 0
        int total = 0;
        //inicializar com 0
        int valorTeporario = 0;
        //itera pelo tamanho da string iniciando pelo ultimo valor
        for (int i = roman.length() - 1; i >= 0; i--) {
            //acessa o caracter na posição de i
            char c = roman.charAt(i);
            //adiciona o valor atual pegando o valor de c passando como chave a variavel
            int current = romanToInt.get(c);
            //se o valor atual for menor que que o valor de prev decrementa, por exemplo IV, V é maior que I,
            //a primeira iteracao salva o valor de V em prev ja que prev inicia com 0 e o valor current é maior que 0
            // e na segunda iteração o valor current se torna I que é menor que V assim removendo do total 1
            if (current < valorTeporario) {
                total -= current;
            } else {
                total += current;
            }
            valorTeporario = current;
        }
        return total;
    }
}
