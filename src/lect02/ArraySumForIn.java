package lect02;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraySumForIn {
    public static void arrRandNumSum(int num){
        int[] numArr = new int[num];
        int index = 0;
        int store;
        while (index < numArr.length){
            boolean flag = false;
            store = (int) (Math.random()*1000);
            for(int i = 0; i<index;i++){
                if(store == numArr[i]){
                    flag = true;
                    break;
                }
            }
            if (!flag){
                numArr[index] = store;
                index++;
            }
        }
        System.out.println("numArr : "+ Arrays.toString(numArr));
        int sum = 0;
        for (int number : numArr){
            sum += number;
        }

        System.out.println("합계 : "+sum);


    }


}
