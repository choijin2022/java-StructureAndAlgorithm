import static lect03.ArrayRandNum.arrSortRandNum;
import static lect03.BinSearch.binSearchDescPrint;



public class Main {

    public static void main(String[] args) {

        int num = 15;
        int[] a=  arrSortRandNum( num,100);
        binSearchDescPrint(a,num);
    }
}