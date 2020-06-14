package com.hc.utils;

import com.hc.App;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @类名: DBUtils
 * @作者: 梁云亮
 * @生产日期 2020/2/2 12:53
 * @功能描述:
 */
public class DBUtils {

    public static Connection getConnection()  {
        HikariConfig config = new HikariConfig(App.class.getClassLoader().getResource("hikaricp.properties").getPath());
        HikariDataSource ds = new HikariDataSource(config);

        Connection conn = null;
        try {
            conn = ds.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void closeConnection(Connection conn){
        if(conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
