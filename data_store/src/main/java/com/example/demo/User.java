package com.example.demo;



public class User {
	private String key;
	private String value;
	private int timeout;
	 public User(String key,String value, int timeout) {
		super();
		this.key=key;
		this.value = value;
		this.timeout = timeout;
	}
	 /*public User(String id,String value) {
			super();
			this.id=id;
			this.value = value;
			
		}
	*/
	 public String getKey()
	 {
		 return key;
	 }
	 public void setKey(String key)
	 {
		 this.key=key;
	 }
	public String getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
	/**
	 * @return the timeout
	 */
	public int getTimeout() {
		return timeout;
	}
	/**
	 * @param timeout the timeout to set
	 */
	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}
	 

}
