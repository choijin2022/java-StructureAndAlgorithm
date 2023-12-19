package lect03;


import static lect03.ArrayRandNum.arrSortNotRepeatRandNum;

import java.util.Scanner;

public class BinarySearch {

    public static void binarySearch(int num, int randNumMax){
        Scanner sc = new Scanner(System.in);
        int[] a = arrSortNotRepeatRandNum( num,  randNumMax);

        System.out.print("찾을 값 : ");
        int targetNum = sc.nextInt();
        int result =  findIndex(a, num, targetNum);
        if (result == -1) {
            System.out.println("result : 없음");
        }
        else {
            result++;
            System.out.println("result: "+ result + " 번째 위치에 있습니다");
        }




    }

    private static int findIndex(int[] a, int num, int targetNum) {
        int pl = 0;
        int pr = num -1;
       int pc = (num-1)/2;
       int index = 0;
       int count = 0;


       while (true){
           if(targetNum == a[pc]){
               index= pc;
               count++;
               System.out.println("count: "+count);
               return index;
           }
           if(targetNum >a[pc]){
               pl = pc;
               for (int i = pl; i <= pr; i++){
                   count++;
                   if(targetNum == a[i]){
                       index= i;
                       System.out.println("count: "+count);
                       return index;
                   }
               }
           }else if(targetNum < a[pc]){
               pr = pc;
               for (int i = pl; i < pr; i++){
                   count++;
                  if(targetNum == a[i]){
                      index= i;
                      System.out.println("count: "+count);
                      return index;
                  }
              }
           }
           if(index == 0){
               System.out.println("count: "+count);
               System.out.println("요소값이 없습니다");
               return -1;
          }
       }

    }

}
