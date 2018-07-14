package _01_banking;
//创建存储账户继承于账户
public class SavingsAccount extends Account{
	//声明变量利率
	private double interestRate;
	//构造方法，存款额度传给父类，利率传给自己
	public SavingsAccount(double balance,double interest_rate ){
		super(balance);
		this.interestRate = interest_rate;
	}
}
