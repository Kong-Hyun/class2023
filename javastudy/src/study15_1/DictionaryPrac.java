package study15_1;

import java.util.Scanner;
import java.util.TreeMap;

class Dictionary {
	private TreeMap<String, String> dic;
	public Dictionary() {
		dic = new TreeMap<String, String>();
	}
	public void addWord(String eng, String kor) {
		dic.put(eng, kor);
	}
	public void delWord(String eng) {
		dic.remove(eng);
	}
		
	public String translate(String eng) {
		return dic.get(eng);
	}
	public TreeMap<String, String> getDic() {
		return dic;
	}
	public void setDic(TreeMap<String, String> dic) {
		this.dic = dic;
	}
}


public class DictionaryPrac {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Dictionary dic = new Dictionary();
		dic.addWord("baby", "아기");
		dic.addWord("love", "아기");
		dic.addWord("apple", "사과");
		
		System.out.println("=====영한사전=====");
		while(true) {
			System.out.print("찾는 영단어 : ");
			String input = scan.next();
			if(input.equals("그만")) {
				System.out.println("종료");
				break;
			}
			String output = dic.translate(input);
			
			if(output==null) {
				System.out.println("사전에 없는 단어입니다.");
				System.out.println("사전에 추가하시겠습니까?(Y/N)");
				String ans = scan.next().toUpperCase();
				if(ans.equals("Y")) {
					System.out.println("단어 : " + input);
					System.out.print("의미 : ");
					String kor = scan.next();
					dic.addWord(input, kor);
				}else {
					System.out.println("의미 : " + output);
				}
			}
			else {
				System.out.println("의미 : "+output);               
				}
			
		}
	}
	
}
