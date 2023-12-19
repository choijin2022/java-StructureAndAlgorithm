package lect03;

import java.util.Arrays;
import java.util.Scanner;

public class BinSearch {

    public static void binSearchPrint(int[] a, int n){
        Scanner sc = new Scanner(System.in);
        System.out.print("찾을 값: ");
        int key = sc.nextInt();

        int index = binSearchFor(a,n,key);

        if (index == -1) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println("그 값은 a["+index+"]에 있습니다.");
        }


    }
    static int binSearch(int[]a, int n, int key){
        int pl = 0;
        int pr = n-1;

        do{
            int pc = (pl+pr)/2;
            if(a[pc]==key){
                return pc;
            }
            else if(a[pc]<key){
                pl = pc+1;
            }
            else {
                pr = pc-1;
            }
        }while (pl <=pr);
        return -1;
    }
    static int binSearchFor(int[]a, int n, int key){
        int pl = 0;
        int pr = n-1;
        int pc = (pl+pr)/2;
        //  1. a[pc]와 key를 대조하여 동일하면 pc를 리턴, a[pc]가 더 크다면?
        for(; true;){
            if(key == a[pc]){
               return pc;
           }
           if(key >a[pc]){
               pl = pc;
               for (int i = pl; i <= pr; i++){
                   if(key == a[i]){
                       return i;
                   }
               }
           }else if(key < a[pc]){
               pr = pc;
               for (int i = pl; i < pr; i++){
                  if(key == a[i]){
                      return i;
                  }
              }
           }
           if(key == 0){
               System.out.println("요소값이 없습니다");
               return -1;
          }

        }

    }


    public static int[] insertSortNum(int num){
        Scanner sc = new Scanner(System.in);
        System.out.println("요소수 : "+num);
        int[] x = new int[num];
        System.out.println("오름차순으로 입력하세요");

        System.out.print("x[0]: ");
        x[0] =sc.nextInt();

        for(int i = 1; i<num;i++){
            do{
                System.out.print("x["+i+"] : ");
                x[i] = sc.nextInt();
            }while (x[i] < x[i-1]);
        }
        System.out.println("Arrays.toString : "+ Arrays.toString(x));
        return x;
    }
}
