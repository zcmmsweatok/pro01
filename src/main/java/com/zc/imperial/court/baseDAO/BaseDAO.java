package com.zc.imperial.court.baseDAO;

import com.zc.imperial.court.utils.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @author zc
 * @date
 * @description
 */
public class BaseDAO<T> {
    private QueryRunner queryRunner=new QueryRunner();
    //执行查询单个实体操作
    public T load(String sql,Class<T> entity,Object...param){
        try {
            //1.获取连接
            Connection connection = JDBCUtils.getConnection();
            //2.执行单个查询操作
            return queryRunner.query(connection,sql,new BeanHandler<>(entity),param);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            throw new RuntimeException("查询单个实体时出错啦");
        }

    }

    //执行增删改查
    public int update(String sql,Object...params){
        try {
            //1.获取连接
            Connection connection = JDBCUtils.getConnection();
            //2.执行更新操作
            return queryRunner.update(connection,sql,params);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            throw new RuntimeException("执行更新时出错啦");
        }
    }

    //执行多值查询
    public List<T> getObjectList(String sql,Class<T> entity,Object...params){
        try {
            //1.获取连接
            Connection connection = JDBCUtils.getConnection();
            //2.执行查询操作
            return queryRunner.query(connection,sql,new BeanListHandler<>(entity),params);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            throw new RuntimeException("执行多值查询时出错啦");
        }
    }
}
