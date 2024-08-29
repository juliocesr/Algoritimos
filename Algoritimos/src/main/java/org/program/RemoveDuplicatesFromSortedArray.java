package org.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {

        ArrayList list = new ArrayList();
        for (int numero : nums) {
            list.add(numero);
        }

        for (int i = 0; i < list.toArray().length; i++) {
            for (int j = i + 1; j < list.toArray().length; j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                }
            }

        }
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(list.size());
        return list.size();

    }
}
