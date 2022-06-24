package chap11practice;
class Person {
	int id;
	Person (int ind){
		this.id = id;
	}
	 @Override
	 public boolean equals(Object obj) {
		 if (obj !=null &&obj instanceof Person) {
			 Person person = (Person)obj;
			 return id == person.id;
		 }
		 return false;
	 }
}
public class EqualsEx02 {

	public static void main(String[] args) {
	

		
	}

}
