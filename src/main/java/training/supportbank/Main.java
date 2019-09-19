package training.supportbank;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException {

        List<String> lines = Files.readAllLines(Paths.get("Transactions2014.csv"));

        ArrayList<String> names = new ArrayList<>();

        ArrayList<Transactions> transactions = new ArrayList<>();

        for (int i = 1; i < lines.size(); i++) {
            String[] data = lines.get(i).split(",");
            names.add(data[1]);



            System.out.println(data[0]);
            System.out.println(data[1]);
            System.out.println(data[2]);
            System.out.println(data[3]);
            System.out.println(data[4]);
        }
        System.out.println(names);

        System.out.println(transactions);







/*

        ArrayList<String[]> names = new ArrayList<>();







        String fileName = "Transactions2014.csv";
        File file = new File(fileName);
        Scanner inputStream = new Scanner(file);
        inputStream.nextLine();


        while(inputStream.hasNext()){
            String data = inputStream.nextLine();
            String[] values = data.split(",");
            names.add(values);
            //System.out.println(values[1]);

        }
        inputStream.close();
        System.out.println(Arrays.toString(names.toArray()));





    }
*/


    }
}
