package com.hc;

import com.hc.utils.DBUtils;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) throws SQLException {
        Connection conn = DBUtils.getConnection();
        System.out.println(conn);

        Statement stmt = conn.createStatement();
        String sql = "select * from tb_dept";
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            System.out.println(rs.getInt("deptno") + "\t" + rs.getString("dname") + "\t" + rs.getString("loc"));
        }

        DBUtils.closeConnection(conn);
    }

}
