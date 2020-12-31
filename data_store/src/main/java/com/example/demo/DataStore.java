package com.example.demo;

import java.util.*;


public class DataStore {
	 List<User> list = new ArrayList<>();
	 
	
	
	public List<User> getAllUsers()
	{
		return list;
	}
	
	public boolean addUser(User user)
	{
		//Checking if create() is invoked for an existing key,then controller method throws an exception
		for(User i:list)
		{
			if(user.getKey().equals(i.getKey()) == true )
				return false;
			
		}
			list.add(user);	
			return true;
		
		}
	
	public User getUser(String key)
	{
		for(User user:list)
		{
			if(user.getKey().equals(key) )
				return user;
		}
		return null;
	}
	
	public Boolean updateUser(String key,User user)
	{
		for(User i:list)
		{
			if(i.getKey().equals(key) )
			{
				i.setKey(user.getKey());
				i.setValue(user.getValue());
				i.setTimeout(user.getTimeout());
				return true;
			}
			
		}
		return null;
		
	}
	
	public boolean deleteUser(String key)
	{
		for(User user:list)
		{
			if(user.getKey().equals(key) ) {
				list.remove(user);
				return true;
			}
				
		}
		return false;
	}

}
