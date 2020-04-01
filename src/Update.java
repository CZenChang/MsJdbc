import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Update extends Connector{
    Update(){
        super();
    }



    void update ( String[] data){

        Date date = new Date();
        SimpleDateFormat df =new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat df1 =new SimpleDateFormat("HH:mm:ss");

        String sql ="update eip_member set " +
                    "m_account =?," +
                    "m_password = ?," +
                    "m_block = ?," +
                    "m_name = ?," +
                    "m_email = ?," +
                    "m_gender = ? ,"+
                    "is_ad = 'KM' ,"+
                    "m_create_date = \'"+df.format(date)+"\'  ,"+
                    "m_create_time = \'"+df1.format(date)+"\'"+
                    "   where m_account = ?";


        try {

            psts=con.prepareStatement(sql);


            psts.setString(1,data[0]);
            psts.setString(2,data[1]);
            psts.setString(3,data[2]);
            psts.setString(4,data[3]);
            psts.setString(5,data[4]);
            psts.setString(6,data[5]);
            psts.setString(7,data[6]);
            System.out.println( "被影響row: "+psts.executeUpdate()+"行");


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }




}
