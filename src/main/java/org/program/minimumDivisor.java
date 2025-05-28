package org.program;

import java.util.Collections;
import java.util.List;

public class minimumDivisor {
    public static int minimumDivisor(List<Integer> arr, int threshold) {
        // Write your code here
        int left = 1;
        int right = Collections.max(arr);
        int result = right;

        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(sumWithDivisor(arr, mid) <= threshold) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }

    private static int sumWithDivisor(List<Integer> arr, int divisor){
        int sum = 0;
        for(int num : arr) {
            sum += (num + divisor - 1) / divisor;
        }
        return sum;
    }
}
