package class06;

public/*���� ������*/ class/*Ű����*/ Member/*Ŭ����*/ {

	 String name;
	 String id;
	 String password;
	 int age;
	
	Member (){
		
	}
	 Member (String name, String id){
		this.name=name;
		this.id = id;
	}
	 Member (String name, String password, int age){
		 
	 }
	 Member (String name, String id, String password, int age){
		 
	 }

	 static boolean login(String id, String password) {
		 if ("hong".equals(id) &&"12345".equals(password))
		 return true;
		 else
			 return false;
	 }
	 void logout (String id)	{
		 System.out.println("�α׾ƿ� �ƽ��ϴ�.");
	 }

}
