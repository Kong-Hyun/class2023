package study15_1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

class PersonInfo {
	private String name;
	private String address;
	public PersonInfo(String name, String address) {
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
class PersonInfoList {
	private HashMap<String, PersonInfo> pList;
	PersonInfoList() {
		pList = new HashMap<String, PersonInfo>();
	}
	void addPersonInfo(String name, String telNum, String address) {
		PersonInfo pInfo = new PersonInfo(name, address);
		pList.put(telNum, pInfo);
	}
	public ArrayList<String> getPersonInfoWithName(String name) {
		//부분값 입력시 동일한 글자가 있는경우 모두 출력
		ArrayList<String> results = new ArrayList<>();
		Set<String> keySet = pList.keySet();
		Iterator<String> keys = keySet.iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			PersonInfo pInfo = pList.get(key);
			if(pInfo.getName().contains(name)) {
				results.add("||이름 : " + pInfo.getName() + "||전화번호 : "+ key + "||주소 : " + pInfo.getAddress() + "||");
			}
		}
		if(results.size()==0) {
			results.add("해당 검색 대상이 없습니다.");
		}
		return results;
		
		
		
		
		//전체 값 입력시 일치해야지만 결과값 출력
//		Set<Entry<String, PersonInfo>> entrySet = pList.entrySet();
//		Iterator<Entry<String, PersonInfo>> entry = entrySet.iterator();
//		while(entry.hasNext()) {
//			Entry<String, PersonInfo> en = entry.next();
//			PersonInfo pInfo = en.getValue();
//			if(pInfo.getName().contains(name)) {
//				String eName = pInfo.getName();
//				String eTel = en.getKey();
//				String eAddr = en.getValue().getAddress();
//				return "||이름 : " + eName + "||전화번호 : "+ eTel + "||주소 : " + eAddr + "||";
//			}
//		}
//		return "해당 검색 대상이 없습니다.";
		
		
	}
	public ArrayList<String> getPersonInfoWithTel(String telNum) {
		//부분값 입력시 동일한 번호가 있는경우 모두 출력(클래스 이름을 스트링에서 퍼블릭, 어레이리스트로 바꿔야함)
		ArrayList<String> results = new ArrayList<>();
		Set<String> keySet = pList.keySet();
		Iterator<String> keys = keySet.iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			if(key.contains(telNum) ) {
				PersonInfo pInfo = pList.get(key);
				results.add( "||이름 : "+pInfo.getName() + "||전화번호 : " + key + "||주소 : " + pInfo.getAddress() + "||");
			}
		}
		if(results.size()==0) {
			results.add("해당 검색 대상이 없습니다.");
		}
		return results;
		
		
		
		//전체 값 입력시 일치해야지만 결과값 출력
//		if(pList.containsKey(telNum)) {
//			PersonInfo pInfo = pList.get(telNum);
//			return "||이름 : "+pInfo.getName() + "||전화번호 : " + telNum + "||주소 : " + pInfo.getAddress() + "||";
//		}else {
//			return "해당 검색 대상이 없습니다.";
//		}
	}
	public HashMap<String, PersonInfo> getpList() {
		return pList;
	}
	public void setpList(HashMap<String, PersonInfo> pList) {
		this.pList = pList;
	}
	
}


public class HashMapPrac {

	public static void main(String[] args) {
		PersonInfoList pList = new PersonInfoList();
		pList.addPersonInfo("인순이", "010-1111-1111", "서울");
		pList.addPersonInfo("권보아", "010-2222-2222", "대전");
		pList.addPersonInfo("이보람", "010-3333-3333", "대구");
		pList.addPersonInfo("박호진", "010-4444-4444", "평양");
		pList.addPersonInfo("김상협", "010-5555-5555", "개성공단");
		pList.addPersonInfo("김효진", "010-6666-6666", "남포");
		
		Scanner scan = new Scanner(System.in);
		//for(PersonInfo value : pList.getpList().values()) {
		//	System.out.println(value.getName());
		//}
		System.out.println("<<전화번호 검색>>");
		while(true) {
			List<String> result = new ArrayList<>();
			System.out.println("조회대상 선택\n1.이름\n2.전화번호\n3.종료");
			System.out.print("선택 : ");
			int menu = scan.nextInt();
			if(menu==1) {
				System.out.print("<검색>\n이름 : ");
				String search = scan.next();
				result = pList.getPersonInfoWithName(search);
			}else if(menu==2) {
				System.out.print("<검색>\n전화번호 : ");
				String search = scan.next();
				result = pList.getPersonInfoWithTel(search);
			}else if(menu==3){
				System.out.println("검색 시스템을 종료합니다.");
				break;
			}else {
				System.out.println("잘못된 입력입니다.");
			}
			for(String res:result)
				System.out.println(res);
		}
		
	}
	
}
