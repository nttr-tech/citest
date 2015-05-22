package jp.co.nttr_tech.citest;

public class ValidateForm {
	
	static boolean isValidString(String value) {
		// 8文字以内はNG
		if(value.length() < 8){
			return false;
		}
		// 数字のみの8-10文字はNG
		if(value.matches("^[0-9]{8,10}$")){
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
