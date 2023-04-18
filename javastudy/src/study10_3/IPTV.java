package study10_3;

public class IPTV extends ColorTV {
	
	private String address;
	
	public IPTV(String address, int size, int color) {
		super(size, color);
		this.address = address;
		
	}

	public void printProperty() {
		System.out.println("IPTV는 " + address + " 주소의 "+ getSize() + "인치 " + getColor() + "컬러 TV");
	}
	
	protected String getAddress() {
		return address;
	}
	
}
