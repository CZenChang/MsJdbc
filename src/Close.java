import java.sql.SQLException;

public class Close extends Connector {

    Close(){
        try {
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if(sts != null)sts.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                try {
                    if(psts != null)psts.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
