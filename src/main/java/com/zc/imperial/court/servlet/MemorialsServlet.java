package com.zc.imperial.court.servlet;

import com.zc.imperial.court.pojo.Memorials;
import com.zc.imperial.court.service.MemorialsService;
import com.zc.imperial.court.service.impl.MemorialsServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * @author zc
 * @date
 * @description
 */
@WebServlet("/memo")
public class MemorialsServlet extends ModelBaseServlet{
    private MemorialsService memorialsService=new MemorialsServiceImpl();
    protected void showList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.获取页面列表
        List<Memorials> memorialsList= memorialsService.getMemorialsService();
        //2.保存到作用域
        HttpSession session = request.getSession();
        session.setAttribute("memorialsList",memorialsList);
        //3.跳转页面
        processTemplate("temp",request,response);
    }
}
