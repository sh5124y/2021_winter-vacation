package test.access2;

import test.access1.AccessBase;

public class BBB {

   public void test() {
      AccessBase ab = new AccessBase();
      //System.out.println("n1(private) = "+ ab.n1); private �ʵ�� �ٸ� ��Ű������ ���� �Ұ���
      System.out.println("n2 (public) ="+ ab.n2); //public �ʵ�� �ٸ� ��Ű������ ���� ����
      //System.out.println("n2 (protectede) ="+ ab.n3); //protected �ٸ��� ���� ��Ű������ ������ ����
     // System.out.println("n2 (default) ="+ ab.n4); //default �ʵ�� ���� ��Ű������ ���� ����
   }
}