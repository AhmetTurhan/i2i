import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;

public class OracleSelect {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection url = DriverManager.getConnection("jdbc:oracle:thin:@localhost:49161:XE","system","oracle");
            Statement statement = url.createStatement();


            Random randomNum = new Random();
            long startTime = System.nanoTime();

            for (int i = 0; i<100000; i++){
                ResultSet resultSet = statement.executeQuery("SELECT NUM FROM HR.TEST WHERE İD = "+i+"");
            }

            long workingTime = System.nanoTime() - startTime;
            System.out.println((double)workingTime/1_000_000_000.0);

        }
        catch (Exception e){
            System.out.println(e);
        }
    }


}
