package test01;

import java.util.ArrayList;
public class Corperation {
      
      //필드
      String corName;
      ArrayList<Developer> devs = new  ArrayList<>(); // 배열 그자체 -> 개발자들 정보
      
      //생성자
      public Corperation(String corName)
      {
         this.corName = corName;
      }
      
      //메서드
      public int salaryExpen()
      {
         int Expen = 0;
         for(int i=0; i < devs.size(); i++)
         {
            //devs에서 get를 사용하는 이유가 몇번째인지 모르니까 
            Expen += devs.get(i).salary();
            System.out.println(corName + "직원 추가, 연봉 추가됨");
         }
         
         //향상된 for문 방식 -> 존나 짤아서 쉬움
         /*for(Developer dev : devs)
         {
            Expen += dev.salary();
            System.out.println(corName + "직원 추가, 연봉 추가됨");
               
         }*/
            
         return Expen;
      }
      
      //devs가 아닌 이유 -> dev(developer 축약)는 개발자 / devs는 개발자들 정보
      public void addDeveloper(Developer dev)
      {
         devs.add(dev);
      }
         
}