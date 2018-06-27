package pojo;

public class UserBean {
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDepartId() {
		return departId;
	}

	public void setDepartId(String departId) {
		this.departId = departId;
	}

	public String getJobTitleId() {
		return jobTitleId;
	}

	public void setJobTitleId(String jobTitleId) {
		this.jobTitleId = jobTitleId;
	}

	private String userName;
	
	private String password;
	
	private String departId;
	
	private String jobTitleId;
	
	public UserBean(String userName, String password, String departId, String jobTitleId) {
		this.userName = userName;
		this.password = password;
		this.departId = departId;
		this.jobTitleId= jobTitleId;
	}

}
