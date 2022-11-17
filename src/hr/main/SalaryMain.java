package hr.main;

import hr.dao.SalaryDAO;
import hr.vo.SalaryVO;

public class SalaryMain {
	
	private String inputYear;
	private String inputMonth;
	private String id;
	private String searchIdsdsds;
	private SalaryDAO sdao = new SalaryDAO();
	private SalaryVO svo = new SalaryVO();
	
	public void selectDateSalary()  {
		
	}
	
	public void mySalaryInfo() {
		sdao.salaryInfo(id, inputYear, inputMonth);
	}
	
	public void adminSalaryMenu() {
		
	}
	
	public void adminSalaryCheck() {
		
	}
	
	public void adminSalaryList() {
		sdao.salarySelectAll();
	}
	
	public void adminSalaryDateCheck() {
		sdao.salarySelectDate(inputYear, inputMonth);
	}
	
	public void adminSalaryInsert() {
		sdao.salaryInsert(svo);
	}
	
	public void adminSalaryManage() {
		sdao.selectSalary(searchId);
	}
	
	public void adminSalaryInfo() {
		sdao.salaryInfo(searchId, inputYear, inputMonth);
	}
	
	public void adminSalaryUpdate() {
		sdao.salaryUpdate(svo);
	}
	
	public void adminSalaryDelete() {
		sdao.salaryDelete(svo);
	}


}
