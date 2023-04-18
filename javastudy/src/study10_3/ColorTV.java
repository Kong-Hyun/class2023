package study10_3;

public class ColorTV extends TV {
	
	private int color;
	
	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}

	public void printProperty() {
		System.out.println(getSize() + "인치 " + color + "컬러 TV");
	}

	protected int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

}
