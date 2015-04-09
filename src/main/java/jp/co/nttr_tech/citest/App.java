package jp.co.nttr_tech.citest;

public class App {
	public static void main(String[] args) {
		Account account = new Account();
		String userName = "001";
		String passWord = "002";
		account.login(userName, passWord);
	}
}
