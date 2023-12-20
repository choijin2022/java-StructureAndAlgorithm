import static lect03.ArrSort.arrSortName;
import static lect03.ArrSort.compName;

import lect03.ArrSort;


public class Main {

    public static void main(String[] args) {

        ArrSort[] person = {new ArrSort("z"), new ArrSort("d"), new ArrSort("a")};


        arrSortName(person);

        compName(person,  new ArrSort("e") );



    }
}