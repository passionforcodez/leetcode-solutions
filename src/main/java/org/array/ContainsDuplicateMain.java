package org.array;
import java.util.HashSet;
class ContainDupSolution{
    int[] arr = {1,2,3,4,4,2};
    HashSet<Integer> set = new HashSet<>();
    public boolean containDup() {
        for (int num: arr){
            if (set.contains(num)) {
                return true;
            }
            else {
                set.add(num);
            }
        }
        return false;
    }
    public void Duplicates() {
        set.clear();
        HashSet<Integer> duplicates = new HashSet<>();
        for (int num : arr) {
            if (set.contains(num)) {
                duplicates.add(num);  // Add to duplicates if already seen
            } else {
                set.add(num);  // Otherwise, add to the unique set
            }
        }
        if (duplicates.isEmpty()) {
            System.out.println("No Duplicates found");
        }
        else {
            System.out.println("Duplicates:" + duplicates);
        }
    }
}
public class ContainsDuplicateMain {
    public static void main (String args[]) {
        ContainDupSolution containDupSolution = new ContainDupSolution();
        System.out.println("Is Array Contains Duplicates:" + containDupSolution.containDup());
        containDupSolution.Duplicates();
    }
}
