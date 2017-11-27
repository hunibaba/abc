package cn.tedu.ssh.action;

public class ResponseResult<T> {
	//响应状态码
	private Integer state;
	//响应的消息,例如:"登录成功","登录失败!用户名不存在","注册失败!用户名已经被占用","注册失败!手机号码已经被其他账号绑定"
	private String message;
	//响应的数据
	//可能是某个用户(User)的信息,或用户列表(List<User>),或商品列表(List<Goods>)....
	private T data;
	
	
	public ResponseResult() {
		super();
	}
	public ResponseResult(Integer state, String message) {
		super();
		this.state = state;
		this.message = message;
	}
	public ResponseResult(Integer state, T data) {
		super();
		this.state = state;
		this.data = data;
	}
	public ResponseResult(Integer state, String message, T data) {
		super();
		this.state = state;
		this.message = message;
		this.data = data;
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
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
	
}
