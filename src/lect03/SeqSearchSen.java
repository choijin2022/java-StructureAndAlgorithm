package lect03;

import java.util.Scanner;

public class SeqSearchSen {
    public static void searchResultSenPrint(int[] a, int n){
            Scanner stdIn = new Scanner(System.in);
            System.out.print("찾으려는 값 : ");
            int ky = stdIn.nextInt();
            int idx = seqSearchForSen(a,n,ky);
            if (idx == -1) {
                System.out.println("그 값의 요소가 없습니다");
            } else {
                System.out.println("그 값은 x[" +idx+"]에 있습니다");
            }

        }

        static int seqSearchForSen(int[] a, int n, int key){
        int count = 0;
        a[n] = key;
            int i =0;
            while (true){
                if(a[i] == key){
                    ++count;
                    break;
                }
                ++count;
                i++;
            }
            System.out.println("count: "+count);
            return i == n ? -1 : i ;
        }


        public static int[] insertArrNumSen(int num){
            Scanner stdIn = new Scanner(System.in);
            int[] x = new int[num+1];
            for(int i=0; i<num;i++){
                System.out.print("x["+i+"]: ");
                x[i] = stdIn.nextInt();
            }
            return x;


        }
}
