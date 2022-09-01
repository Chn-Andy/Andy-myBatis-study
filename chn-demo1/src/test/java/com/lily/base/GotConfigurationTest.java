package com.lily.base;

import org.apache.ibatis.builder.xml.XMLConfigBuilder;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;

import java.io.IOException;
import java.io.Reader;

/**
 * @author caohu
 * @since 2022/5/18
 * MyBatis
 */
public class GotConfigurationTest {

    public static void main(String[] args) throws IOException {
        Reader resourceAsReader = Resources.getResourceAsReader("mybatis-config.xml");
        XMLConfigBuilder xmlConfigBuilder = new XMLConfigBuilder(resourceAsReader);
        Configuration configuration = xmlConfigBuilder.parse();
    }
}
