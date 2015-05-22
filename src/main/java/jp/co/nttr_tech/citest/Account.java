package jp.co.nttr_tech.citest;

public class Account {

	public boolean login(String userName, String userPassword) {
		if(!ValidateForm.isValidString(userName, 8)){
			return false;
		}
		if(!ValidateForm.isValidPassword(userName, userPassword)){
			return false;
		}
		return true;
	}

}
