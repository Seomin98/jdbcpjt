package com.kh.jdbc.day02.member.run;
import java.util.List;
import com.kh.jdbc.day02.member.controller.MemberController;
import com.kh.jdbc.day02.member.model.vo.Member;
import com.kh.jdbc.day02.member.view.MemberView;
public class MemberRun {
	public static void main(String [] args) {
		MemberView mView = new MemberView();
		MemberController mCon = new MemberController();
		Member member = null;
		int result = 0;
		String memberId = "";
		String memberName = "";
		
		goodbye :
		while(true) {
			int choice = mView.mainMenu();
			switch(choice) {
			case 0 : break goodbye;
			case 1 : 
				List<Member> mList = mCon.printAll();
				mView.showAll(mList);
				break;
			case 2 : 
				memberId = mView.inputMemberId("검색");
				member = mCon.printOneById(memberId);
				if(member != null) {
					mView.showOne(member);
				}else {
					mView.displayError("일치하는 회원이 존재하지 않습니다.");
				}
				break;
			case 3 : 
				memberName = mView.inputMemberName("검색");
				mList = mCon.printMembersByName(memberName);
				if(mList.size() > 0) {
					mView.showAll(mList);
				}else {
					mView.displayError("일치하는 회원이 존재하지 않습니다.");
				}
				break;
			case 4 : 
				member = mView.inputMember();
				result = mCon.registerMember(member);
				if(result > 0) {
					// 성공!
					mView.displaySuccess("회원 가입 성공");
				}else {
					// 실패!
					mView.displayError("회원가입이 되지 않았습니다.");
				}
				break;
			case 5 : 
				// 아이디를 입력 받고
				memberId = mView.inputMemberId("수정");
				// 데이터가 존재하면
				member = mCon.printOneById(memberId);
				if(member != null) {
					// 수정할 데이터 입력
					member = mView.modifyMember(memberId);
					// 입력받은 데이터로 수정하기!
					result = mCon.modifyMemberInfo(member);
					if(result > 0) {
						mView.displaySuccess("수정 성공!");
					}else {
						mView.displayError("수정이 되지 않았습니다.");
					}
				}else {
					mView.displayError("일치하는 회원이 존재하지 않습니다.");
				}
				break;
			case 6 : 
				// 회원 삭제
				memberId = mView.inputMemberId("삭제");
				result = mCon.removeMember(memberId);
				if(result > 0) {
					mView.displaySuccess("회원 탈퇴 성공^^");
				}else {
					mView.displayError("회원 탈퇴가 완료되지 않았습니다.");
				}
				break;
			case 7 :
				member = mView.inputLoginInfo();
				result = mCon.checkInfo(member);
				if(result > 0) {
					// 로그인 성공
					mView.displaySuccess("로그인 성공!");
				}else {
					// 로그인 실패
					mView.displayError("일치하는 정보가 존재하지 않습니다.");
				}
				break;
			default : break;
			}
		}
	}
}