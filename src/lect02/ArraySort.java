package lect02;

import java.util.Arrays;

public class ArraySort {
    public static void arraySortMin(int num){
        int[] numArr = new int[num];
        int store;
        int index=0;
        int iter = 0;

        while (index <numArr.length){
//        for(int i =0; i<numArr.length;i++){
            // 1. 랜덤 번호 생성
            store=(int) (Math.random() * num);
            // 2. i 번 만큼 numArr 배열의 요솟값을 확인하면서 랜덤 번호와 같은 숫자가 있는지 여부 확인
            // 같은 숫자가 없으면 저장, 같은 숫자가 있으면 저장하지 않고 다시 랜덤 번호를 생성
            int count = 0;
            while (count<index){
                if(store ==numArr[count])
                    break;
                count++;
            }
            if(count ==index ){
                numArr[index] = store;
                index++;
            }
            iter++;

        }
        System.out.println("iter: " + iter);
        System.out.println("1. Arrays.toString(numArr): "+Arrays.toString(numArr));


        for(int i =0; i<numArr.length-1; i++){
            boolean changed = false;

            for(int j = 0; j<numArr.length-1-i;j++){
                if(numArr[j]>numArr[j+1]){
                    int tem = numArr[j];
                    numArr[j]=numArr[j+1];
                    numArr[j+1]=tem;
                    changed=true;
                }
            }
            if(!changed) break;
        }
        System.out.println("2. Arrays.toString(numArr): "+Arrays.toString(numArr));
    }


}
