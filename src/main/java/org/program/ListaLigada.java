package org.program;

import java.util.ArrayList;
import java.util.Arrays;

public class ListaLigada {
    Node head;

    ListaLigada() {
        this.head = null;
    }

    void adiciona(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    void printList() {
        ArrayList<Integer> lista = new ArrayList<>();
        Node current = head;
        while (current != null) {
            lista.add(current.data);
            current = current.next;
        }


        for (int i = 0; i < lista.size(); i++) {
            for (int j = i + 1; j < lista.size(); j++) {
                if (lista.get(j).equals(lista.get(i))) {
                    lista.remove(j);
                }
            }
        }
        int[] array = new int[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            array[i] = lista.get(i);
        }
        System.out.println(Arrays.toString(array));
    }
}
