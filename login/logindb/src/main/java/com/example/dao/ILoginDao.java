package com.example.dao;

import java.util.List;

import com.example.beans.User;

public interface ILoginDao {

	public int Validate(String username,String password);
	
	public List<User> showProducts();
	
}
