/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import test.Solution;
/**
 *
 * @author zaclge
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int[] a = new int[2];
        int a  = Solution.lengthOfLongestSubstring("bbbbbb");
        System.out.println(a);
        String b = Solution.longestPalindrome("cbbd");
        System.out.println(b);
        //System.out.println(a);
    }


    
}
