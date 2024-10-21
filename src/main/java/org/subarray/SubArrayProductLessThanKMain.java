package org.subarray;

class SubArrayProdSolution {
    public int numSubArrayProductLessThanK(int[] num, int k) {

        if (k == 0){
            return 0;
        }
        int left = 0;
        int product = 1;
        int count = 0;

        for ( int right = 0; right < num.length; right++ ){
            product *= num[right];
            while(product >= k && left <= right) {
                product /= num[left++];
            }
            count += (right-left+1);
        }
        return count;
    }
}

public class SubArrayProductLessThanKMain {
    public static void main(String[] args) {
        SubArrayProdSolution subArrayProdSolution = new SubArrayProdSolution();
        int[] num = {10,5,2,6};
        int k = 100;
        System.out.println("Product: "+ subArrayProdSolution.numSubArrayProductLessThanK(num, k));
    }
}

// TC- O(n)
// SC- O(n)
