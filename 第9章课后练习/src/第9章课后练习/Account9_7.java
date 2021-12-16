package 第9章课后练习;

import java.util.Date;
public class Account9_7 {
	private int id=0;
	private double balance=0;
	private double annualInterestRate=0;
	private Date dateCreate;
	Account9_7(){
		id=0;//账户
		balance=0;//余额
		annualInterestRate=0;//年利率
		dateCreate=new Date();//日期
	}
	Account9_7(int id,double balance,double annualInterestRate){
		this.id=id;
		this.balance=balance;
		this.annualInterestRate=annualInterestRate;
	}
	public int get_id(){
		return this.id;
	}
	public double get_balance(){
		return this.balance;
	}
	public double get_rate() {
		return this.annualInterestRate;
	}
	public Date get_Date() {
		return this.dateCreate;
	}
	public double getMonthlyInterestRate() {
		return this.annualInterestRate/1200.0;
	}
	public double getMonthlyInterest() {
		return this.balance*this.getMonthlyInterestRate();
	}
	public void withDraw(double money) {
		this.balance-=money;
	}
	public void deposit(double money) {
		this.balance+=money;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method student
		Account9_7 account=new Account9_7(1122,2000,4.5);
		account.withDraw(2500);
		account.deposit(3000);
		System.out.println("Balance: "+account.get_balance());
		System.out.println("MouselyInterest: "+account.getMonthlyInterest());
		System.out.println("Create date: "+account.get_Date());
	}

}

