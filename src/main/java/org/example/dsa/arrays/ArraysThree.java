package org.example.dsa.arrays;

public class ArraysThree {
    //27. Remove Element
    public int removeElement(int[] nums, int val) {
        int k=0;
        for(int i=0;i<nums.length; i++){
            if(val != nums[i]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    //Reverse a string with spaces intact
    String reverseWithSpacesIntact(String S) {
        char[] arr = S.toCharArray();
        int i = 0, j = arr.length - 1;
        while(i<j){
            if(arr[i] == ' '){
                i++;
                continue;
            }
            if(arr[j] == ' '){
                j--;
                continue;
            }
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return new String(arr);
    }

    //167. Two Sum II - Input Array Is Sorted
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j= numbers.length-1;
        int sum = 0;
        int[] res = new int[2];
        while(i<j){
            sum = numbers[i]+numbers[j];
            if(sum>target){
                j--;
            }
            else if(sum<target){
                i++;
            }
            if(target == sum){
                res[0] = i+1;
                res[1] = j+1;
                break;
            }
        }
        return res;
    }

    // Pair Sum in a Sorted and Rotated Array - two pointers
    // Count pairs with given sum - two pointers
    // Pairs with difference k - two pointers

    //11. Container With Most Water
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int area = 0;
        while(i<j){
            int currArea = (j-i) * Math.min(height[i],height[j]);
            area = Math.max(area, currArea);

            if(height[i]< height[j]){
                i++;
            }else{
                j--;
            }
        }
        return area;
    }

}
