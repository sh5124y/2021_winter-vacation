package test.access1;

public class AAA {

   public void test(){
      AccessBase ab = new AccessBase();
      //System.out.println("n1(private) = "+ ab.n1); private 필드는 접근 불가능
      System.out.println("n2 (public) ="+ ab.n2); //public 필드는 같은 패키지에서 접근 가능
      System.out.println("n2 (protectede) ="+ ab.n3); //protected 필드는 같은 패키지에서 접근 가능
      System.out.println("n2 (default) ="+ ab.n4); //default 필드는 같은 패키지에서 접근 가능
      
   }

}