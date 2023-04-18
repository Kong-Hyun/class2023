package test01;

public class Exam05 
{
   public static void main(String[] args) 
   {
      Developer tom = new Developer("Tom", 5);
      Developer john = new Developer("John", 8);
      System.out.println(tom.getName() +"의 연봉은 "  + tom.salary() + "만원 입니다");
      System.out.println(john.getName() +"의 연봉은 "  + john.salary() + "만원 입니다");
      
      Corperation corp = new Corperation("Google");
      
      Developer james = new Developer("James", 1);
      System.out.println(james.getName() +"의 연봉은 "  + james.salary() + "만원 입니다");
      corp.addDeveloper(james);
      
      Developer kate = new Developer("Kate", 4);
      System.out.println(kate.getName() +"의 연봉은 "  + kate.salary() + "만원 입니다");
      corp.addDeveloper(kate);

      Developer paul = new Developer("Paul", 10);
      System.out.println(paul.getName() +"의 연봉은 "  + paul.salary() + "만원 입니다");
      corp.addDeveloper(paul);
      
      System.out.println("총 연봉은 : " + corp.salaryExpen() + "만원 입니다");

   }

}