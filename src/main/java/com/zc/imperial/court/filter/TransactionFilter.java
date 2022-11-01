package com.zc.imperial.court.filter;

import com.zc.imperial.court.utils.JDBCUtils;

import javax.servlet.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author zc
 * @date
 * @description
 */
public class TransactionFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        Connection connection=null;
        try {
            //1.获取连接
            connection= JDBCUtils.getConnection();
            //2.设置自动提交为false
            connection.setAutoCommit(false);
            //3.放行
            filterChain.doFilter(servletRequest,servletResponse);

            //4.提交
            connection.commit();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            //5.回滚
            try {
                connection.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }finally {
            //6.释放连接
          //  JDBCUtils.releaseConnection(connection);
        }
    }

    @Override
    public void destroy() {

    }
}
