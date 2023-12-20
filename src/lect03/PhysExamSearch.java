package lect03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class PhysExamSearch {
    public static class PhyscDate{
        private String name;
        private int height;
        private double vision;

        public PhyscDate(String name, int height,double vision){
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        public String toString(){
            return name + " "+ height+" "+ vision;
        }
        public static final Comparator<PhyscDate> HEIGHT_ORDER = new HeightOrderComparator();

        public int getHeight() {
            return height;
        }



        private static class HeightOrderComparator implements Comparator<PhyscDate> {
            public int compare(PhyscDate d1, PhyscDate d2){
                return (d1.height > d2.height) ? 1 :
                    (d1.height < d2.height) ?-1 :0;
            }
        }
    }



    public static PhysExamSearch.PhyscDate[] insertData() {
        PhysExamSearch.PhyscDate[] physcDates = new PhysExamSearch.PhyscDate[7];
        physcDates[0] = new PhysExamSearch.PhyscDate("강민하", 162, 0.3);
        physcDates[1] = new PhysExamSearch.PhyscDate("황지안", 169, 0.8);
        physcDates[2] = new PhysExamSearch.PhyscDate("김찬우", 173, 0.7);
        physcDates[3] = new PhysExamSearch.PhyscDate("박준서", 175, 2.0);
        physcDates[4] = new PhysExamSearch.PhyscDate("유서범", 171, 1.5);
        physcDates[5] = new PhysExamSearch.PhyscDate("이수연", 168, 0.4);
        physcDates[6] = new PhysExamSearch.PhyscDate("장경오", 174, 1.2);

        return physcDates;

    }

    public static void searchHeightData(PhysExamSearch.PhyscDate[] data){
       System.out.println(Arrays.toString(data));

       Scanner sc = new Scanner(System.in);

        System.out.println("찾을 값 입력 : ");

       int targetHeight = sc.nextInt();
       int index = Arrays.binarySearch(data, new PhyscDate("", targetHeight, 0.0),PhyscDate.HEIGHT_ORDER);

        if (index < 0) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println("그 값은 data[" + index + "]에 있습니다.");
            System.out.println("찾은 데이터: "+ data[index]);
        }


    }




}
