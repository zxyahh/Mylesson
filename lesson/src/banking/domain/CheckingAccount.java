package banking.domain;
//创建联合账户类
public class CheckingAccount extends Account{
	//声明成员变量透支保护额度
	private double overdraftProtection;
	//构造方法，金额传入父类
	public CheckingAccount(double balance){
		super(balance);
	}
	//构造方法金额传入父类，透支额度传入
	public CheckingAccount(double balance,double protect){
		super(balance);
		this.overdraftProtection = protect;
	}
	//重写父类取款方法
	public boolean withdraw(double amt){
		//���ȡ����С�ڴ��
		if(amt<=this.balance){
			this.balance = this.balance - amt;
			return true;
		//ȡ���ȴ��ڴ��С��͸֧���	
		}else if(amt-this.balance<=overdraftProtection){
			 overdraftProtection = this.balance + overdraftProtection -amt;
			 this.balance =0;
			return true;
			//͸֧
		}else{
			return false;
		}
	}
}
