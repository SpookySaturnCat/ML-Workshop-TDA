package meeting4;

import org.apache.commons.csv.*;
import java.io.*;
import java.util.*;

public class LoadData {
    public static List<List<String>> loadCSV(String filename) throws IOException {
        Reader in = new FileReader(filename);
        Iterable<CSVRecord> records = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(in);
        List<List<String>> data = new ArrayList<>();

        for (CSVRecord record : records) {
            data.add(List.of(record.get("sepallength"), record.get("sepalwidth"), record.get("petallength"),
                    record.get("petalwidth"), record.get("class")));
        }
        return data;
    }

    public static void main(String[] args) throws IOException {
        List<List<String>> dataset = loadCSV("iris.csv");
        System.out.println("First 5 rows of dataset: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(dataset.get(i));
        }
        System.out.println("Dataset size: " + dataset.size());
    }
}
