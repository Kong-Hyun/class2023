package test01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

class Calculator {
	int value;
	Calculator() {
		this.value = 0;
	}
	void add(int val) {
		this.value += val;
	}
	int getValue() {
		return value;
	}
	//void minus(int val) {}
	boolean isEven(int val) {
		return val%2 == 1 || val == 0;
	}
		/*if(val%2 == 1 || val == 0) {
			return false;
		}
		return true;
	}
	*/
	double sum;
	double avg(int[] val) {
		for(int i=0;i<val.length;i++) {
			sum += val[i]; 
		}return sum/val.length;
	}
	double avg(ArrayList<Integer> val){
		double sum = 0;
		for(int i=0;i<val.size();i++) {
			sum += val.get(i); 
		} return sum/val.size();
	}
		
}
class UpgradeCalculator extends Calculator {
	void minus(int val) {
		this.value -= val;
	}
}
class MaxLimitCalculator extends Calculator {
	
	int limit;
	
	MaxLimitCalculator(int limit){
		this.limit = limit;
	}
	void add(int val) {
		this.value += val;
		if(this.value > limit) {
			value = limit;
		}
	}
}

public class Exam08 {
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.add(10);
		System.out.println(cal.getValue());
		UpgradeCalculator cal2 = new UpgradeCalculator();
		cal2.add(10);
		cal2.minus(7);
		System.out.println(cal2.getValue());
		
		Calculator cal0 = new UpgradeCalculator();
		cal0.add(10);
		//cal0.minus(7);
		System.out.println(cal0.getValue());
		
		MaxLimitCalculator cal3 = new MaxLimitCalculator(100);
		cal3.add(50);
		cal3.add(60);
		System.out.println(cal3.getValue());//100
		
		
		Calculator cal4 = new Calculator();
		System.out.println(cal4.isEven(3)); //짝수여부 판단 false
		System.out.println(cal4.isEven(4)); //짝수여부 판단 true
		System.out.println(cal4.isEven(0)); //짝수여부 판단 false
		
		
		Calculator cal5 = new Calculator();
		
		int[] data1 = {1, 3, 5, 7, 9,17};
		System.out.println(cal5.avg(data1));
		System.out.println((int)Math.round(cal5.avg(data1)));
		
		ArrayList<Integer> date2 = new ArrayList(Arrays.asList(1,3,5,7,9));
		System.out.println(cal5.avg(date2));
		
	}

}
