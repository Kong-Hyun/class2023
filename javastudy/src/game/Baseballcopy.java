package game;

import java.util.HashSet;
import java.util.Set;
import java.util.Random;
import java.util.Scanner;

public class Baseballcopy {
    public static void main(String[] args) throws Exception {
    	System.out.println("=========게임을 시작합니다=========");
    	while(true) {
	        Scanner scanner = new Scanner(System.in);
	        
	        /*
	        //난수 발생 시킨 후, 문자열로 만들기
	        //문제점 : 중복된 수가 나올 수 있다. 
	        int intVal=(int)(Math.random()*10000);
	        String randNum = Integer.toString(intVal);
	        */
	
	        // 겹치지 않는 난수를 만들고 싶으니까.
	        // 0~9까지 수를 만들고, 중복없게 설정 
	        String gameNumber = "";
	
	        Set<Integer> set = new HashSet<>();
	
	        while(true){
	            int number = (int)(Math.random()*10);
	            set.add(number);
	            if(set.size()==3){
	                for(int item : set){
	                    String numberStr = Integer.toString(item);
	                    gameNumber+=numberStr;
	                }
	                break;
	            }
	        } 
	        
	
	        int chance = 1 ;
	
	        // 기회는 열 번 
	        // S : 같은 자리에 수까지 같은 경우 
	        // B : 숫자가 같은 경우
	        // O : 하나도 같지 않은 경우
	
	        //System.out.println(gameNumber);
	
	        while(chance<11){
	
	            int strike = 0;
	            int ball = 0;
	            int out = 0;
	
	            if(chance == 10){
	                System.out.print("마지막 도전입니다! 3자리 숫자를 입력해주세요 :");
	            }else{
	                System.out.print(chance+ "번째 도전 ! 3자리 숫자를 입력해주세요 : ");
	            }
	
	            String answer = scanner.nextLine();
	
	            for(int i=0;i<3;i++){
	                if(gameNumber.charAt(i)==answer.charAt(i)){
	                    strike+=1;
	                }else{
	                    if(answer.indexOf(gameNumber.charAt(i))!=-1){
	                        ball+=1;
	                    }else{
	                        out+=1;
	                    }
	                }
	            }
	
	            if(strike==3){
	                System.out.println("정답입니다! 게임을 종료합니다!");
	                break;
	            }else{
	                System.out.println("Strike : "+strike+", Ball :"+ball+", Out: "+out);
	            }
	
	            if(chance == 10){
	                System.out.println("아쉽네요. 정답은 "+gameNumber+" 입니다!");
	            }
	
	            chance+=1;
	        }
	        System.out.println("한게임 더 하시겠습니까?(0:종료,1:재시작)");
			int restart = scanner.nextInt();
			if(restart==0) {
				//게임종료
				System.out.println("\n=========게임이 종료되었습니다=========\n");
				//실행되는 즉시 main함수가 종료된다.
				System.exit(0);
			}
			else if(restart==1){
				//게임을 재시작하기 위해 카운트변수 초기화
				System.out.printf("\n=========게임을 재시작합니다=========\n");
			}
    	}
        
    }
}