package training.supportbank;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws FileNotFoundException {
/*
        List<String> lines = Files.readAllLines(Paths.get("Transactions2014"));

        System.out.println(lines);
        for (int i = 0; i< lines.size(); i++) {
            lines.get(i).split(",");
        }
*/








        String fileName = "Transactions2014.csv";
        File file = new File(fileName);
        Scanner inputStream = new Scanner(file);
        inputStream.nextLine();


        while(inputStream.hasNext()){
            String data = inputStream.nextLine();
            String[] values = data.split(",");
            System.out.println(values[0]);

        }
        inputStream.close();




        System.out.println("Test!");
    }


}
