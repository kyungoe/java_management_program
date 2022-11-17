package hr.main;

import hr.dao.EmployeeDAO;
import hr.vo.EmployeeVO;

public class EmployeeMain {
	
	private EmployeeDAO edao = new EmployeeDAO();
	private EmployeeVO evo = new EmployeeVO();
	private String id;
	private String searchId;
	private String department;
	
	public void memberCheck()  { // 직원조회
		
	}
	
	public void memberNaCheck() {
		edao.emNameList();
	}
	
	public void memberDeCheck() {
		edao.emDeCheck(department);
	}
	
	public void adminEmMenu() {
		
	}
	
	public void adminEmInsert() {
		edao.emInsert(evo);
	}
	
	public void adminEmManage() {
		
	}
	
	public void adminEmInfo() {
		evo = edao.emInfo(searchId);
	}
	
	public void adminEmUpdate() {
		
	}

	public void adminEmDelete() {
		edao.emDelete(evo);
	}
	
	public void adminEmInfoUpdate() {
		edao.emInfoUpdate(evo);
	}
	
	public void adminEmResign() {
		edao.emResign(evo);
	}
	
	public void adminEmDeUpdate() {
		edao.emDeUpdate(evo);
	}
	
	public void adminEmSalaryUpdate() {
		edao.emSalaryUpdate(evo);
	}
	

}
