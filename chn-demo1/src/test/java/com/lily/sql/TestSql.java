package com.lily.sql;

import org.apache.ibatis.jdbc.SQL;

/**
 * @author caohu
 * @since 2022/5/9
 * Andy-myBatis-study
 */
public class TestSql {

    public static void main(String[] args) {
        System.out.println(new SQL()
                .SELECT("name")
                .FROM("user")
                .WHERE("id = 1")
                .toString());
        System.out.println("-----------------------");
        System.out.println(new SQL() {{
            UPDATE("user");
            SET("name = #{name}");
            WHERE("id = 1");
        }});
        System.out.print("a");
        runTest();
        System.out.print("b");
    }


    public static void runTest(){
        System.out.print(System.lineSeparator());
    }

}
