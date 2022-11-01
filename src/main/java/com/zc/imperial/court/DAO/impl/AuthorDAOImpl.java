package com.zc.imperial.court.DAO.impl;

import com.zc.imperial.court.DAO.AuthorDAO;
import com.zc.imperial.court.baseDAO.BaseDAO;
import com.zc.imperial.court.pojo.Emp;
import com.zc.imperial.court.utils.MD5Util;

/**
 * @author zc
 * @date
 * @description
 */
public class AuthorDAOImpl extends BaseDAO<Emp> implements AuthorDAO {
    @Override
    public Emp getUser(String loginAccount, String loginPassword) {
        String encode = MD5Util.encode(loginPassword);
        String sql="select * from t_emp where login_account=? and login_password=?";
        Emp emp = super.load(sql, Emp.class, loginAccount, encode);
        return emp;
    }
}
