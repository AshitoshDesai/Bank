import static org.junit.Assert.*;

import org.junit.Test;

public class BankAccountTest {
	BankAccount b1=new BankAccount(001,"Ashitosh",1000);
	
	 
	@Test
	public void testGetAccountNumber() {
		//fail("Not yet implemented");
	
	 assertEquals(001,b1.getAccountNumber());
	}

	
	@Test
	public void testGetCustomerName() {
		//fail("Not yet implemented");
		assertEquals("Ashitosh",b1.getCustomerName());
	}

	@Test
	public void testGetBalance() {
		//fail("Not yet implemented");
		assertEquals(1000,b1.getBalance());
		// assertNotNull(b1);
	}

	@Test
	public void testDepositeAmmount() {
		//fail("Not yet implemented");
		b1.DepositeAmmount(1000);
		assertEquals(2000,b1.getBalance());
	}




	@Test
	public void testWithdrawAmmount() {
		//fail("Not yet implemented");
		b1.WithdrawAmmount(1000);
		assertEquals(1000,b1.getBalance());
	}

}
