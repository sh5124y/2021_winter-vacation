package test.interface1;

public class S21 implements SmartPhone {

	@Override
	public void sendCall(String phoneNumber) {
		System.out.println(phoneNumber + "�� ��ȭ�� �Ǵ�");

	}

	@Override
	public void receiveCall(String phoneNumber) {
		System.out.println(phoneNumber + "���� ��ȭ�� �޴´�");

	}

	@Override
	public void sendSMS(String phoneNumber) {
		System.out.println(phoneNumber + "�� ���ڸ� ������.");

	}

	@Override
	public void receiveSMS(String phoneNumber) {
		System.out.println(phoneNumber + "���� �� ���ڸ� �޴´�.");

	}

	@Override
	public String searchMusic(String word) {
		System.out.println("������ �˻��Ѵ�.");
		return word + "_music.mp3";
	}

	@Override
	public void playMusic(String music) {
		System.out.println(music + " ������ ����ȴ�.");

	}

	@Override
	public void stopMusic() {
		System.out.println("������� ������ �����Ѵ�.");

	}

	@Override
	public void installApp(String appName) {
		System.out.println(appName+" ���� �ν����Ѵ�.");

	}

	@Override
	public void runApp(String appName) {
		System.out.println(appName+" ���� �����Ѵ�.");

	}

}