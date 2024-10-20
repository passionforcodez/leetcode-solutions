package org.importantEasy;

class BinarySearch {
    public int search(int[] num, int target) {
        int low = 0;
        int high = num.length -1;
        while (low <= high) {
            int mid = low + (high - low)/2;
            if(num[mid] == target) {
                return mid;
            }
            if (num[mid] > target) {
                high = mid - 1;
            }
            else {
                low = mid +1;
            }
        }
        return -1;
    }
}
public class BinarySearchMain {
    public static void main (String[] args) {
        int[] num = {1,3,4,5,6,10};
        int target = 5;
        BinarySearch binarySearch = new BinarySearch();
        int result = binarySearch.search(num, target);
        System.out.println("Binary Search element found at: " + result);
    }
}
