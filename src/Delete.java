import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Delete extends Connector{

    Delete(){
        super();
    }



    void delete ( String row){



        String sql ="delete eip_member from eip_member where "+row;


        try {

            psts=con.prepareStatement(sql);


            System.out.println( "被影響row: "+psts.executeUpdate()+"行");


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
