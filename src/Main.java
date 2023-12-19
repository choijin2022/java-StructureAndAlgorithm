import static lect03.BinSearch.binSearchPrint;
import static lect03.BinSearch.insertSortNum;



public class Main {

    public static void main(String[] args) {

        int num = 7;
        int[] a=  insertSortNum( num);
        binSearchPrint(a,num);
    }
}