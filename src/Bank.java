
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Customer c1=new Customer("Ashitosh");
		BankAccount b1=new BankAccount(001,"Ashitosh",1000);
		BankAccount b2=new BankAccount(002,"jessio",1000);
		
		b1.AccountInfo();
		b1.GetTotalBalance();
		b1.DepositeAmmount(1000);
		b1.GetTotalBalance();
		//b1.WithdrawAmmount(1000);
		b1.GetTotalBalance();

		//implement transfer accross account using deposite and withdraw
		//implement GST 5%
		System.out.println("Balance of Reciver before Transfer");	
		b2.AccountInfo();
		b2.GetTotalBalance();
		System.out.println("Balance of Reciver after Transfer");
		
		if(b1.Transfer(b2,100)== true){
			System.out.println("Transfer sucessfull");
	
		b2.GetTotalBalance();
			System.out.println("Balance of Sender after Transfer");
		b1.GetTotalBalance();
		}
		else{
			System.out.println("Transfer fail");
		}
		
	}

}
