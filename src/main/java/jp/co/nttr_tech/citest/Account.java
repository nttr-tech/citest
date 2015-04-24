package jp.co.nttr_tech.citest;

public class Account {

	public boolean login(String userName, String userPassword) {
//		if(!ValidateForm.isValidString(userName)){
//			return false;
//		}
//		if(!ValidateForm.isValidPassword(userName, userPassword)){
//			return false;
//		}		
		if("001".equals(userName) && "002".equals(userPassword)){
			return true;
		}
		return false;
	}

}
