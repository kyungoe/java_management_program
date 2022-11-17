package hr.main;

import java.util.List;
import java.util.Scanner;

import exam.vo.MemberVO;
import hr.dao.SalaryDAO;
import hr.vo.SalaryVO;

public class SalaryMain {
	
	private Scanner scan = new Scanner(System.in);
	private String inputYear;
	private String inputMonth;
	private String id;
	private String searchId;
	private SalaryDAO sdao = new SalaryDAO();
	private SalaryVO svo = new SalaryVO();
	
	public void selectDateSalary()  {//급여지급날짜선택
		System.out.println("========== 조회할 연도와 월을 입력해주세요==========");
		System.out.print("   연도 : ");
		inputYear = scan.nextLine();
		
		System.out.print("   월 : ");
		inputMonth = scan.nextLine();
		
		List<SalaryVO> salarylist = sdao.salarySelectDate(inputYear, inputMonth);//년도,월 체크
		if(salarylist != null) {
				mySalaryInfo();
		} else { //일치하는값이 없을 시
			System.out.println("   일치하는 값이 없습니다.");
			System.out.println();//메인 메뉴 표시
			memberMenu();
		}
	}
	
	public void mySalaryInfo() {//내급여지급상세보기
		sdao.salaryInfo(id, inputYear, inputMonth);
		
		
	}
	
	public void adminSalaryMenu() {//관리자급여지급내역메뉴
		
	}
	
	public void adminSalaryCheck() {//관리자 급여 지급 내역 조회화면
		
	}
	
	public void adminSalaryList() {//관리자 급여지급내역전체조회(날짜순)
		sdao.salarySelectAll();
	}
	
	public void adminSalaryDateCheck() {//관리자급여지급내역 연도,월별조회
		sdao.salarySelectDate(inputYear, inputMonth);
	}
	
	public void adminSalaryInsert() {//관리자 급여 지급 내역 등록화면
		sdao.salaryInsert(svo);
	}
	
	public void adminSalaryManage() {//관리자 급여지급 내역 관리화면
		sdao.selectSalary(searchId);
	}
	
	public void adminSalaryInfo() {//관리자 급여지급내역 상세보기 화면
		sdao.salaryInfo(searchId, inputYear, inputMonth);
	}
	
	public void adminSalaryUpdate() {//관리자 급여지급내역 수정화면
		sdao.salaryUpdate(svo);
	}
	
	public void adminSalaryDelete() {//관리자 급여지급 내역 삭제화면
		sdao.salaryDelete(svo);
	}


}
