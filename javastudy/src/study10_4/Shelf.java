package study10_4;

import java.util.ArrayList;

public class Shelf {
	protected ArrayList<String> shelf; //String 대신 object를 선언하면 모든형의 변수입력가능
		
	public Shelf() {
		shelf = new ArrayList<String>();
	}
	
	public ArrayList<String> getShelf(){
		return shelf;
	}
	public int getCount() {
		return shelf.size();
	}
	
	

}
