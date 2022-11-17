package hr.dao;

import java.util.ArrayList;
import java.util.List;

import hr.vo.EmployeeVO;
import hr.vo.NoticeVO;

public class EmployeeDAO {
	
	
	public List<EmployeeVO> emNameList() {
		List<EmployeeVO> emNameList = new ArrayList<>();
		return emNameList;
	}
	
	public boolean emDeCheck(String department) {
		return false;
	}
	
	public boolean emInsert(EmployeeVO evo) {
		return false;
	}
	
	public EmployeeVO emInfo(String id) {
		EmployeeVO evo = null;
		return evo;
	}
	
	
	public boolean emDelete(EmployeeVO evo) {
		return false;
	}
	
	public boolean emInfoUpdate(EmployeeVO evo) {
		return false;
	}
	
	public boolean emResign(EmployeeVO evo) {
		return false;
	}
	
	public boolean emDeUpdate(EmployeeVO evo) {
		return false;
	}
	
	public boolean emSalaryUpdate(EmployeeVO evo) {
		return false;
	}

}
