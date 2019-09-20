package training.supportbank;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) throws IOException {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        List<String> lines = Files.readAllLines(Paths.get("Transactions2014.csv"));



        ArrayList<Transaction> transactions = new ArrayList<>();

        for (int i = 1; i < lines.size(); i++) {
            String[] data = lines.get(i).split(",");
            Transaction transaction = new Transaction();
            transaction.accountHolder = data[1];
            transaction.amountSent = new BigDecimal(data[4]);
            transaction.date = LocalDate.parse(data[0], dateTimeFormatter);
            transaction.reason = data[3];
            transaction.to = data[2];
            transactions.add(transaction);
        }


        ArrayList<TeamMember> members = new ArrayList<>();

        for (int i = 0; i < transactions.size(); i++) {
            if (checkIfAccountHolderDoesntExists(transactions.get(i).accountHolder, members)) {
                TeamMember member = new TeamMember();
                member.Name = transactions.get(i).accountHolder;
                members.add(member);
            }
        }
        
        
        
        
        for (int i = 0; i < transactions.size();i++) {
            updateBalance(transactions.get(i).accountHolder,transactions.get(i).amountSent,members);
        }
    
        System.out.println(members);






    }


    private static boolean checkIfAccountHolderDoesntExists(String accountHolder, ArrayList<TeamMember> members) {

        for (int i = 0; i < members.size(); i++) {
            if (accountHolder.equals(members.get(i).Name)) {
                return false;
            }
        }
        return true;
    }
    
    
    private  static void updateBalance(String name, BigDecimal amountSent, ArrayList<TeamMember> members ) {
        
        for (int i = 0; i < members.size(); i++){
            if(name.equals(members.get(i).Name)){
                members.get(i).Balance = members.get(i).Balance.subtract(amountSent);
            }
        }
    }
    
    


}








//        System.out.println(members);

//            ArrayList<TeamMember> membersWithNoDuplicats = new ArrayList<>();
//
//
//
//            for(int i = 0; i < members.size(); i++){
//                }
//
//
//            }


   //     for(int member.get(1).name : )











/*            Set<String> set = new HashSet<>(member.);
//            members.clear();
//            members.addAll(set);

//            for (TeamMember teamMember : members) {
//                if (teamMember.Name == member.Name) {
//                    System.out.println(member.Name);
//                }
//            }
            //System.out.println(transactions.get(i).accountHolder);




//          System.out.println(members);*/
//          System.out.println(names);
//          System.out.println();






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


