String sql =
    "INSERT INTO bus_pass " +
    "(pass_id, reg_no, name, route_no, amount) " +
    "VALUES (?, ?, ?, ?, ?)";

PreparedStatement ps =
    con.prepareStatement(sql);

for (int i = 1; i <= 1000; i++) {

    ps.setString(1, "P" + i);
    ps.setString(2, "REG" + i);
    ps.setString(3, "Student" + i);
    ps.setInt(4, i % 20);
    ps.setDouble(5, 3000 + i);

    ps.addBatch();
}

ps.executeBatch();
Java Implementation:
import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("JDBC METHODS COMPARISON");
        System.out.println("\n1. Statement");
        System.out.println("Used for simple SQL queries.");
        System.out.println("\n2. PreparedStatement");
        System.out.println("Used for parameterized SQL queries.");
        System.out.println("Provides better security.");
        System.out.println("\n3. Batch Processing");
        System.out.println("Processes multiple operations together.");
        System.out.println("\n4. Transaction");
        System.out.println("Groups multiple operations as one unit.");
        System.out.println("\nRecommended Approach:");
        System.out.println(
                "PreparedStatement + Batch Processing + Transaction");
    }
}
