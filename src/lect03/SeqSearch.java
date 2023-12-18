package lect03;

import java.util.Scanner;

public class SeqSearch {

    public static void searchResultPrint(int[] a, int n){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("찾으려는 값 : ");
        int ky = stdIn.nextInt();
        int idx = seqSearch(a,n,ky);
        if (idx == -1) {
            System.out.println("그 값의 요소가 없습니다");
        } else {
            System.out.println("그 값은 x[" +idx+"]에 있습니다");
        }

    }
    static int seqSearch(int[] a, int n, int key){
        int i =0;
        int count = 0;
        while (true){
            if(i==n){
                ++count;
                System.out.println("count : "+ count);
                return -1;
            }

            if(a[i] == key){
                ++count;
                System.out.println("count : "+ count);
                return i;
            }
            count++;
            i++;
        }
    }
    static int seqSearchFor(int[] a, int n, int key){
        for(int i = 0; i<n;i++){
            if(a[i]==key){
                return i;
            }
        }
        return -1;
    }


    public static int[] insertArrNum(int num){
        Scanner stdIn = new Scanner(System.in);
        int[] x = new int[num];
        for(int i=0; i<num;i++){
            System.out.print("x["+i+"]: ");
            x[i] = stdIn.nextInt();
        }
        return x;


    }

}
