package lect03;

import java.util.Arrays;
import java.util.Scanner;

public class StringBinarySearch {

    public static void stringBinarySearch() {
        Scanner sc = new Scanner(System.in);

        String[] x = {
            "abstract", "assert", "boolean", "break", "byte",
            "case", "catch", "char", "class", "const", "continue",
            "default", "do", "double", "else", "enum", "extends",
            "false", "final", "finally", "float", "for", "if",
            "implements", "import", "instanceof", "int", "interface",
            "long", "native", "new", "null", "package", "private",
            "protected", "public", "return", "short", "static",
            "strictfp", "super", "switch", "synchronized", "this",
            "throw", "throws", "transient", "true", "try", "void",
            "volatile", "while"
        };

        System.out.print("찾을 단어 : ");
        String key = sc.next();

        int index = Arrays.binarySearch(x, key);

        System.out.println(Arrays.toString(x));

        if (index < 0) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println("그 값은 a[" + index + "]에 있습니다.");
        }

    }

}
