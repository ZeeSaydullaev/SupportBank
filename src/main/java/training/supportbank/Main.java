package training.supportbank;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
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


}
