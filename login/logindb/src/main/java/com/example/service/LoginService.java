package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.beans.User;
import com.example.dao.ILoginDao;

@Service
public class LoginService  implements LoginServiceInter {

	
	
	@Autowired
	ILoginDao dao;
	
	@Override
	public int Validate(String username, String password) {
		// TODO Auto-generated method stub
		return  dao.Validate(username, password);
	}

	@Override
	public List<User> showProducts() {
		// TODO Auto-generated method stub
		return dao.showProducts();
	}

}
