package chap11practice;

class SmartPhone	{
	private String company;
	private String os;
	
	SmartPhone(String company, String os){
		this.company =company;
		this.os=os;
		
	}
	
	@Override
	public String toString() {
	
		return company + ":" + os;
	}
}

public class SmartPhonEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SmartPhone sp = new SmartPhone("구글", "안드로이드");
	System.out.println(sp); //override 안 해서 해시코드인 chap11.SmartPhone@4926097b 출력
	
	//@Override 하니꽈 return 값으로 잘 나옴..
	
	
	
	}

}
