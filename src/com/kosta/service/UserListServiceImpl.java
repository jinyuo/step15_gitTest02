package com.kosta.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

public class UserListServiceImpl implements UserListService {

	@Override
	public List<Vector<Object>> getSelectAll() throws SQLException {
		System.out.println("동홍 추가 파일");
		return null;
	}

	@Override
	public boolean getCheckById(String id) throws SQLException {
		return false;
	}

	@Override
	public int userListDelete(String id) throws SQLException {
		return 0;
	}

	@Override
	public int userListDelete(String[] ids) throws SQLException {
		return 0;
	}

	@Override
	public List<Vector<Object>> getSearchUser(String keyField, String keyWord) throws SQLException {
		return null;
	}

}
