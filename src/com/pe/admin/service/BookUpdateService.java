package com.pe.admin.service;

import java.io.File;
import java.sql.SQLException;

import com.pe.admin.vo.BookVo;
import com.pe.bluering.dao.BookDAO;

public class BookUpdateService {

	public int bookUpdate(BookVo bookvo) throws SQLException {
		
		int isModifySuccess = 0;

		BookDAO bookDao = new BookDAO();

		
		isModifySuccess = bookDao.bookUpdate(bookvo);
		System.out.println("Update Service : " + isModifySuccess);

		
		if(isModifySuccess>0) {
			isModifySuccess = 1;
		}else {
			isModifySuccess = 0;
		}

		
		return isModifySuccess;
	}

}
