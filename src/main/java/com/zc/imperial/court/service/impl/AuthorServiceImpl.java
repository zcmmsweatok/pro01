package com.zc.imperial.court.service.impl;

import com.zc.imperial.court.DAO.AuthorDAO;
import com.zc.imperial.court.DAO.MemorialsDAO;
import com.zc.imperial.court.DAO.impl.AuthorDAOImpl;
import com.zc.imperial.court.DAO.impl.MemorialsDAOImpl;
import com.zc.imperial.court.pojo.Emp;
import com.zc.imperial.court.service.AuthorService;

/**
 * @author zc
 * @date
 * @description
 */
public class AuthorServiceImpl implements AuthorService {
    private AuthorDAO authorDAO=new AuthorDAOImpl();

    @Override
    public Emp getUser(String loginAccount, String loginPassword) {
        return authorDAO.getUser(loginAccount,loginPassword);
    }
}
