package jp.co.nttr_tech.citest;

public class Account {

	public boolean login(String userName, String userPassword) {
		if(!ValidateForm.isValidString(userName)){
			return false;
		}
		if(!ValidateForm.isValidPassword(userName, userPassword)){
			return false;
		}
		if("00000001".equals(userName) && "00000002".equals(userPassword)){
			return true;
		}
		if("123456789012".equals(userName) && "ABCDEFGHIJK".equals(userPassword)){

			return true;
		}
		return false;
	}

}
