package project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ChildMain {
	
	public static void main(String[] args) {
		//시작 메뉴 문구 출력, 선택 문구 출력
		//1. 아동 정보 등록하기(아동이름, 주민등록번호, 부모님 이름, 부모님 연락처 4가지 등록)
		//주민등록번호가 -를 포함한 13자리가 아니가 아니라면 재입력하라는 안내문구 추가 후 재입력 실행
		//입력된 정보를 출력후 모두 맞는지 확인문구 (Y/N)
		//맞으면 정보 등록. 맨 처음 메뉴로 돌아가기 틀리면 정보 입력단계로 다시 돌아감
		ArrayList<Child> childlist = new ArrayList<>();
		childlist.add(new Child("공현", "080111-3111111", "공", "010-1111-1111"));
		childlist.add(new Child("박호진", "090111-3111111", "박", "010-2222-2222"));
		childlist.add(new Child("김효진", "090112-4111111", "김", "010-2222-2222"));
		childlist.add(new Child("이재민", "090211-3111112", "이", "010-2222-2222"));
		childlist.add(new Child("김상협", "100111-3111111", "김", "010-3333-3333"));
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("=== 아동 관리 프로그램 ===");
			System.out.println("1. 아동 정보 등록하기");
			System.out.println("2. 아동 정보 검색하기");
			System.out.println("3. 아동 정보 수정하기");
			System.out.println("4. 아동 정보 삭제하기");
			System.out.println("5. 전체 아동 정보 출력하기");
			System.out.println("6. 프로그램 종료");
			System.out.println("=====================");
			
			System.out.print("메뉴 번호 입력 >> ");
			String menu = sc.next();
			sc.nextLine();
			//입력값이 숫자가 아닐시 오류가 나는것을 예외처리로 처리해야함
			
			if (menu.equals("1")) {
				System.out.println();
				System.out.println("=== 아동 정보 등록 ===");
				System.out.print("아동 이름 : ");
				String name = sc.nextLine();
				System.out.print("주민등록번호( - 포함) : ");
				String id = sc.nextLine();
				while (id.length() != 14 || !id.matches("\\d{6}-\\d{7}")) {
					System.out.println("올바른 주민등록번호를 입력하세요.");
					System.out.print("주민등록번호( - 포함) : ");
					id = sc.nextLine();
				}
				System.out.print("부모님 이름 : ");
				String parentName = sc.nextLine();
				System.out.print("부모님 연락처 : ");
				String phone = sc.nextLine();
				while(true) {
					System.out.println();
					System.out.println("=== 아동 정보 확인 ===");
					System.out.println("아동 이름 : " + name + " | 주민등록번호 : " + id + " | 부모님 이름 : " + parentName + " | 연락처 : " + phone);
					System.out.print("등록하시겠습니까?(Y/N)");
					String confirm = sc.nextLine();
					if (confirm.equalsIgnoreCase("Y")) {
						childlist.add(new Child(name, id, parentName, phone));
						System.out.println("등록이 완료되었습니다.");
						System.out.println();
						break;
					}else if(confirm.equalsIgnoreCase("N")) {
						System.out.println("등록이 취소되었습니다.");
						System.out.println();
						break;
					}else {
						System.out.println("잘못된 입력입니다. 다시 입력해주세요");
					}
				}
				
			//2. 아동 정보 검색하기
			//2-1. 무엇으로 아동정보를 검색할 것 인지 출력후 선택문구.
			//1. 아동이름 2. 아동 주민등록번호 3. 부모님 이름 4. 부모님 연락처
			//해당하는 아동 명단 모두 출력 후 시작으로 돌아가기
			}else if(menu.equals("2")) {
				System.out.println();
				System.out.println("=== 아동 정보 검색하기 ===");
				while(true) {
					System.out.println("아동 검색 기준을 입력하세요.");
					System.out.println("1. 아동 이름 | 2. 주민등록번호 | 3. 부모님 이름 | 4. 연락처 | 5. 처음으로 돌아가기");
					System.out.print("메뉴 번호 입력 >> ");
					int searchNum = sc.nextInt();
					sc.nextLine();
					boolean found = false;
					if (searchNum == 1) {
						System.out.println("아동 이름을 입력하세요.");
						String searchName = sc.nextLine();
						System.out.println();
						System.out.println("===== 검색 결과 =====");
						for (Child child : childlist) {
							if(child.getName().equals(searchName)) {
								System.out.println("이름 : " + child.getName() + " | 주민등록번호 : " + child.getId() + " | 부모님 이름 : " + child.getParentName() + " | 연락처 : " + child.getPhone());
								System.out.println();
								found = true;
							}
						}
						if (!found) {
							System.out.println("아동 이름 검색 결과가 없습니다.");
							System.out.println();
						}
					}else if(searchNum == 2) {
						System.out.println("주민등록번호( - 포함)를 입력하세요.");
						String searchId = sc.nextLine();
						while (searchId.length() != 14 || !searchId.matches("\\d{6}-\\d{7}")) {
							System.out.println("올바른 주민등록번호를 입력하세요.");
							System.out.print("주민등록번호( - 포함) : ");
							searchId = sc.nextLine();
						}
						System.out.println();
						System.out.println("===== 검색 결과 =====");
						for (Child child : childlist) {
							if(child.getId().equals(searchId)) {
								System.out.println("이름 : " + child.getName() + " | 주민등록번호 : " + child.getId() + " | 부모님 이름 : " + child.getParentName() + " | 연락처 : " + child.getPhone());
								System.out.println();
								found = true;
							}
						}
						if (!found) {
							System.out.println("주민등록번호 검색 결과가 없습니다.");
							System.out.println();
						}
					}else if(searchNum == 3) {
						System.out.println("부모님 이름을 입력하세요.");
						String searchparentName = sc.nextLine();
						System.out.println();
						System.out.println("===== 검색 결과 =====");
						for (Child child : childlist) {
							if(child.getParentName().equals(searchparentName)) {
								System.out.println("이름 : " + child.getName() + " | 주민등록번호 : " + child.getId() + " | 부모님 이름 : " + child.getParentName() + " | 연락처 : " + child.getPhone());
								System.out.println();
								found = true;
							}
						}
						if (!found) {
							System.out.println("부모님 이름 검색 결과가 없습니다.");
							System.out.println();
						}
					}else if(searchNum == 4) {
						System.out.print("연락처를 입력하세요.");
						String searchPhone = sc.nextLine();
						System.out.println();
						System.out.println("===== 검색 결과 =====");
						for (Child child : childlist) {
							if(child.getPhone().equals(searchPhone)) {
								System.out.println("이름 : " + child.getName() + " | 주민등록번호 : " + child.getId() + " | 부모님 이름 : " + child.getParentName() + " | 연락처 : " + child.getPhone());
								System.out.println();
								found = true;
							}
						}
						if (!found) {
							System.out.println("연락처 검색 결과가 없습니다.");
							System.out.println();
						}
					}else if(searchNum == 5) {
						System.out.println("처음 메뉴로 돌아갑니다.");
						System.out.println();
						break;
					}else {
						System.out.println("올바른 값을 입력해주세요.");
						System.out.println();
					}
				}
				
			//3. 아동 정보 수정하기
			//수정하고 싶은 아동 검색하기. 2번과 같은 방법으로 검색 후 해당 아동 찾기
			//아동이 맞는지 확인문구 출력(Y/N)
			//아동의 정보중 어떤 정보를 변경할건지 묻기
			//1. 아동이름 2. 아동 주민등록번호 3. 부모님 이름 4. 부모님 연락처
			//변경할 정보를 입력하기
			//아동의 정보가 수정되었다는 문구 출력 후 시작으로 돌아가기
			}else if(menu.equals("3")) {
				System.out.println();
				System.out.println("=== 아동 정보 수정하기 ===");
				System.out.println("수정을 원하는 아동 주민등록번호( - 포함)를 입력하세요.");
				String searchId = sc.nextLine();
				while (searchId.length() != 14 || !searchId.matches("\\d{6}-\\d{7}")) {
					System.out.println("올바른 주민등록번호를 입력하세요.");
					System.out.print("주민등록번호( - 포함) : ");
					searchId = sc.nextLine();
				}
				for (Child child : childlist) {
					if (child.getId().equals(searchId)) {
						System.out.println("이름 : " + child.getName() + " | 주민등록번호 : " + child.getId() + " | 부모님 이름 : " + child.getParentName() + " | 연락처 : " + child.getPhone());
						System.out.println("이 아동이 맞습니까?(Y/N)");
						String confirm = sc.nextLine();
						if (confirm.equalsIgnoreCase("Y")) {
							System.out.println();
							System.out.println("수정할 정보를 선택하세요");
							System.out.println("1. 아동 이름 | 2. 주민등록번호 | 3. 부모님 이름 | 4. 연락처 | 5. 처음으로 돌아가기");
							int answer = sc.nextInt();
							sc.nextLine();
							if(answer == 1) {
								System.out.println("수정할 이름을 입력해주세요.");
								String edit = sc.nextLine();
								child.setName(edit);
								System.out.println("이름이 변경되었습니다.");
								System.out.println();
							}else if(answer == 2) {
								System.out.println("수정할 주민등록번호를 입력해주세요.");
								String edit = sc.nextLine();
								while (edit.length() != 14 || !edit.matches("\\d{6}-\\d{7}")) {
									System.out.println("올바른 주민등록번호를 입력하세요.");
									System.out.print("주민등록번호( - 포함) : ");
									edit = sc.nextLine();
								}
								child.setId(edit);
								System.out.println("주민등록번호가 변경되었습니다.");
								System.out.println();
							}else if(answer == 3) {
								System.out.println("수정할 부모님 이름을 입력해주세요");
								String edit = sc.nextLine();
								child.setParentName(edit);
								System.out.println("부모님 이름이 변경되었습니다.");
								System.out.println();
							}else if(answer == 4) {
								System.out.println("수정할 연락처를 입력해주세요");
								String edit = sc.nextLine();
								child.setPhone(edit);
								System.out.println("연락처가 변경되었습니다.");
								System.out.println();
							}
						}
					}
				}
			//4. 아동 정보 삭제하기
			//삭제할 아동 정보 검색하기 2번과 같은 방법으로 검색
			//아동이 맞는지 확인문구 출력(Y/N)
			//아동의 정보를 정말 삭제할것인지 확인문구 출력(Y/N)
			//아동의 정보가 삭제되었다는 문구 출력 후 시작으로 돌아가기
			}else if(menu.equals("4")) {
				System.out.println();
				System.out.println("=== 아동 정보 삭제하기 ===");
				System.out.println("삭제를 원하는 아동 주민등록번호( - 포함)를 입력하세요.");
				String searchId = sc.nextLine();
				while (searchId.length() != 14 || !searchId.matches("\\d{6}-\\d{7}")) {
					System.out.println("올바른 주민등록번호를 입력하세요.");
					System.out.print("주민등록번호( - 포함) : ");
					searchId = sc.nextLine();
				}
				for (Child child : childlist) {
					if (child.getId().equals(searchId)) {
						System.out.println("이름 : " + child.getName() + " | 주민등록번호 : " + child.getId() + " | 부모님 이름 : " + child.getParentName() + " | 연락처 : " + child.getPhone());
						System.out.println("이 아동이 맞습니까?(Y/N)");
						String confirm = sc.nextLine();
						if (confirm.equalsIgnoreCase("Y")) {
							System.out.println("아동의 정보가 삭제되었습니다.");
							System.out.println();
							childlist.remove(child);
							break;
						}
					}
				}
			//5. 저장된 전체 아동 정보 출력하기
			//주민등록 연도가 가장 빠른 아동 오름차순으로 출력 후 다음 연도 출생아동 정렬후 출력 반복 
			}else if(menu.equals("5")) {
				System.out.println();
				System.out.println("========== 전체 아동 정보 출력 ==========");
				Collections.sort(childlist, Comparator.comparing(Child::getId));
				for (Child child : childlist) {
					System.out.println("이름 : " + child.getName() + " | 주민등록번호 : " + child.getId() + " | 부모님 이름 : " + child.getParentName() + " | 연락처 : " + child.getPhone());
				}
				System.out.println();
				//등록된 아동이 없을시 아동이 없다는 문구 출력 기능 넣어야함
			//6. 프로그램 종료
			}else if(menu.equals("6")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("올바른 번호를 입력해주세요.");
				System.out.println();
			}
			
		}
		
	}
	
}
