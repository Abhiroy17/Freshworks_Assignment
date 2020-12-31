package com.example.demo;

import java.util.*;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class SimpleController {
	
	
	DataStore ds=new DataStore();
	//Getting all users
	@GetMapping("/allusers")
	public List<User> getAllUsers(){
		return ds.getAllUsers();
	}
	//Reading user
	@GetMapping("/getuser")
	public User getAUser(@RequestParam String q){
		User tempUser = ds.getUser(q);
		if(tempUser != null)
			return tempUser;
		return null;
	} 
	
	
	//Creating user
	@PostMapping("/adduser")
	public String createUser(@RequestBody User user)  {
		    boolean flag=ds.addUser(user);
		    if(flag == true)
		    	return "User added successfully...";
		    else {
		    	return "Create cannot be invoked on an existing key...";
			}

	}
	
	//Updating user based on key
	@PutMapping("/updateuser")
	public String updateUser(@RequestParam String q, @RequestBody User user) 
	{
		Boolean flag=ds.updateUser(q,user);
		 	if( flag != null)
			{
				return "User updated successfully...";
			}
		 	else {
		 		return ("key entered is not present!!!!");
			}
	}
	
	
	//Deleting user
	@DeleteMapping("/deleteuser")
	public String deleteUser(@RequestParam String q )
	{
		boolean flag=ds.deleteUser(q);
		if(flag==true)
			return "User deleted successfully...";
		else {
			return ("key entered is not present!!!!"); 
		}
	}
}
