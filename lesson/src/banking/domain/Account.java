package banking.domain;
//创建Account类
public class Account {
	//创建存款额度balance
	protected double balance;
	//构造函数balance
	public Account(double init_balance){
		this.balance =init_balance;
	}
	//获取存款余额balance
	public double getBalance(){
		return this.balance;
	}
	//存款行为，成功为true
	public boolean deposit(double amt){
		this.balance = this.balance + amt;
		return true;
	}
	//取款行为，成功返回true，失败返回false
	public boolean withdraw(double amt){
		if(amt<this.balance){
			this.balance = this.balance -amt;
			return true;
		}
		else{
			return false;		
		}
	}
}
