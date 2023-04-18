package study10_3;

public class TVRun {
	public static void main(String[] args) {
		//size, resolution  32인치 1024컬러
		ColorTV ctv = new ColorTV(32, 1024); 
		ctv.printProperty();
		
		//address, size, resolution 192.1.1.4 주소의 64인치 2048컬러
		IPTV iptv = new IPTV("192.1.1.4",64,2048);
		iptv.printProperty();
	}

}
