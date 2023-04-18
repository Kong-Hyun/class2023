package test01;

public class Developer 
{
   //필드
   private String name;
   private int career;
   
   //생성자 -> 기본 생성자는 자동적으로 할당됨 따라서 만들 필요 없음
   Developer(String name, int career)
   {
      this.name = name;
      this.career = career;
   }
   
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getCareer() {
      return career;
   }

   public void setCareer(int career) {
      this.career = career;
   }

   //메서드
   public String level()
   {
      String levelName;
      
      if(career > 7)
      {
         levelName = "고급";
      }
      else if(career > 3)
      {
         levelName = "중급";
      }
      else
      {
         levelName = "초급";
      }
      
      return levelName;
   }
   
   public int salary()
   {
      int salary;
      
      if(career > 7)
      {
         salary = 4500 + 100*(career - 7);
      }
      else if(career > 3)
      {
         salary = 3500 + 100*(career - 3);   
      }
      else
      {   
         salary = 2800 + 100*career;
      }
      return salary;
   }
   
}