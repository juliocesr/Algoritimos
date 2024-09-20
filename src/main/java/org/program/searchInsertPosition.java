package org.program;

public class searchInsertPosition {
    public static int searchInsert(int[] nums, int target) {


        if (target > nums[nums.length - 1]) {
            System.out.println(nums.length);
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < target && nums[i + 1] > target) {
                    System.out.println(i + 1);
                } else if (nums[i] == target) {
                    System.out.println(i);
                }
            }
        }
        return 0;
    }
}
