package _01_banking;

public class Bank {
	//创建customers对象数组
	Customer[] customers;
	//创建客户数量
	int numberOfCustomers;
	//创建customr对象
	private Customer customer;
	//构造函数，构造customer
	public Bank(){
		customers = new Customer[5];
	}
	//增加客户方法
	public void addCustomer(String f,String l){
		this.customer = new Customer(f,l);
		customers[numberOfCustomers]=this.customer;
		numberOfCustomers = numberOfCustomers + 1;
	}
	//获取客户数量方法
	public int getNumOfCustomers(){
		return this.numberOfCustomers;
	}
	//根据索引获取客户数量
	public Customer getCustomer(int index){
		return this.customers[index];
	}
}
