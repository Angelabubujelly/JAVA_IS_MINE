package chap11practice;

public class EqualsEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		System.out.println(v1);
		System.out.println(v2 + "\n");
		
		if (v1 == v2)	
			System.out.println("같은 객체");
		else
			System.out.println("다른 객체"); //객체가 2개잖여~
		//String에서는 equals를 오버라이딩 해 내용을 비교함
		//다른 객체에서는 내용 비교가 아니라 주소를 비교
		if (v1.equals(v2))	
			System.out.println("같은 내용");
		else
			System.out.println("다른 내용"); //객체가 2개잖여~
		
		System.out.println("♥♥♥♥");
	
	v2	= v1; //v1 의 주소를 v2에 넣어부럿으
	
	
	if (v1 == v2)	
		System.out.println("같은 객체");
	else
		System.out.println("다른 객체"); 
	if (v1.equals(v2))	
		System.out.println("같은 내용");
	else
		System.out.println("다른 내용"); 
	}

}


class Value {
	int value ;
	Value (int value) {
		this.value = value ; //필드에 인스턴스변수 넣기
	}
}