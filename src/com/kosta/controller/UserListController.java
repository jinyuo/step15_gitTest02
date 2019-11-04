package com.kosta.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

import com.kosta.dto.UserListDTO;
import com.kosta.service.UserListService;
import com.kosta.service.UserListServiceImpl;
import com.kosta.view.FailView;
import com.kosta.view.SuccessView;

public class UserListController {
	private static UserListService service = new UserListServiceImpl();
    /**
     * ��ü���ڵ� �˻��ϱ�
     * */
	public static List<Vector<Object>> getSelectAll() {
		//���� ȣ��
		List<Vector<Object>> list=null;
		try {
		  list = service.getSelectAll();
		}catch (Exception e) {
			e.printStackTrace();
			FailView.errorMessage(e.getMessage());
		}
		return list;
	}
	
	/**
	 * �˻��ܾ �ش��ϴ� ���ڵ� �˻��ϱ�
	 * */
	public static List<Vector<Object>> getSearchUser(String keyField, String keyWord) {
      List<Vector<Object>> list =null;
	  try {
    	   list=service.getSearchUser(keyField, keyWord);
    	   
       }catch (Exception e) {
    	 e.printStackTrace();
		 FailView.errorMessage(e.getMessage());
	   }
		return list;
	}

	public static boolean getCheckById(String id) {
		boolean result = true;
		try {
			 result = service.getCheckById(id);
		}catch(SQLException e) {
			//e.printStackTrace();
			FailView.errorMessage(e.getMessage());
		}
		return result;
	}

	/**
	 * �����ϱ�
	 * */
	public static int userListInsert(UserListDTO userListDTO) {
		int result=0;
		try {
			result = service.userListInsert(userListDTO);
			SuccessView.successMessage(userListDTO.getName()+"�� ���� �Ǿ����ϴ�.");
		}catch(Exception e) {
			FailView.errorMessage(e.getMessage());
		}
		return result;
	}

	/**
	 * ���� �����ϱ�
	 * */
	public static int userListUpdate(UserListDTO userListDTO) {
		int result=0;
		try {
			result = service.userListUpdate(userListDTO);
			SuccessView.successMessage("������ �����Ǿ����ϴ�.");
		}catch (Exception e) {
			FailView.errorMessage(e.getMessage());
		}
		return result;
	}

	/**
	 * id�� �ش��ϴ� ���ڵ� �����ϱ�
	 * */
	public static int userListDelete(String[] ids) {
		int result=0;
		try {
			result = service.userListDelete(ids);
			SuccessView.successMessage("�����Ǿ����ϴ�.");
		}catch (Exception e) {
			FailView.errorMessage(e.getMessage());
		}
		return result;
	}

}








