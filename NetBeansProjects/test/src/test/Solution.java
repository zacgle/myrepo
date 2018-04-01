/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author zaclge
 */
public class Solution {

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < (nums.length - 1); i++) {
            for (int k = i + 1; k < nums.length; k++) {
                int a = nums[i];
                int b = nums[k];
                int temp = a + b;
                if (temp == target) {
                    System.out.println("[" + i + " ," + k + "]");
                    int[] res = {i, k};
                    result = res;
                    break;

                }

            }
        }
        return result;
    }

    public static void bitch() {
        System.out.print("1234");
    }

    public static int lengthOfLongestSubstring(String s) {
        int result = 0;
        String temp = "";
        for (int i = 0; i < (s.length() - 1); i++) {
            int length = 0;
            for (int k = i; k < (s.length() - 1); k++) {
                if (temp.trim().isEmpty()) {
                    temp = String.valueOf(s.charAt(k));
                    length = 1;
                } else {
                    if (temp.contains(String.valueOf(s.charAt(k)))) {
                        break;
                    } else {
                        temp = temp + String.valueOf(s.charAt(k));
                        length++;

                    }
                }
            }
            while (result < length) {
                result = length;
            }
            length = 0;
        }
        return result;
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result = 0;

        return result;

    }

    public static String longestPalindrome(String s) {
        String result = "";
        int cons = s.length();
        int len = result.length();
        for (int i = 0; i < (cons - 1); i++) {
            String temp = s.substring(i);
            int length = temp.length();
            boolean flag = true;
            while (!(temp.isEmpty()) && !flag) {
                if (length % 2 == 0) {
                    for (int k = (length - 1); k > (length / 2); k--) {
                        if (temp.charAt(k) != temp.charAt(length - k - 1)) {
                            temp = temp.substring(0, length - 1);
                            length = temp.length();
                            flag = false;
                            break;
                        }
                        if(k == (length/2)){
                            
                        }
                    }
                    if (flag && length >= len) {
                        result = temp;
                        len = length;
                    }
                }

            }
        }

        return result;
    }
}
