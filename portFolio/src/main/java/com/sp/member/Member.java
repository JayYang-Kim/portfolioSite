package com.sp.member;

public class Member {
	private int userIdx; // 유저번호
	private String userId; // 유저 아이디
	private String userPwd; // 유저 비밀번호
	private String userName; // 유저 이름
	private String postCode; // 우편번호
	private String userAddr1; // 주소1
	private String userAddr2; // 주소2
	private String etc; // 기타주소
	private String userTel; // 전화번호
	private String userEmail; // 이메일
	private String birth; // 생일
	private int gender; // 성별
	private String userCreated_date; // 생성일
	private String userModify_date; // 수정일
	private int enabled; // 활성여부
	private String role; // 권한 (ROLE)
	
	public int getUserIdx() {
		return userIdx;
	}
	public void setUserIdx(int userIdx) {
		this.userIdx = userIdx;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getUserAddr1() {
		return userAddr1;
	}
	public void setUserAddr1(String userAddr1) {
		this.userAddr1 = userAddr1;
	}
	public String getUserAddr2() {
		return userAddr2;
	}
	public void setUserAddr2(String userAddr2) {
		this.userAddr2 = userAddr2;
	}
	public String getEtc() {
		return etc;
	}
	public void setEtc(String etc) {
		this.etc = etc;
	}
	public String getUserTel() {
		return userTel;
	}
	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getUserCreated_date() {
		return userCreated_date;
	}
	public void setUserCreated_date(String userCreated_date) {
		this.userCreated_date = userCreated_date;
	}
	public String getUserModify_date() {
		return userModify_date;
	}
	public void setUserModify_date(String userModify_date) {
		this.userModify_date = userModify_date;
	}
	public int getEnabled() {
		return enabled;
	}
	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}	
}
