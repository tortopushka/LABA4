import au.com.bytecode.opencsv.CSVReader;

import java.io.*;
import java.util.List;
import java.util.*;

/**
 * this class needs to read csv files
 */

public class Reader {
    private  String csvFilePath;

    /**
     * constructor
     * @param csvFilePath — path to file, which has String format
     */
    public Reader(String csvFilePath) {
        this.csvFilePath = csvFilePath;
    }

    /**
     * this method converts data from csv file to list
     * @return list
     */
    public List<Person> fromCsvToList(){
        List<Person> list=new LinkedList<>();
        try (InputStream in = getClass().getClassLoader().getResourceAsStream(csvFilePath);
             CSVReader reader = in == null ? null : new CSVReader(new InputStreamReader(in), ';')) {
            if (reader == null) {
                throw new FileNotFoundException(csvFilePath);
            }
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                if(nextLine.length > 2){
                    Person person = new Person(nextLine[0], nextLine[1], nextLine[2], nextLine[3], nextLine[4].charAt(0) - 'A', nextLine[4], nextLine[5]);
                    list.add(person);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}