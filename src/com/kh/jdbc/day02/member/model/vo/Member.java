package com.kh.jdbc.day02.member.model.vo;

import java.sql.Timestamp;

public class Member {
	private String memberId;
	private String memberPwd;
	private String memberName;
	private String MemberGender;
	private int MemberAge;
	private String MemberEmail;
	private String MemberPhone;
	private String MemberAddress;
	private String MemberHobby;
	private Timestamp memberDate;
	
	public Member() {}

	

	public Member(String memberId, String memberPwd, String memberName, String memberGender, int memberAge,
			String memberEmail, String memberPhone, String memberAddress, String memberHobby, Timestamp memberDate) {
		super();
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.memberName = memberName;
		MemberGender = memberGender;
		MemberAge = memberAge;
		MemberEmail = memberEmail;
		MemberPhone = memberPhone;
		MemberAddress = memberAddress;
		MemberHobby = memberHobby;
		this.memberDate = memberDate;
	}



	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPwd() {
		return memberPwd;
	}

	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberGender() {
		return MemberGender;
	}

	public void setMemberGender(String memberGender) {
		this.MemberGender = memberGender;
	}

	public int getMemberAge() {
		return MemberAge;
	}

	public void setMemberAge(int memberAge) {
		this.MemberAge = memberAge;
	}

	public String getMemberEmail() {
		return MemberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.MemberEmail = memberEmail;
	}

	public String getMemberPhone() {
		return MemberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.MemberPhone = memberPhone;
	}

	public String getMemberAddress() {
		return MemberAddress;
	}

	public void setMemberAddress(String memberAddress) {
		this.MemberAddress = memberAddress;
	}

	public String getMemberHobby() {
		return MemberHobby;
	}

	public void setMemberHobby(String memberHobby) {
		this.MemberHobby = memberHobby;
	}

	public Timestamp getMemberDate() {
		return memberDate;
	}

	public void setMemberDate(Timestamp memberDate) {
		this.memberDate = memberDate;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberPwd=" + memberPwd + ", memberName=" + memberName
				+ ", MemberGender=" + MemberGender + ", MemberAge=" + MemberAge + ", MemberEmail=" + MemberEmail
				+ ", MemberPhone=" + MemberPhone + ", MemberAddress=" + MemberAddress + ", MemberHobby=" + MemberHobby
				+ ", memberDate=" + memberDate + "]";
	}
	

	
}