package chap11practice;


	class Member{
	String id; //String은 문자형이고 미리 정의되어있음. 그 속의 값을 비교하는겨.
				// int는 그럴 수 없지
	 Member(String id) {
		this.id = id;
	}
	 @Override
		public boolean equals(Object obj) {
			if(obj instanceof Member) {
				Member member = (Member)obj; //형변환 안해주면 null?????
				//String일 경우 오버라이딩 된 equals 를  호츌~ ♡
				if(id.equals(member.id)) 
					return true;
			}
			return false;
		}
}
public class MemberTest03 {
	public static void main(String[] args) {
		Member mem1 = new Member("12345"); //값이 같아도 주소가 다르면 다른 객체
		Member mem2 = new Member("12345");
		Member mem3 = new Member("67891");
	
		System.out.println(mem1);
		
		if(mem1.equals(mem2))
			System.out.println("mem1과 mem2는 같은 객체"+ "\n");
		else
			System.out.println("mem1과 mem2는 다른 객체" + "\n");
	
		if(mem2.equals(mem3))
			System.out.println("mem2과 mem3는 같은 객체");
		else
			System.out.println("mem2과 mem3는 다른 객체");
		
		String str = new String("java"); 
		String str2 = new String("java");
		
		System.out.println(str == str2); //같은 주소(해시코드??)를 가리키는가???
		System.out.println(str.equals(str2)); //객체에 들어있는 값이 같은가를 오버라이딩???
		//String 은 만ㄷㄹ어 놓은 클래스이고 거기에 override되어있는거라고??
	
	}

}
