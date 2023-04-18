package study16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryWithResources {

	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(new File("C:\\Users\\kosmo\\eclipse-workspace\\javastudy\\src\\study16\\input.txt"));
			System.out.println(sc.nextLine());
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일을 찾을 수 없습니다. 파일 위치를 확인하세요.");
		}finally {
			if(sc != null) {
				sc.close();
			}
		}
		
		
	}
	
}
