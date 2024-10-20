package org.importantEasy;

import java.util.Arrays;
class MoveZeroSolution{
    public int[] moveZeros(int[] num) {
        int writeIndex = 0;
        for (int readIndex = 0; readIndex < num.length; readIndex++) {
            if(num[readIndex] != 0) {
                num[writeIndex] = num[readIndex];
                writeIndex++;
            }
        }
        while(writeIndex <num.length) {
            num[writeIndex] = 0 ;
            writeIndex++;
        }
        return num;
    }
}

public class MoveZerosMain {
    public static void main(String[] args) {
        int[] num = {0,3,0,1,0,4,7,8,10,11};
        MoveZeroSolution moveZeroSolution = new MoveZeroSolution();
        int[] result = moveZeroSolution.moveZeros(num);
        System.out.println("Move Zero: " + Arrays.toString(result));

    }
}
