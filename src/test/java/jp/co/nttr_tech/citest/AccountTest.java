/**
 * 
 */
package jp.co.nttr_tech.citest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author kurisima
 *
 */
public class AccountTest {
	private Account _account;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		_account = new Account();
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertFalse(_account.login("001","002"));
		assertFalse(_account.login("1234567","A234567"));
		assertFalse(_account.login("1234567890","A234567890"));
		assertFalse(_account.login("12345678901","12345678901"));
		assertTrue(_account.login("12345678901","A2345678901"));
	}

}
