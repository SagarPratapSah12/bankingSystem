import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public DatabaseConnection() {
    }

    public static void main(String[] var0) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String var1 = "jdbc:mysql://localhost:3306/bank";
            String var2 = "root";
            String var3 = "aniket@#12";
            Connection var4 = DriverManager.getConnection(var1, var2, var3);
            System.out.println("Connection established successfully!");
            var4.close();
        } catch (ClassNotFoundException var5) {
            System.out.println("MySQL JDBC Driver not found.");
            var5.printStackTrace();
        } catch (SQLException var6) {
            System.out.println("Connection failed.");
            var6.printStackTrace();
        }

    }
}
