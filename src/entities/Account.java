package entities;

public class Account {
	
	private int countNumber;
	private String name;
	private double balance;
	
	private static double tax = 5.00;
	
	
	public Account(int countNumber, String name, double initialValue) {
		this.countNumber = countNumber;
		this.name = name;
		deposit(initialValue);
	}

	public Account(int countNumber, String name) {
		this.countNumber = countNumber;
		this.name = name;
	}

	public int getCountNumber() {
		return countNumber;
	}

	public void setCountNumber(int countNumber) {
		this.countNumber = countNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit (double value) {
		balance += value;
		
	}
	public void toWithDraw (double value) {
		balance -= value + tax ;
		
	}

	@Override
	public String toString() {
		return "Account data : "
				+"Account " 
				+ this.getCountNumber() 
				+ ", Holder:" 
				+ this.name
				+ ", Balance : $" 
				+ String.format("%.2f", this.balance); 
				
	}
	

}
