package lect02;

public class RandomNum {
    public static void randomNum(int num){
        int[] numArr = new int[num];

        for(int i = 0; i<numArr.length; i++){
            numArr[i] = i;
        }
        int last= 0;
        for(int i=0; i<100;i++){
            last = (int) (Math.random() * num);
            int tmp = numArr[0];
            numArr[0] = numArr[last];
            numArr[last] = tmp;
        }

            System.out.println("numArr[last] : "+numArr[last]);
    }



}
