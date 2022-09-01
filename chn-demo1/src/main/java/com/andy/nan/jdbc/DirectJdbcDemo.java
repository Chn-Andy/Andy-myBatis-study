package com.andy.nan.jdbc;

import org.apache.ibatis.jdbc.SQL;

import java.sql.*;

/**
 * @author caohu
 * @since 2022/5/11
 * MyBatis
 */
public class DirectJdbcDemo {

    public static void main(String[] args) throws SQLException {
        String sql = new SQL().SELECT("*").FROM("user").toString();
        Connection connection = DriverManager.getConnection("");
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            resultSet.getString("name");
        }
    }

}
