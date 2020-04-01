import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InsertInto extends Connector{

    InsertInto(){
        super();
    }

    void insert(String[] data){


        Date date = new Date();
        SimpleDateFormat df =new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat df1 =new SimpleDateFormat("HH:mm:ss");

        String sql ="INSERT eip_member ([m_account], [m_password], [m_block], [m_name], [m_email], [m_gender], [is_ad], [m_create_date], [m_create_time]) " +
                    "VALUES ( ?,  ?,   ?,  ?,  ?,   ?,  ?,  ?,  ?)";


        try {

             psts=con.prepareStatement(sql);


            psts.setString(1,data[0]);
            psts.setString(2,data[1]);
            psts.setString(3,data[2]);
            psts.setString(4,data[3]);
            psts.setString(5,data[4]);
            psts.setString(6,data[5]);
            psts.setString(7,"KM");
            psts.setString(8,df.format(date));
            psts.setString(9,df1.format(date));


            System.out.println( "row: "+psts.executeUpdate()+"行");


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }




}
