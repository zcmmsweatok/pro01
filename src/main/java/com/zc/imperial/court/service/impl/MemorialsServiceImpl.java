package com.zc.imperial.court.service.impl;

import com.zc.imperial.court.DAO.MemorialsDAO;
import com.zc.imperial.court.DAO.impl.MemorialsDAOImpl;
import com.zc.imperial.court.pojo.Emp;
import com.zc.imperial.court.pojo.Memorials;
import com.zc.imperial.court.service.MemorialsService;

import java.util.List;

/**
 * @author zc
 * @date
 * @description
 */
public class MemorialsServiceImpl implements MemorialsService {
    private MemorialsDAO memorialsDAO=new MemorialsDAOImpl();
    @Override
    public List<Memorials> getMemorialsService() {
        return memorialsDAO.getMemorialsService();
    }
}
