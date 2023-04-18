package study06;

public class CarMain {
	//필드
	private String carName;
	private String modelName;
	private String size;
	//생성자
	CarMain(){}
	CarMain(String carName, String modelName, String size){
		this.carName = carName;
		this.modelName = modelName;
		this.size = size;
	}
	//메서드
	void acc(){
		System.out.println("가속하기");
	}
	void bre(){
		System.out.println("감속하기");
	}
	void tra(){
		System.out.println("변속하기");
	}
	//getter setter
	/*
	public 자료형1 get이름() {
		return 이름;
	}
	public void set이름(자료형1 이름) {
		this.이름 = 이름;
	}
	*/
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	public static void main(String[] args) {
		CarMain car = new CarMain();
		car.setCarName("sportage");
		car.setModelName("SUV");
		car.setSize("4,660mm");
		System.out.println(car.carName);
		System.out.println(car.modelName);
		System.out.println(car.size);
		car.acc();
		car.bre();
		car.tra();
		
		CarMain car2 = new CarMain();
		car2.setCarName("sorento");
		car2.setModelName("SUV");
		car2.setSize("4,810mm");
		System.out.println(car2.carName);
		System.out.println(car2.modelName);
		System.out.println(car2.size);
		car2.acc();
		car2.bre();
		car2.tra();
		
	}
	

}
