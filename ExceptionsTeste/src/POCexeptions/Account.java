package POCexeptions;

public class Account {
	
	private int number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	public Boolean valid = false;
	
	
	
	
	public Account(int number, String holder, Double balance, Double withdrawLimit) {		
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	public Boolean getValid() {
		return valid;
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	

	public void deposit(Double amount) {
		balance += amount;		
	}
	
	public void withdraw(Double amount) {
		if(amount>withdrawLimit) {
			throw new Exception ("Amount is higher than withdraw Limit");
		}
		if(amount > balance) {
			throw new Exception ("Amount is higher than balance");
		}
		this.valid = true;
		balance -= amount;
	}
}
