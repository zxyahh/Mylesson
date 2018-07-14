package _01封装练习;

public class Rectangle {
	private int width;
	private int height;
	Rectangle(int width,int height){
		this.setWidth(width);
		this.setHeight(height);
	}
	

	public int getWidth() {
		return width;
	}



	public void setWidth(int width) {
		if(width<=0) {
			System.out.println("输入有误");
			return;
		}else {
		this.width = width;
	}

	}

	public int getHeight() {
		return height;
	}



	public void setHeight(int height) {
		if(height<=0) {
			System.out.println("输入有误");
			return;
		}else {
		this.height = height;
	}}
		//周长
	/* int getLength(){
			return 2*(this.getWidth()+this.getHeight());
		}
	}
	*/



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
