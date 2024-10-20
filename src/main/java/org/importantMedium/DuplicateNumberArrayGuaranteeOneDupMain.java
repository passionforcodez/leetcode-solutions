package org.importantMedium;

class FindDuplicate {
    public int findDuplicate(int[] num) {
        int slow = num[0];
        int fast = num[0];
        //Move slow by 1 step and fast by 2 step
        do {
            slow = num[slow];
            fast = num[num[fast]];
        } while (slow != fast);
        slow = num[0];
        while (slow !=fast){
            slow = num[slow];
            fast = num[fast];
        }
        return slow;
    }
}

public class DuplicateNumberArrayGuaranteeOneDupMain {
    public static void main(String[] args) {
        FindDuplicate finder = new FindDuplicate();
        int[] num = {3,1,3,4,2};
        System.out.println("Duplicate number: "+ finder.findDuplicate(num));
    }
}
