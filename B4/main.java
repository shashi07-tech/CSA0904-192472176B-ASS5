import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> records = new ArrayList<>();
        records.add("P101,192472170,Shashank,R10,1500");
        records.add("P102,192472176,RishiR10,1500");
        records.add("P103,192472175,Tillu,R20,1200");
        System.out.println("FILE RECORDS:");
        for (String record : records) {
            System.out.println(record);
        }
        System.out.println("\nMIGRATION PROCESS:");
        System.out.println("1. Read records from file.");
        System.out.println("2. Connect to database.");
        System.out.println("3. Start transaction.");
        System.out.println("4. Use PreparedStatement.");
        System.out.println("5. Insert records using batch.");
        System.out.println("6. Commit transaction.");
        System.out.println("7. Verify database records.");
        System.out.println("\nMigration completed successfully.");
    }
}
