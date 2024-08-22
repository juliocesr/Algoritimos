package org.program;

public class TwoSums {
    public static int[] twoSum(int[] nums, int target) {
        //novo array para armazenar os indices
        int[] result = new int[2];
        //itera sobre o primeiro indice
        for (int i = 0; i < nums.length; i++) {
            //itera sobre o segundo indice recebendo o valor do indice atual mais 1 para verificar a soma do indice atual mais o proximo
            for (int j = i + 1; j < nums.length; j++) {
                //verifica a soma dos dois valores dos indices para saber se é igual ao target
                if (nums[i] + nums[j] == target) {
                    //retorna um novo array com os indices de cada valor que corresponde a soma
                    return new int[]{i, j};
                }
            }
        }
        return result;
    }
}
