package _07interface;

abstract public class Animal {

	protected int legs;

	protected Animal() {
		// TODO Auto-generated constructor stub
	}

	protected Animal(int legs) {
		this.legs = legs;
	}

	abstract public void eat();

	public void walk() {
		System.out.println("腿数量" + this.legs);
		;
	}

}

class Spider extends Animal {

	protected Spider() {
		super(8);
	}

	public void eat() {
		System.out.println("蜘蛛吃蚊子");
	}

}

interface IPetable {
	// public String name=null;
	abstract public String getName();

	abstract public void setName(String name);

	abstract public void play();
}

class Cat extends Animal implements IPetable {
	private String name;

	public Cat(String name) {
		super(4);
		this.name = name;
		
	}

	public Cat() {
		this("");
	}

	public String getName() {
		return this.name;
		
	}

	public void setName(String name) {
		this.name = name;
	}

	public void play() {
		System.out.println("猫捉老鼠");
	}

	public void eat() {
		System.out.println("猫吃老鼠");
	}
}

class Fish extends Animal implements IPetable {
	private String name;

	public Fish() {

	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void play() {
		System.out.println("鱼游泳");
	}

	public void eat() {
		System.out.println("鱼吃啥？");
	}

}
