package com.zc.imperial.court.servlet;

import com.zc.imperial.court.pojo.Emp;
import com.zc.imperial.court.service.AuthorService;
import com.zc.imperial.court.service.MemorialsService;
import com.zc.imperial.court.service.impl.AuthorServiceImpl;
import com.zc.imperial.court.service.impl.MemorialsServiceImpl;
import com.zc.imperial.court.utils.ImperialCourtConst;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
//jjjjj
/**
 * @author zc
 * @date
 * @description
 */
@WebServlet("/auth")
public class AuthorServlet extends ModelBaseServlet{
    private AuthorService authorService= new AuthorServiceImpl();
    protected void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.获取参数
        String loginAccount = request.getParameter("loginAccount");
        String loginPassword = request.getParameter("loginPassword");
        //2.判断数据库中是否有该用户
        Emp emp=authorService.getUser(loginAccount,loginPassword);
        System.out.println(".......");
        System.out.println(".......");
        //3.如果有，跳转到奏折展示页面
        if(emp!=null){
            //保存作用域
            HttpSession session = request.getSession();
            session.setAttribute(ImperialCourtConst.LOGIN_USER,emp);
            //跳转
            response.sendRedirect(request.getContextPath() + "/memo?method=showList");
        }else {
            processTemplate("index",request,response);
        }
    }

    protected void logout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       super.processTemplate("index",request,response);
    }
}
