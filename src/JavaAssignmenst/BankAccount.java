package JavaAssignmenst;

public class BankAccount {
	
	String accountNumber;
	String accountHolderName;
	double balance;
	
	 public BankAccount(String accountNumber, String accountHolderName, double balance) {
	        setAccountNumber(accountNumber);  // Using setter for validation
	        setAccountHolderName(accountHolderName);
	        setBalance(balance);  // Using setter for validation
	    }
	
	public void setAccountNumber(String account_Number) {
	if(account_Number != null && account_Number.length()>=10) 
		this.accountNumber=account_Number;
	 else {
        throw new IllegalArgumentException("Account number must be a 10-digit number.");
    }
		
	}
	public void setAccountHolderName(String account_HolderName) {
		accountHolderName=account_HolderName;
	}
	public void setBalance(double account_balance){
		if (account_balance >= 0) {
            this.balance = account_balance;
        } else {
            throw new IllegalArgumentException("Balance cannot be negative.");
        }
	}
	
    public String getaccountNumber() {
		return accountNumber;
	}
	public String getaccountHolderName() {
		return accountHolderName;
				
	}
	public double getbalance(){
		return balance;
				
	}
	
	public void deposit(double amount) {
		if (amount > 0) {
            this.balance += amount;
            System.out.println("Balance after deposit:"+this.balance);
        } else {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
	}
	public void withdraw(double amount) {
		if (amount > 0 && amount <= this.balance) {
			this.balance -= amount;
			System.out.println("Balance after witdraw:"+this.balance);
		}
            else 
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
       	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount BA = new BankAccount("ACNO0000000","TestAccountName",6799.98);		
				
		BA.getaccountNumber();
		BA.getaccountHolderName();
		BA.getbalance();
		
		BA.deposit(4000);
		BA.withdraw(3000);
		BA.deposit(00);
		BA.withdraw(10000);

	}

}
