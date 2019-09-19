package training.supportbank;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException {

        List<String> lines = Files.readAllLines(Paths.get("Transactions2014.csv"));


        ArrayList<Transaction> transactions = new ArrayList<>();

        for (int i = 1; i < lines.size(); i++) {
            String[] data = lines.get(i).split(",");
            //transactions.add(new Transaction(names));
            Transaction transaction = new Transaction();
            transaction.accountHolder = data[1];
            transaction.amountSent = new BigDecimal(data[4]);
            //transaction.date = new LocalDate(data[0]);
            transaction.reason = data[3];
            transaction.to = data[2];
            transactions.add(transaction);
        }

       // System.out.println(transactions.get(0).accountHolder);

        ArrayList<TeamMumber> members = new ArrayList<>();

        for (int i = 0; i < transactions.size(); i++) {

            TeamMumber member = new TeamMumber();
            //if ()
            member.Name = transactions.get(0).accountHolder;
            members.add(member);

            //System.out.println(transactions.get(i).accountHolder);




        }
        System.out.println(members);


















       // System.out.println(names);

       // System.out.println();






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
