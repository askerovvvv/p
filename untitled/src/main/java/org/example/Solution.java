package org.example;


import java.util.*;

class Solution {
    public int minIncrementForUnique(int[] nums) {
        Set<Integer> alreadyDefinedNums = new HashSet<>();
        int res = 0;

        int currentNum;
        for (int num : nums) {
            currentNum = num;
            if (alreadyDefinedNums.contains(num)) {
                while (alreadyDefinedNums.contains(currentNum)) {
                    currentNum++;
                    res++;
                }
                alreadyDefinedNums.add(currentNum);
            } else {
                alreadyDefinedNums.add(currentNum);
            }

        }
        return res;
    }
}