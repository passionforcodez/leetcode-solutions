package org.importantEasy;

import java.util.Arrays;
import java.util.HashSet;

class IntersectionArrays {
    public int[] intersect(int[]arr1, int[]arr2){
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> resultSet = new HashSet<>();

        for (int arr : arr1) {
            set1.add(arr);
        }
        for (int arr: arr2) {
            if(set1.contains(arr)) {
                resultSet.add(arr);
            }
        }
        int [] result = new int[resultSet.size()];
        int index = 0;
        for (int arr: resultSet) {
            result[index++] = arr;
        }
        return result;
    }
}
public class IntersectionArraysMain {
    public static void main (String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] nums2 = {2, 4, 7, 9};
        IntersectionArrays intersectionArrays = new IntersectionArrays();
        int[] result = intersectionArrays.intersect(nums1, nums2);
        System.out.println("Intersection of Array: "+ Arrays.toString(result) );
    }
}
