package org.importantMedium;

class ProductOfArrayExceptSelfSolution {
    public int[] productExceptSelf (int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        //Calculate left products and store them in result array
        // The product of all elements to the left of index 0 is 1
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            // left product of the current index
            result[i] = result[i-1] * nums[i-1];
        }

        // Calculate the right products and update the result array
        // The product of all elements to the right of the last index is 1
        int rightProduct = 1;
        for(int i = n-2; i >= 0; i--) {
            // Right product of the current index
            rightProduct *= nums[i+1];
            // Multiply the left product with the right product
            result[i] *= rightProduct;
        }
        return result;
    }
}
public class ProductOfArrayExceptSelfMain {
    public static void main(String[] args) {
        ProductOfArrayExceptSelfSolution productOfArrayExceptSelfSolution = new ProductOfArrayExceptSelfSolution();
        int[] nums = {1,2,3,4};
        int[] result = productOfArrayExceptSelfSolution.productExceptSelf(nums);
        System.out.println("Product of Array Except Self:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

// Time complexity: O(n)
// Space Complexity: O(n)
