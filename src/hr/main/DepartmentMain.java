package hr.main;

import hr.dao.DepartmentDAO;
import hr.vo.DepartmentVO;

public class DepartmentMain {
	
	private String departmentName;
	
	private DepartmentDAO ddao = new DepartmentDAO();
	private DepartmentVO dvo = new DepartmentVO();
	
	public void departmentCheck() {
		ddao.departmentList();
	}
	
	public void departmentInfo() {
		ddao.departmentInfo(departmentName);
	}
	
	public void adminDeMenu() {
		
	}
	
	public void adminDeInsert() {
		ddao.departmentInsert(dvo);
	}
	
	public void adminDeManage() {
		
	}
	
	public void adminDeInfo() {
		dvo = ddao.departmentSelect(departmentName);
	}
	
	public void adminDeUpdate() {
		String input = null;
		ddao.departmentUpdate(dvo, input);
	}
	
	public void adminDeDelete() {
		String input = null;
		ddao.departmentDelete(dvo);
	}
	

}
