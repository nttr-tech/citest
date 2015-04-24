package jp.co.nttr_tech.citest;

public class ValidateForm {
	
	static boolean isValidString(String value) {
		if(value.length() < 8){
			return false;
		}
		return true;
	}

	static boolean isValidPassword(String userName, String userPassword) {
		if(userPassword.contains(userName)) {
			return false;
		}
		return true;
	}
}
