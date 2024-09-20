package org.program;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int elementoRemovido = 0;

        ArrayList list = new ArrayList();
        for (int numero : nums) {
            list.add(numero);
        }

        for (int i = 0; i < list.toArray().length; i++) {
            if (list.get(i).equals(val)) {
                list.remove(i);
                elementoRemovido++;
            }
        }

        System.out.println(elementoRemovido);
        System.out.println(Arrays.toString(list.toArray()));

        return elementoRemovido;
    }
}
