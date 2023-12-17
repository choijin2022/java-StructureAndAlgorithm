package lect02;

import java.util.Arrays;

public class RandomName {
    public static void randomName(String[] names){
        String[] people = names;
        int select =0;
        for(int i = 0; i< 10;i++){
            select = (int) ((Math.random() * people.length));

        }
        System.out.println("people[select] : "+people[select]);
    }
    public static void randName2(String[] names){
        int select =0;
        String [] people = new String[names.length];
        int count = 0;

        while(count <  people.length){
            select = (int) ((Math.random() * people.length));
            System.out.println("select : "+select);
            if(people[select] == null ) {
                people[select] = names[count];
                System.out.println("count : "+count);
                System.out.println("people[select] : "+people[select]);
                count++;
            }

        }
        System.out.println("Array.toString : "+ Arrays.toString(people));
        select = (int) ((Math.random() * people.length));
        System.out.println("최종 people[select] : "+people[select]);
    }


}
