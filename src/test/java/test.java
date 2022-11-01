import com.zc.imperial.court.utils.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;

/**
 * @author zc
 * @date
 * @description
 */
public class test {
    @Test
    public void test(){
        Connection connection = JDBCUtils.getConnection();
        System.out.println(connection);
    }
}
