package hr.vo;

import java.util.Date;

public class WorkRecordVO {
	private String id;
	private String department;
	private String position;
	private Date startWorkingDate;
	private Date endWorkingDate;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public Date getStartWorkingDate() {
		return startWorkingDate;
	}
	public void setStartWorkingDate(Date startWorkingDate) {
		this.startWorkingDate = startWorkingDate;
	}
	public Date getEndWorkingDate() {
		return endWorkingDate;
	}
	public void setEndWorkingDate(Date endWorkingDate) {
		this.endWorkingDate = endWorkingDate;
	}
	
	
}
