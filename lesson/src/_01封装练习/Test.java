package _01封装练习;

class Student {
	private String name;
	private int age;

	Student() {

	}

	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	void show() {
		System.out.println("姓名："+this.name+"年龄："+this.age);
	}

}

public class Test {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.setName("zs");
		stu.setAge(17);
		stu.show();
		
		Student stu2 = new Student("ls",20);
		stu2.show(); 
	}

}
