package lect03;

import java.util.Arrays;

public class ArrayRandNum {
    public static  int[] arrSortNotRepeatRandNum(int num, int randNumMax){
            int[] numArr = new int[num];
            int index = 0;
            int store;
            while (index < numArr.length){
                boolean flag = false;
                store = (int) (Math.random()* randNumMax);
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
        return numArr;


        }

    public static  int[] arrSortRandNum(int num, int randNumMax){
                int[] numArr = new int[num];
                int index = 0;
                while (index < numArr.length){
                    numArr[index] = (int) (Math.random()* randNumMax);
                        index++;
                }
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
            return numArr;


            }

}
