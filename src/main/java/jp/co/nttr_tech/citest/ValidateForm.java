package jp.co.nttr_tech.citest;

public class ValidateForm {
	
	static boolean isValidString(String value, int len) {
		// 8文字以内はNG
		if(value.length() < len){
			return false;
		}
		if(value.matches("^[0-9]$")){
			return false;
		}
		return true;
	}

	static boolean isValidPassword(String userName, String userPassword) {
		// PW内にID文字列を含むとNG
		if(userPassword.contains(userName)) {
			return false;
		}
		return true;
	}
}
