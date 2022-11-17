package hr.dao;

import java.util.ArrayList;
import java.util.List;

import hr.vo.DepartmentVO;
import hr.vo.NoticeVO;

public class DepartmentDAO {
	
	public List<DepartmentVO> departmentList() {
		List<DepartmentVO> departmentlist = new ArrayList<>();
		return departmentlist;
	}
	
	public boolean departmentInfo(String department) {
		return false;
	}

	public boolean departmentInsert(DepartmentVO dvo) {
		return false;
	}
	
	public DepartmentVO departmentSelect(String departmentName) {
		DepartmentVO dvo = null;
		return dvo;
	}
	
	public boolean departmentUpdate(DepartmentVO dvo, String input) {
		return false;
	}
	
	public boolean departmentDelete(DepartmentVO dvo) {
		return false;
	}
	


}
