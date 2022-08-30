package sourcePack;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;

public class configCSV{
    public static void main(String[] args) throws Exception{
        String file = "C:\\Users\\Rajeev\\Desktop\\file.csv";
        try {
  
            // Create an object of filereader
            // class with CSV file as a parameter.
            FileReader filereader = new FileReader(file);

            // create csvReader object passing
            // file reader as a parameter
            CSVReader csvReader = new CSVReader(filereader);
            String[] nextRecord;

            // we are going to read data line by line
            while ((nextRecord = csvReader.readNext()) != null) {
                for (String cell : nextRecord) {
                    System.out.print(cell + "\t");
                }
                System.out.println();
            }
            System.out.println("This is in try ");
        }catch (IOException e) {
            System.out.println("Error 00000-----------");
        }
    }
}