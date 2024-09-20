package org.program;

import java.util.Arrays;

public class ClimbStairs {
    public static int climbStairs(int n) {
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2; i<n+1; i++){
            if(dp[i] == 0){
                dp[i] = dp[i-1] + dp[i-2];
            }
        }
        return dp[n];
    }
}
