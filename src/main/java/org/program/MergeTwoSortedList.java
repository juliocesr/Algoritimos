package org.program;

import java.util.*;

public class MergeTwoSortedList {
    public static List<Integer> mergeTwoLists(List<Integer> list1,List<Integer> list2) {
        List novaLista = new ArrayList();

        if (list1.isEmpty() && list2.isEmpty()) {
            return new ArrayList<Integer>();
        } else {
            if (!list1.isEmpty()) {
                for (Integer numeros : list1) {
                    novaLista.add(numeros);
                }
            }
            if (!list2.isEmpty()) {
                for (Integer numeros : list2) {
                    novaLista.add(numeros);
                }
            }
            Collections.sort(novaLista);
            System.out.println(novaLista);
            return novaLista;
        }
    }
}
