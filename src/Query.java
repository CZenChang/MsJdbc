import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Query extends Connector{


    Query(){
        super();
    }



    void queryall (){

        ResultSet rs = null;

        String que = "select * from eip_member";
        try {

            sts=con.createStatement();


            rs=sts.executeQuery(que);

            while(rs.next()){
                System.out.println( "帳號:"+rs.getString("m_account")+
                                    "| 密碼:"+rs.getString("m_password")+
                                    "| 停用:"+rs.getString("m_block")+
                                    "| 姓名:"+rs.getString("m_name")+
                                    "| 信箱:"+rs.getString("m_email")+
                                    "| 性別:"+rs.getString("m_gender")+
                                    "| id_ad:"+rs.getString("is_ad")+
                                    "| date:"+rs.getString("m_create_date")+
                                    "| time:"+rs.getString("m_create_time")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    void queryByData (String nameAndData){

        ResultSet rs = null;

        String que = "select * from eip_member where "+  nameAndData;
        try {
            if(sts == null){
                sts=con.createStatement();
            }

            rs=sts.executeQuery(que);

            while(rs.next()){
                System.out.println( "帳號:"+rs.getString("m_account")+
                                    "| 密碼:"+rs.getString("m_password")+
                                    "| 停用:"+rs.getString("m_block")+
                                    "| 姓名:"+rs.getString("m_name")+
                                    "| 信箱:"+rs.getString("m_email")+
                                    "| 性別:"+rs.getString("m_gender")+
                                    "| id_ad:"+rs.getString("is_ad")+
                                    "| date:"+rs.getString("m_create_date")+
                                    "| time:"+rs.getString("m_create_time")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
