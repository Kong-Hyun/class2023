package study17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class FileInputOutputStreamRun {
	
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\kosmo\\eclipse-workspace\\javastudy\\src\\study17\\files\\TestFile.txt");
		
		OutputStream os1 = new FileOutputStream(file);
		byte[] barr1 = "InputOutput practice".getBytes();
		os1.write(barr1);
		os1.write('\n');
		os1.flush();
		os1.close();
		
		InputStream is = new FileInputStream(file);
		int data;
		while((data=is.read())!=-1) {
			System.out.println((char)data + " " + is.available());
		}
		is.close();
		
		InputStream is2 = new FileInputStream(file);
		
		byte[] barr2 = new byte[23];
		int data2;
		while((data2 = is2.read(barr2))!=-1) {
			for(int i=0; i<data2; i++) {
				System.out.print((char)barr2[i]);
			}
			System.out.println(Arrays.toString(barr2));
			System.out.println(data2);
		}
		is2.close();
		
		//files /TestFileOut.txt
		//ABCD....Z
		File file2 = new File("C:\\Users\\kosmo\\eclipse-workspace\\javastudy\\src\\study17\\files\\TestFileOut.txt");
		FileOutputStream os2 = new FileOutputStream(file2);
		byte[] barr3 = new byte[26];
		byte dataS = 65;
		for(int i=0; i<barr3.length; i++) {
			barr3[i] = dataS++;
		}
		try {
			os2.write(barr3);
			for(int i=0; i<barr3.length; i++) {
				System.out.print((char)barr3[i]);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("완료");
		os2.close();
		
		
	}
	
}
