package org.importantEasy;
import java.util.Arrays;
class RemoveDuplicatesSolution {
    int[] arr = {2,2,2,2,2,2,1};
    public int[] removeDuplicate() {
        if (arr.length == 0) {
            return arr;
        }
        int newSize = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i-1]) {
                arr[newSize++] = arr[i];
            }
        }
        return Arrays.copyOf(arr,newSize);
    }
}
public class RemoveDuplicatesArrayMain {
    public static void main (String[] args) {
        RemoveDuplicatesSolution removeDuplicatesSolution = new RemoveDuplicatesSolution();
        System.out.println("New array without duplicates: "+ Arrays.toString(removeDuplicatesSolution.removeDuplicate()));
    }
}

//Time Complexity = O(n)
// Space Complexity = O(1)

// If we use hashset or hashmap the space complexity
// will be O(n)
// // To track seen elements
//        HashSet<Integer> s = new HashSet<>();
//        // To maintain the new size of the array
//        int idx = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (!s.contains(arr[i])) {
//                s.add(arr[i]);
//                arr[idx++] = arr[i];
//            }
//        }
//        // Return the size of the array
//        // with unique elements
//        return idx;
//    }
