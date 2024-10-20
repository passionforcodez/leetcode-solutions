package org.array;

class EqualArraySolution {
    int[] a = {1,5,3,3,10};
    int[] b = {1,5,3,3,10};
    int lenA = a.length;
    int lenB = b.length;
    public boolean equalArray() {
        if(lenA == lenB) {
            for (int i = 0; i < lenA; i++) {
                if (a[i] != b[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
public class EqualArrayMain {
    public static void main(String args[]) {
        // Create an instance of EqualArraySolution
        EqualArraySolution solution = new EqualArraySolution();
        // Call the equalArray method and print the result
        if (solution.equalArray()) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }
}

//Time Complexity: O(n)
// Space Complexity: O(1)