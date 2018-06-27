package pojo;

public class JobTitleBean {
	
	private String jobTitleName;
	
	private String jobTileId;

	public JobTitleBean(String jobTitleName, String jobTileId) {
		super();
		this.jobTitleName = jobTitleName;
		this.jobTileId = jobTileId;
	}

	public String getJobTitleName() {
		return jobTitleName;
	}

	public void setJobTitleName(String jobTitleName) {
		this.jobTitleName = jobTitleName;
	}

	public String getJobTileId() {
		return jobTileId;
	}

	public void setJobTileId(String jobTileId) {
		this.jobTileId = jobTileId;
	}
	
	

}
