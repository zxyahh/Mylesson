package _01_banking;
//创建客户类
public class Customer {
	//声明成员变量，姓名
	private String firstName;
	private String lastName;
	//成员变量，客户数量
	int num ;
	//private Account account;
	//声明账户类型数组，存储账户
	private Account[] accounts;
	//构造方法，创建客户
	public Customer(String f,String l){
		this.firstName = f;
		this.lastName = l;
		accounts = new Account[100];
	}
	//获取姓
	public String getFirstName(){
		return this.firstName;
	}
	//获取名字
	public String getLastName(){
		return this.lastName;
	}
	/*
	//获取账户
	public Account getAccount( ){
		return this.account;
	}
	//创建账户
	public void setAccount(Account acct){
		this.account = acct;
	}
	*/
	//增加账户，并计数
	public void addAccount(Account acct){
		//this.account =acct;
		//accounts = new Account[0];
		
		accounts[this.num] =acct;
		this.num++;
	}
	//获取账户
	public Account getAccount(int account_num){
		return accounts[account_num];
	}
	//获取账户数量
	public int getNumOfAccounts(){
		return this.num;
	}
	
}
