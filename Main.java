package atm;

public class Main {

	public static void main(String[] args) {
		ATM atm=new ATM();
		atm.withdraw(2000,1234);
		atm.showBalance(1234);
		atm.withdraw(5000,1111);
		atm.showBalance(1111);

	}

}
