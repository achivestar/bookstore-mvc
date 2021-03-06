package com.pe.bluering.action;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pe.bluering.service.ServiceCartAdd;
import com.pe.bluering.vo.CartVo;

public class CartAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		
		String memberId = request.getParameter("memberId");
		System.out.println(memberId);
		ServiceCartAdd serviceCartAdd = new ServiceCartAdd();
		ArrayList<CartVo> cartList = serviceCartAdd.selectCart(memberId);
		request.setAttribute("cartList", cartList);
		String url = "/member/cart.jsp";

		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);

	}

}
