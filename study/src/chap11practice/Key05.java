package chap11practice;
import java.util.*;
class Key{
	int number;
	Key(int number) { //사용자로부터 number 값을 받겠슈
		this.number = number;
	}
	@Override
	public int hashCode() {
	return number;
}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Key) {
			Key key = (Key)obj;
			if(this.number == key.number)
				return true;
		} 
		return false;
	}
}

public class Key05 {

	public static void main(String[] args) {
		HashMap<Key, String>hashmap = new HashMap<Key, String>();
		//사용자가 원하는 자료형을 <>에 넣어줭. Key의 객체를 받겠다는겨.
		//Key의 객체, String으로?

		hashmap.put(new Key(1), "홍길동");
		
		String value = hashmap.get(new Key(1));
		System.out.println(value);
		
	}

}
