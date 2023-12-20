package lect03;

public class ArrSort implements Comparable<ArrSort> {

    private static int counter = 0;

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public ArrSort(String name) {
        this.id = ++counter;
        this.name = name;
    }

    public ArrSort() {
        id = ++counter;
    }


    public int compareTo(ArrSort a) {
        return this.name.compareTo(a.getName());
    }

    public boolean equals(Object a) {
        if (this == a) {
            return true;
        }
        if (a == null || getClass() != a.getClass()) {
            return false;
        }
        ArrSort arrSort = (ArrSort) a;
        return name.equals(arrSort.getName());
    }

    public static void arrSortName(ArrSort[] arrSorts) {

        for (int j = 0; j < arrSorts.length; j++) {
            for (int i = 1; i < arrSorts.length; i++) {
                int comparisonResult = arrSorts[i].compareTo(arrSorts[i - 1]);
                if (comparisonResult < 0) {
                    ArrSort temp = arrSorts[i - 1];
                    arrSorts[i - 1] = arrSorts[i];
                    arrSorts[i] = temp;
                }
            }
        }

        for (ArrSort a : arrSorts) {
            System.out.println(a.getName());
        }

    }

    public static int compName(ArrSort[] arrSorts, ArrSort a) {
        int index = -1;
        int maxIndex = -1;
        for (int i = 0; i < arrSorts.length; i++) {
            int comparisonResult = a.compareTo(arrSorts[i]);
            if (comparisonResult > 0) {
                index = i;
                if (maxIndex == -1 || comparisonResult > a.compareTo(arrSorts[maxIndex])) {
                    maxIndex = i;
                }
            }
        }
        if (index >= 0) {
            System.out.println("index : "+index);
            return index;
        } else {
            System.out.println("그 값의 요소가 없습니다.");
            return index;
        }

    }

}
