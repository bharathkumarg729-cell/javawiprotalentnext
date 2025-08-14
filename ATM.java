package atm;

class ATM {
	private int pin=1234;
	private double balance = 10000;
	
	public boolean checkPin(int userPin) {
		return userPin == pin;
	}
	public void withdraw(double amount,int userPin) {
		if(checkPin(userPin)) {
			if(amount <= balance) {
				balance-= amount;
				System.out.println("₹" + amount +"withdrawn successfully");
			}
			else {
				System.out.println("Not enough balance");
			}
		}
		else {
			System.out.println("wrong password!");
		}

	}
	public void showBalance(int userPin) {
		if(checkPin(userPin)) {
			System.out.println("current Balance:₹"+balance);
		}else {
			System.out.println("wrong pin!");
		}
			
		
	}

}
