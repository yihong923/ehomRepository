package pojo;

public class OrgBean {
	private String orgName;
	
	private String departId;
	
	private String subCompany;
	
	

	public OrgBean(String orgName, String departId, String subCompany) {
		super();
		this.orgName = orgName;
		this.departId = departId;
		this.subCompany = subCompany;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getDepartId() {
		return departId;
	}

	public void setDepartId(String departId) {
		this.departId = departId;
	}

	public String getSubCompany() {
		return subCompany;
	}

	public void setSubCompany(String subCompany) {
		this.subCompany = subCompany;
	}
	
}
