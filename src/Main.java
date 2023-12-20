import static lect03.PhysExamSearch.insertData;
import static lect03.PhysExamSearch.searchHeightData;

import lect03.PhysExamSearch;


public class Main {

    public static void main(String[] args) {

        PhysExamSearch.PhyscDate[] data = insertData();

        searchHeightData(data);



    }
}