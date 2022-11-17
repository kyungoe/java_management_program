package hr.main;

import hr.dao.NoticeDAO;
import hr.vo.NoticeVO;

public class NoticeMain {
	
	private NoticeDAO ndao = new NoticeDAO();
	private NoticeVO nvo = new NoticeVO();
	private String search;
	private int noticeNumber;
	
	public void noticeCheck() {
		
	}
	
	public void noticeList() {
		ndao.noticeSelectAll();
	}
	
	public void noticeSearch() {
		
	}
	
	public void noticeSearchResult() {
		ndao.noticeSearchList();
	}
	
	public void memberNoticeInfo() {
		ndao.noticeInfo(noticeNumber);
	}
	
	public void adminNoticeMenu() {
		
	}
	
	public void adminNoticeInfo() {
		ndao.noticeInfo(noticeNumber);
	}
	
	public void adminNoticeUpdate() {
		ndao.noticeUpdate(nvo);
	}
	
	public void adminNoticeDelete() {
		ndao.noticeDelete(nvo);
	}
	
	public void adminNoticeInsert() {
		ndao.noticeInsert(nvo);
	}

}
