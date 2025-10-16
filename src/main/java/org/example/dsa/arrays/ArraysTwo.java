package org.example.dsa.arrays;

import java.util.HashSet;
import java.util.Set;

public class ArraysTwo {
    // Sort 0s, 1s and 2s DNF
    public void sort012(int[] arr) {
        // code here
        int i = 0;
        int j = 0;
        int k = arr.length-1;

        while(j<=k){
            if(arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;j++;
            }else if(arr[j] == 1){
                j++;
            }else if(arr[j] ==2){
                int temp2 = arr[k];
                arr[k] = arr[j];
                arr[j] = temp2;
                k--;
            }
        }
    }


    // 128. Longest Consecutive Sequence
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int res = 0;

        for(int arr : nums){
            if(set.contains(arr) && !set.contains(arr-1)){
                int curr = arr; int count = 0;
                while(set.contains(curr)){
                    set.remove(curr);
                    curr++;
                    count++;
                }
                res = Math.max(res,count);
            }

        }
        return res;

    }
}
