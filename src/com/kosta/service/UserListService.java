package com.kosta.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

import com.kosta.dto.UserListDTO;

public interface UserListService {
	/**
	 * ��ü���ڵ� �˻��ϱ�
	 * */
	List<Vector<Object>> getSelectAll()throws SQLException;
	
	/**
	 *  Id �ߺ�üũ �ϱ�
	 *   @return : true�̸� �ߺ�, false�̸� �ߺ��ƴ�.
	 * */
	boolean getCheckById(String id) throws SQLException;
	
	/**
	 * �����ϱ�
	 * */
	int userListInsert(UserListDTO userListDTO)throws SQLException;
	
	/**
	 * �����ϱ�
	 * (ID�� �ش��ϴ� �̸�,����, �ּ� ����) 
	 * */
	int userListUpdate(UserListDTO userListDTO)throws SQLException;
	
	/**
	 * �����ϱ�
	 * (ID�� �ش��ϴ� ���ڵ� ����)
	 * */
	int userListDelete(String id) throws SQLException;
	
	/**
	 * �����ϱ�
	 * (�ѹ��� ������ ���ڵ� �����ϱ�)
	 * */
	int userListDelete(String [] ids)throws SQLException;
	
	/**
	 * keyField�� keyWord�� ���Ե� ���ڵ� �˻��ϱ�
	 * */
	List<Vector<Object>> getSearchUser(String keyField, String keyWord)throws SQLException;
}
