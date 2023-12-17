package lect02;

public class TotalAndAvg {

    public static void totalAndAvg(int[] score){
        int sum = 0;
        float avg = 0f;

        for(int i = 0; i<score.length;i++){
            sum +=score[i];
        }
        avg = (float) sum/score.length;

        System.out.println("sum : "+sum);
        System.out.println("avg : "+avg);

    }



}
