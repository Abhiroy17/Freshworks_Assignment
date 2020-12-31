package com.example.demo;

import java.util.*;

//Data repository containing a list to store the user data
public class DataStore {
	
	 List<User> list = new ArrayList<>();
	 
	
	
	public List<User> getAllUsers()
	{
		return list;
	}
	/*Creating key,Value Pair,
	if create() is invoked for an existing key,then controller method
		displays appropriate error message*/
	public boolean addUser(User user)
	{
		 
		
		for(User i:list)
		{
			if(user.getKey().equals(i.getKey()) == true )
				return false;
			
		}
			list.add(user);	
			return true;
		
		}
	
	//Reading from user based on input key
	//If match is found then user information is returned
	public User getUser(String key)
	{
		for(User user:list)
		{
			if(user.getKey().equals(key) )
				return user;
		}
		return null;
	}
	/*Updating the user based on the input key,
	if no matching key is found null is returned to
	controller class*/
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
	//Deleting user based on the input key.
	
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
