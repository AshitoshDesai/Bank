
public class BankAccount {

	int AccountNumber;
	

	String CustomerName;
	int Balance;
	 
	public BankAccount(int AccountNumber, String CustomerName, int Balance ) {
		// TODO Auto-generated constructor stub
		this.AccountNumber=AccountNumber;
		this.CustomerName=CustomerName;
		this.Balance=Balance;
	}
	
	public int getAccountNumber() {
		return AccountNumber;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public int getBalance() {
		
		return Balance;
	}

	public void DepositeAmmount(int ammount) {
		// TODO Auto-generated method stub
		Balance=Balance + ammount;
		
	}

	public Boolean WithdrawAmmount(int ammount) {
		// TODO Auto-generated method stub
		if((Balance-ammount)>=1000){
			Balance=Balance - ammount;
			return true;
		}
			else
			{
				System.out.println("Can't Withdraw");
				return false;
			}
				
	}

	public void GetTotalBalance() {
		// TODO Auto-generated method stub
		System.out.println("The Balance is"+ getBalance());
	}

	public void AccountInfo() {
		// TODO Auto-generated method stub
		System.out.println("Account Number:" + getAccountNumber());
		System.out.println("Customer Name:" + getCustomerName());
	}

	public Boolean Transfer(BankAccount reciver, int ammount) {
		// TODO Auto-generated method stub
		if(WithdrawAmmount(ammount) == true){
			int GST=(ammount/100)*5;
			ammount=ammount-GST;
			System.out.println("Ammount transfer after 5 % GST tax :" + ammount);
		reciver.DepositeAmmount(ammount);
		return true;
		}
		else
		{
		return false;
		}
			
		
	}
	
	
	
	
}
