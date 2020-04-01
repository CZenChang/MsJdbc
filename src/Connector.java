import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Connector {

    Connection con = null;
    Statement sts = null;
    PreparedStatement psts = null;

    Connector(){

        String windowsChe="integratedSecurity=true";
        String  sa=   "user=sa;password=1234;";

        try {

            String Url = "jdbc:sqlserver://localhost:1433;" +
                         "databaseName=testdb;"+sa;

            con = DriverManager.getConnection(Url);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
