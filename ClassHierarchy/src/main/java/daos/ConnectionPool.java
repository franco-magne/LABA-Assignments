package daos;

import org.apache.commons.dbcp.BasicDataSource;
import javax.sql.DataSource;

public class ConnectionPool {
    private static BasicDataSource dataSource;

    static {
        dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/hierarchy");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");

        dataSource.setMinIdle(5); // Minimum inactive connections
        dataSource.setMaxIdle(10); // Maximum inactive connections
        dataSource.setMaxOpenPreparedStatements(100);
    }

    public static DataSource getDataSource() {
        return dataSource;
    }

}
