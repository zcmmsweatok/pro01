package com.zc.imperial.court.DAO.impl;

import com.zc.imperial.court.DAO.MemorialsDAO;
import com.zc.imperial.court.baseDAO.BaseDAO;
import com.zc.imperial.court.pojo.Emp;
import com.zc.imperial.court.pojo.Memorials;
import com.zc.imperial.court.service.MemorialsService;

import java.util.List;

/**
 * @author zc
 * @date
 * @description
 */
public class MemorialsDAOImpl extends BaseDAO<Memorials> implements MemorialsDAO {

    @Override
    public List<Memorials> getMemorialsService() {
        String sql="select * from t_memorials ";
        super.getObjectList(sql, Memorials.class);
        return super.getObjectList(sql,Memorials.class);
    }
}
