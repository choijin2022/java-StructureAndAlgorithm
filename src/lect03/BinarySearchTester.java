package lect03;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {

    public static void binarySearchTester(int[] x, int num) {
        Scanner sc = new Scanner(System.in);
        System.out.print("찾을 값 : ");
        int key = sc.nextInt();

        int index = Arrays.binarySearch(x, key);

        if (index < 0) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println("그 값은 a[" + index + "]에 있습니다.");
        }

    }

    public static void binarySearchOrInsertValue(int[] x, int num) {
        Scanner sc = new Scanner(System.in);
        System.out.print("찾을 값 : ");
        int key = sc.nextInt();

        int index = Arrays.binarySearch(x, key);
        if (index < 0) {
            index = Math.abs(index);
            int[] changeArrX= new int[num+1];
            insertNumToArr(x,changeArrX, num, key, index);
            index --;
            System.out.println("그 값은 a[" + index + "]에 있습니다.");

        }
        else
            System.out.println("그 값은 a[" + index + "]에 있습니다.");
    }

    private static int[] insertNumToArr(int[] x,int[]changeArrX, int num, int key, int index) {
        System.arraycopy(x,0,changeArrX,0,index-1);

        for(int i = num; i>=index;i--){
            changeArrX[i] = x[i-1];
        }
        changeArrX[index-1] = key;
        System.out.println(Arrays.toString(changeArrX));
        return changeArrX;

    }


}
