package com.pe.bluering.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;

import com.pe.admin.vo.BookVo;
import com.pe.bluering.dao.BookDAO;

public class BookLoading implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
			
			BookDAO bookdao = new BookDAO();
			JSONArray arr = bookdao.getAllBookLoading();
			System.out.println("Loading :"+arr);
			if(arr != null) {
				PrintWriter out ;
				try {
					out = response.getWriter();
					out.print(arr);
					out.flush();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	}

}
