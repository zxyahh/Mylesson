package _02继承练习;

class Animal{
	private String color;
	private int leg;
	Animal(String color,int leg){
		this.color = color;
		this.leg =leg;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getLeg() {
		return leg;
	}
	public void setLeg(int leg) {
		this.leg = leg;
	}
	
}

class Dog extends Animal{
	Dog(String color,int leg){
	super(color,leg);
}
public class Test {
	

}}
