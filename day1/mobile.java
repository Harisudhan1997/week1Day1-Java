package week1.day1;

public class mobile {

	public void makecall() {
		String mobileModel ="ViVo";
	     float mobileWeight=17.8f;
		System.out.println("Making Call");
	}
	private void Sendms() {
		boolean isFullcharged;
		int mobilecost=25000;
		System.out.println("Sending Message");

	}
	public static void main(String[] args) {
		mobile obj=new mobile();
		obj.sendmsg();
		obj.Makecall();
		System.out.println("This is my mobile");
		
	}
}
	