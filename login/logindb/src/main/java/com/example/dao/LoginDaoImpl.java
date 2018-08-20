package com.example.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.beans.User;


@Repository
public class LoginDaoImpl implements ILoginDao{

	@Autowired
	@PersistenceContext	
	EntityManager em;
	
	
	
	@Override
	public int  Validate(String username, String password) {
		// TODO Auto-generated method stub
		
		String select = "From User WHERE username=:username and password=:password";

		
		
		
		Query query = em.createQuery(select);
		query.setParameter("username", username);
		query.setParameter("password", password);
		 if(query.getResultList().size() == 0){
		        System.out.println("Account does not exist!");
		        return 0;
		    }
		 
		 else{
		    	
		    	
		        System.out.println("Login Success!");
		        User login = (User) query.getSingleResult(); //error here
		        return 1;
		      
		    }
		
		
		
		
	
	}
	
	
	public List<User> showProducts() {
		
		List<User> list =new ArrayList<>();
		Query q=em.createQuery("from User");
		list =q.getResultList();
		return list;
	
}
	

}
