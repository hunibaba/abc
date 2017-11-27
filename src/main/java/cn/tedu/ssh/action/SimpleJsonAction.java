package cn.tedu.ssh.action;

import java.util.ArrayList;
import java.util.List;

public class SimpleJsonAction {
	private Integer state;
	private String message;
	private User user;
	private List<User> users;
	

	public String execute(){
		//struts2-json
		setState(1);//state=1
		setMessage("登录成功");//message="登录成功"
		setUser(getTestUser());
		setUsers(getTestUserList());
		return "success";
	}
	
	private List<User> getTestUserList(){
		List<User> users = new ArrayList<User>();
		users.add(new User(1, "alex", "alex111", "13800138001", "alex@tedu.cn"));
		users.add(new User(2, "billy", "billy111", "13800138002", "billy@tedu.cn"));
		users.add(new User(3, "charley", "charley111", "13800138003", "charley@tedu.cn"));
		users.add(new User(4, "david", "david111", "13800138004", "david@tedu.cn"));
		users.add(new User(5, "edison", "esison111", "13800138005", "edison@tedu.cn"));
		return users;	
	}
	
	private User getTestUser(){
		return new User(9527,"周星星","zhou9527","13800139527","zhouxingxing@tedu.cn");
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}


}
