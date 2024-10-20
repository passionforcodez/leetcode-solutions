package org.array;
import java.util.Arrays;
class SearchElementSolution{
    int[] a = {5,1,1,8,6,3};
    int k = 7;
    public boolean check() {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == k) {
                return true;
            }
        }
        return false;
    }
}
public class SearchKeyArrayMain {
    public static void main(String args[]) {
        SearchElementSolution searchElementSolution = new SearchElementSolution();
        System.out.println("the array has key:" + searchElementSolution.check());
    }
}

// Time complexity- O(n)
// Space Complexity- O(1)

// We can do this by using HashSet and Binary Search.
// for HashSet Time Complexity will be O(n) and Space Complexity will be O(n).
// for Binary Search time Complexity will be O(nlogn) and // Space Complexity- O(1)
// Either approach has complexity issues either with Time and Space, but this linear approach
// will better in this scenario.