package lect01;
import java.math.*;
import java.util.Arrays;

public class NumConv {

    public static String convert(int a){
        int x = a;
        int num = (int) Math.sqrt(a)-1;
        System.out.println(num);
        int [] y = new int[num];
        int [] rest = new int[num];
        for (int i = 0; i < num; i++){
            rest[i] = x%2;
            y = reverse(rest,i,num-1-i );
            x=(int) Math.ceil(x/2);

            System.out.println("y["+i+"]: " + y[i]);
            System.out.println("x : "+x);
        }



        return Arrays.toString(y);
    }

    public static int [] reverse(int[] numList, int index1, int index2){
        int [] temp = numList;
        int tem=temp[index1];
        temp[index1] = temp[index2];
        temp[index2] = tem;

        return temp;
    }

}
