package chap11practice;

public class HashcodeEx04 {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
//		String str3 = "abc";
//		String str4 = "abc";
//		System.out.println(str1 == str3);
//		System.out.println(str3 ==str4);
		
	
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		//논리적으로 같은가?
		System.out.println(str1 == str2);
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	    
	
	}

}
