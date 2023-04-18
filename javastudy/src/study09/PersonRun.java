package study09;

class People {
	String name;
	public void setName(String name) {
		this.name = name;
	}
	public void showInfo() {
		System.out.println(name + "사람");
	}
	public void eatFood() {
		System.out.println(name + "음식을 먹습니다.");
	}
}

class Male extends People{
	@Override
	public void showInfo() {
		//super.showInfo(); 부모 클래스인 People에 있는 showInfo를 그대로 사용 
		System.out.println(name + "남자");
	}
}

class Female extends People{
	@Override
	public void showInfo() {
	    //super.showInfo(); 부모 클래스인 People에 있는 showInfo를 그대로 사용 
		System.out.println(name + "여자");
	}
}

	
public class PersonRun {
	
	//출력 전용 메서드
	public static void whoAreYou(People p) {
		p.setName("선미");
		p.showInfo();
	}	

	public static void main(String[] args) {
		Male m = new Male();
		Female f = new Female();
		m.showInfo();
		f.showInfo();
		
		//업캐스팅
		People pp = new Male();
		pp.showInfo();
		pp = new Female(); //기존에 가지고있던 Male의 instance는 삭제
		pp.showInfo();
		pp.eatFood();
		
		//instanceOf
		if(pp instanceof Female) {
			System.out.println("Female instance");
		}
		if(pp instanceof Male) {
			System.out.println("Male instance");
		}
		if(pp instanceof People) {
			System.out.println("People instance");
		}
		if(pp instanceof Object) {
			System.out.println("Object instance"+"\n");
		}
		
		People p = new People();
		People pm = new Male();
		People pf = new Female();
		p.showInfo();
		pm.showInfo();
		pf.showInfo();
		
		People[] pArr = new People[3];
		pArr[0] = new People();
		pArr[1] = new Male();
		pArr[2] = new Female();
		for(int i=0;i<pArr.length;i++)	{
			pArr[i].showInfo();
		}
		whoAreYou(p);
		whoAreYou(pf);
		whoAreYou(pm);
		
		//다운캐스팅
		People p2 = new Male();
		p2.showInfo();
		Male m2 = (Male)p2;
		m2.showInfo();
		/* 다운캐스팅 불가
		Male m3 = (Male)new People();
		m3.showInfo();
		*/
		//Female f2 = (Female)new Book(); 상속관계가 전혀없기때문에 형변환 불가능 
		
		
		
		
		
	}
	

}
