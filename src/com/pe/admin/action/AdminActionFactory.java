package com.pe.admin.action;


public class AdminActionFactory {

	public AdminAction getAction(String command) {
		AdminAction action = null;
		
		if(command.equals("productWriteForm")) {
			action = new ProductWriteAction();
		}else if(command.equals("index")) {
			action = new index();
		}else if(command.equals("orderForm")) {
			action = new orderFormAction();
		}else if(command.equals("customer")) {
			action = new Customer();
		}else if(command.equals("BookRegistAction")) {
			action = new BookRegistAction();
		}else if(command.equals("BookList")) {
			action = new BookListAction();
		}else if(command.equals("BookDetail")) {
			action = new BookDetailAction();
		}else if(command.equals("Search")) {
			action = new SearchAction();
		}else if(command.equals("BookModify")) {
			action = new BookModifyAction();
		}else if(command.equals("BookUpdateAction")) {
			action = new BookUpdateAction();
		}else if(command.equals("BookDelete")) {
			action = new BookDeleteAction();
		}else if(command.equals("excelDownload")) {
			action = new ExcelDownload();
		}
		
		System.out.println(action);
		return action;
	}
}
