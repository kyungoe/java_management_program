package hr.dao;

import java.util.ArrayList;
import java.util.List;

import hr.vo.NoticeVO;
import hr.vo.WorkRecordVO;

public class WorkRecordDAO {
	
	public List<WorkRecordVO> workRecordSelectName(String name) {
		List<WorkRecordVO> workRecordList = new ArrayList<>();
		return workRecordList;
	}
	
	public List<WorkRecordVO> workRecordSelectDe(String deName) {
		List<WorkRecordVO> workRecordList = new ArrayList<>();
		return workRecordList;
	}
	
	public boolean workRecordInsert(WorkRecordVO wvo) {
		return false;
	}
	
	public List<WorkRecordVO> workRecordSelectid(String id) {
		List<WorkRecordVO> workRecordList = new ArrayList<>();
		return workRecordList;
	}
	
	public List<WorkRecordVO> workRecordSelectNum(int colnum) {
		List<WorkRecordVO> workRecordList = new ArrayList<>();
		return workRecordList;
	}
	
	public boolean workRecordUpdate(WorkRecordVO wvo, int colnum) {
		return false;
	}
	
	public boolean workRecordDelete(WorkRecordVO wvo, int colnum) {
		return false;
	}
}
