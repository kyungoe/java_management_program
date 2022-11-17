package hr.main;

import hr.dao.WorkRecordDAO;
import hr.vo.WorkRecordVO;

public class WorkRecordMain {
	
	private WorkRecordDAO wdao = new WorkRecordDAO();
	private WorkRecordVO wvo = new WorkRecordVO();
	private String name;
	private String deName;
	private String searchId;
	private int colNum;
	
	public void workRecordCheck() {
		
	}
	
	public void workRecordEmCheck() {
		wdao.workRecordSelectName(name);
	}
	
	public void workRecordDeCheck() {
		wdao.workRecordSelectDe(deName);
	}
	
	public void adminWorkRecordMenu() {
		
	}
	
	public void adminWorkRecordInsert() {
		wdao.workRecordInsert(wvo);
	}
	
	public void adminWorkRecordManage() {
		wdao.workRecordSelectid(searchId);
	}
	
// 확인필요 view 쓸건지 근무기록번호 생성할건지
	public void adminWorkInfo() {
		wdao.workRecordSelectNum(colNum);
	}
	
	public void adminWorkRecordUpdate() {
		wdao.workRecordUpdate(wvo, colNum);
	}
	
	public void adminWorkDelete() {
		wdao.workRecordDelete(wvo, colNum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
