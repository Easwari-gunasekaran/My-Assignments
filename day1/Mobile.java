package week1.day1;

public class Mobile {
	
public void makeCall(long num) {
	System.out.println("makeCall to:  " +num);
}
public void sendMsg(String Message) {
	System.out.println("sendMsg:  " +Message);
}
	public static void main(String[] args) {
				Mobile samsung = new Mobile();
				samsung.makeCall(98765412384l);
				samsung.sendMsg("Hello");
		

	}

}
