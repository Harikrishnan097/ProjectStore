package com.example.service;

import java.util.List;

import com.example.beans.User;

public interface LoginServiceInter {
	public int Validate(String username,String password);
	public List<User> showProducts();
}
