package test.access1;

public class AAA {

   public void test(){
      AccessBase ab = new AccessBase();
      //System.out.println("n1(private) = "+ ab.n1); private �ʵ�� ���� �Ұ���
      System.out.println("n2 (public) ="+ ab.n2); //public �ʵ�� ���� ��Ű������ ���� ����
      System.out.println("n2 (protectede) ="+ ab.n3); //protected �ʵ�� ���� ��Ű������ ���� ����
      System.out.println("n2 (default) ="+ ab.n4); //default �ʵ�� ���� ��Ű������ ���� ����
      
   }

}