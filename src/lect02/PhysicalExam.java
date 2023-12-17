package lect02;

public class PhysicalExam {

    static final int VMAX = 21;



    public static class PhyscDate {

        String name;
        int height;
        double vision;


        PhyscDate(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

    }

    static double aveHeight(PhyscDate[] dat) {
        double sum = 0;
        for (PhyscDate physcDate : dat) {
            sum += physcDate.height;
        }
        return sum / dat.length;
    }

    static void distVision(PhyscDate[] dat, int[] dist) {
        int i = 0;
        dist[i] = 0;
        for (i = 0; i < dat.length; i++) {
            if (dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0) {
                dist[(int) (dat[i].vision * 10)]++;
            }
        }
    }


    public static PhyscDate[] insertDatas() {
        PhyscDate[] physcDates = new PhyscDate[7];
        physcDates[0] = new PhyscDate("강민하", 162, 0.3);
        physcDates[1] = new PhyscDate("김찬우", 173, 0.7);
        physcDates[2] = new PhyscDate("박준서", 175, 2.0);
        physcDates[3] = new PhyscDate("유서범", 171, 1.5);
        physcDates[4] = new PhyscDate("이수연", 168, 0.4);
        physcDates[5] = new PhyscDate("장경오", 174, 1.2);
        physcDates[6] = new PhyscDate("황지안", 169, 0.8);
        return physcDates;

    }

    public static void printDatas(PhyscDate[] x) {
        int[] vdist = new int[VMAX];
        System.out.println("> 신체검사 리스트 <");
        System.out.println("이름      키    시력");
        System.out.println("----------------------");
        for (PhyscDate physcDate : x) {
            System.out.printf("%-8s%3d%5.1f\n", physcDate.name, physcDate.height, physcDate.vision);
        }
        System.out.printf("\n평균키 : %5.1f cm\n", aveHeight(x));

        distVision(x,vdist);
        System.out.println("\n 시력분포");
        for (int i = 0; i < VMAX; i++) {
            System.out.printf("%3.1f~: %2d 명\n",i/10.0, vdist[i]);
        }

    }


}
