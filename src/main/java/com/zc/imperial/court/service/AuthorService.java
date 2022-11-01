package com.zc.imperial.court.service;

import com.zc.imperial.court.pojo.Emp;

public interface AuthorService {
    Emp getUser(String loginAccount, String loginPassword);
}
