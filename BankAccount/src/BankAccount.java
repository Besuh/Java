import java.util.Random;
public class BankAccount {
	private String accountNumber;
	private double checkingBalance=0;
	private double savingsBalance=0;
	private static int accountCount = 0;
	private static int totalMoney = 0;
	private String randomAccount() {
		Random rand = new Random();
		String x = "";
		for(int i=0;i<10;i++) {
			int r = rand.nextInt(10);
			x =String.format("%s%i", x, r);
		}
		return x;
	}
	public BankAccount() {
		setAccountNumber(randomAccount());
		BankAccount.accountCount++;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public static int getTotalMoney() {
		return totalMoney;
	}
	public static int getAccountCount() {
		return accountCount;
	}
	public double getCheckingBalance() {
		return checkingBalance;
	}
	public double getSavingsBalance() {
		return savingsBalance;
	}
	public void depost(String acc, int num) {
		if(acc == "Savings") {
			this.savingsBalance += num;
			BankAccount.totalMoney += num;
		}
		else {
			this.checkingBalance += num;
			BankAccount.totalMoney += num;
		}
	}
	public void withdraw(String acc, int num) {
		if(acc=="Savings" && savingsBalance > num) {
			savingsBalance -= num;
		}
		else if(acc=="Checkings" && checkingBalance > num) {
			checkingBalance -= num;
		}
	}
	public double balance() {
		return checkingBalance + savingsBalance;
	}

}
