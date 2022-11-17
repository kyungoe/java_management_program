package hr.dao;

import java.util.ArrayList;
import java.util.List;

import hr.vo.SalaryVO;

public class SalaryDAO {
	
	public SalaryVO salaryInfo(String id, String year, String month) {
		SalaryVO svo = null;
		return svo;
	}
	
	public List<SalaryVO> salarySelectAll() {
		List<SalaryVO> salarylist = new ArrayList<>();
		return salarylist;
	}
	
	public List<SalaryVO> salarySelectDate(String year, String month) {
		List<SalaryVO> salarylist = new ArrayList<>();
		return salarylist;
	}
	
	public boolean salaryInsert(SalaryVO nvo) {
		return false;
	}
	
	public List<SalaryVO> selectSalary(String serachId) {
		List<SalaryVO> salarylist = new ArrayList<>();
		return salarylist;
	}
	
	public boolean salaryUpdate(SalaryVO nvo) {
		return false;
	}
	
	public boolean salaryDelete(SalaryVO nvo) {
		return false;
	}
	
}
