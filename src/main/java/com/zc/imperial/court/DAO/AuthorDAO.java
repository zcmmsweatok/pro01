package com.zc.imperial.court.DAO;

import com.zc.imperial.court.pojo.Emp;

public interface AuthorDAO {
    Emp getUser(String loginAccount, String loginPassword);
}
