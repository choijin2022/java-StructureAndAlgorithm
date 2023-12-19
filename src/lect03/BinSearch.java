package lect03;

import java.util.Arrays;
import java.util.Scanner;

public class BinSearch {

    public static void binSearchPrint(int[] a, int n) {
        Scanner sc = new Scanner(System.in);
        System.out.print("찾을 값: ");
        int key = sc.nextInt();

        int index = binSearchFor(a, n, key);

        if (index == -1) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println("그 값은 a[" + index + "]에 있습니다.");
        }


    }

    public static void binSearchDescPrint(int[] a, int n) {
        Scanner sc = new Scanner(System.in);
        System.out.print("찾을 값: ");
        int key = sc.nextInt();
        // 출력 형식
        System.out.print("   |");

        for (int i = 0; i < a.length; i++) {
            System.out.printf("  %d", i);
        }
        System.out.println();
        System.out.print("----".repeat(a.length));

        int index = findIndexAndPrint(a, n, key);

        if (index == -1) {
            System.out.println();
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println();
            System.out.println("그 값은 a[" + index + "]에 있습니다.");
        }

    }

    private static int findIndexAndPrint(int[] a, int n, int key) {
        int pl = 0;
        int pr = n - 1;
        boolean flag = true;
        do {
            int pc = (pl + pr) / 2;
            draw(a,pl,pr,pc,flag);
            if (a[pc] == key) {
                return pc;
            } else if (a[pc] < key) {
                flag = false;
                pl = pc + 1;
                draw(a,pl,pr,pc,flag);

            } else {
                pr = pc - 1;
                draw(a,pl,pr,pc,flag);

            }
        } while (pl <= pr);
        return -1;

    }

    private static void draw(int[] a, int pl, int pr, int pc, boolean flag) {
        String space = " ";
        // 도형
        if(flag){
            System.out.println();
            System.out.print("   |");

            System.out.printf(space.repeat(pl) + "<-");
            System.out.printf(space.repeat(pc) + "+");
            System.out.printf(space.repeat(pr) + "->");
        }
        else {
            System.out.println();
            System.out.print("   |");

            System.out.printf(space.repeat(pl) + "<-");
            System.out.printf(space.repeat(pc) + "+");
            System.out.printf(space.repeat(pr) + "->");
        }





        // 숫자
        System.out.println();

        System.out.printf("%d  |", pc);
        for (int j : a) {
            System.out.printf(" %d", j);
        }

    }

    static int binSearch(int[] a, int n, int key) {
        int pl = 0;
        int pr = n - 1;

        do {
            int pc = (pl + pr) / 2;
            if (a[pc] == key) {
                return pc;
            } else if (a[pc] < key) {
                pl = pc + 1;
            } else {
                pr = pc - 1;
            }
        } while (pl <= pr);
        return -1;
    }

    static int binSearchFor(int[] a, int n, int key) {
        int pl = 0;
        int pr = n - 1;
        int pc = (pl + pr) / 2;
        for (; true; ) {
            if (key == a[pc]) {
                return pc;
            }
            if (key > a[pc]) {
                pl = pc;
                for (int i = pl; i <= pr; i++) {
                    if (key == a[i]) {
                        return i;
                    }
                }
            } else if (key < a[pc]) {
                pr = pc;
                for (int i = pl; i < pr; i++) {
                    if (key == a[i]) {
                        return i;
                    }
                }
            }
            if (key == 0) {
                System.out.println("요소값이 없습니다");
                return -1;
            }

        }

    }

    public static int[] insertSortNum(int num) {
        Scanner sc = new Scanner(System.in);
        System.out.println("요소수 : " + num);
        int[] x = new int[num];
        System.out.println("오름차순으로 입력하세요");

        System.out.print("x[0]: ");
        x[0] = sc.nextInt();

        for (int i = 1; i < num; i++) {
            do {
                System.out.print("x[" + i + "] : ");
                x[i] = sc.nextInt();
            } while (x[i] < x[i - 1]);
        }
        System.out.println("Arrays.toString : " + Arrays.toString(x));
        return x;
    }

    public static int searchIndex(int[] a, int n, int[] index) {
        Scanner sc = new Scanner(System.in);
        System.out.print("찾을 값: ");
        int key = sc.nextInt();

        int idx = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                index[idx] = i;
                idx++;
            }
        }
        System.out.println("개수 : " + idx);
        return idx;
    }


}
