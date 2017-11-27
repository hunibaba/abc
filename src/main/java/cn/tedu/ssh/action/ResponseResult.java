package cn.tedu.ssh.action;

public class ResponseResult<T> {
	//��Ӧ״̬��
	private Integer state;
	//��Ӧ����Ϣ,����:"��¼�ɹ�","��¼ʧ��!�û���������","ע��ʧ��!�û����Ѿ���ռ��","ע��ʧ��!�ֻ������Ѿ��������˺Ű�"
	private String message;
	//��Ӧ������
	//������ĳ���û�(User)����Ϣ,���û��б�(List<User>),����Ʒ�б�(List<Goods>)....
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
