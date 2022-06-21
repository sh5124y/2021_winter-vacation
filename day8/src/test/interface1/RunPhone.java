package test.interface1;

public class RunPhone {

	public static void main(String[] args) {
		S21 s = new S21();
		s.sendCall("010-2222-3333");
		s.sendSMS("010-3333-5555");
		s.receiveSMS("010-5555-7777");
		
		String music = s.searchMusic("XOXO");
		s.playMusic(music);
		s.stopMusic();
		
		s.installApp("GDrive");
		s.runApp("Youtube");

	}

}