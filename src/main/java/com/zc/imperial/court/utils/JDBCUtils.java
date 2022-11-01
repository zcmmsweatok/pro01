package com.zc.imperial.court.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author zc
 * @date
 * @description
 */
public class JDBCUtils {
    private static DataSource dataSource;
    //创建一个本地线程
    public static ThreadLocal<Connection> threadLocal=new ThreadLocal<>();
    //初始化dataSource
    static {
        try {
            //获取输入流
            InputStream stream = JDBCUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
            //放置到properties中去
            Properties properties = new Properties();
            properties.load(stream);

            dataSource = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("初始化dataSource出错啦");
        }
    }
    //获取连接
    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = threadLocal.get();
            if(connection==null){
                connection=dataSource.getConnection();
                threadLocal.set(connection);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            throw new RuntimeException("获取连接出错啦");
        }
        return connection;
    }

    //释放连接
    public static void releaseConnection(Connection connection){
        try {
            if(connection!=null){
                connection.close();
                threadLocal.remove();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            throw  new RuntimeException("释放连接出错啦");
        }
    }
}
