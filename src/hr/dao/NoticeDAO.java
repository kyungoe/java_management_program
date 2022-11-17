package hr.dao;

import java.util.ArrayList;
import java.util.List;
import hr.vo.*;

public class NoticeDAO {
	
	public List<NoticeVO> noticeSelectAll() {
		List<NoticeVO> noticelist = new ArrayList<>();
		return noticelist;
	}
	
	public List<NoticeVO> noticeSearchList() {
		List<NoticeVO> noticeSearchList = new ArrayList<>();
		return noticeSearchList;
	}
	
	public NoticeVO noticeInfo(int noticeNumber) {
		NoticeVO nvo = null;
		return nvo;
	}
	
	public boolean noticeInsert(NoticeVO nvo) {
		return false;
	}
	
	
	public boolean noticeUpdate(NoticeVO nvo) {
		return false;
	}
	
	public boolean noticeDelete(NoticeVO nvo) {
		return false;
	}
	
}
