package lect02;

import java.util.Arrays;

public class ArrayCopy {


    // 배열 길이 변경
    public static int[] arrForCopy(int num){
        int [] arr = new int[num];

        for(int i =0; i< arr.length;i++)
            arr[i] = i+1;

        System.out.println("변경 전 : "+ Arrays.toString(arr));

        int[] tem = new int[arr.length*2];
        for(int i=0; i< arr.length;i++)
            tem[i] = arr[i];
        arr = tem;
        System.out.println("변경 후");
        System.out.println("arr.length : "+arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr["+i+"] : "+arr[i]);
        }
        return arr;
    }
    public static void arrCopy(char[] c1,char[] c2 ){
        char[] result = new char[c1.length + c2.length];
        System.arraycopy(c1,0,result,0,c1.length);
        System.arraycopy(c2,0,result,c1.length,c2.length);
        System.out.println(Arrays.toString(result));
    }
}
