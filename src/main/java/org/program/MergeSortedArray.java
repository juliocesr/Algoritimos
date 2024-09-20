package org.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        List list = new ArrayList();

        for(int i = 0; i < m; i++) {
            if (nums1[i] > 0) {
                list.add(nums1[i]);
            }
        }
        for(int i = 0; i < n; i++) {
            if (nums2[i] > 0) {
                list.add(nums2[i]);
            }
        }

        Collections.sort(list);
        System.out.println(Arrays.toString(list.toArray()));

    }
}
