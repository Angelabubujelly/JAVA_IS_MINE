package chap11practice;

public class EqualsEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		System.out.println(v1);
		System.out.println(v2 + "\n");
		
		if (v1 == v2)	
			System.out.println("���� ��ü");
		else
			System.out.println("�ٸ� ��ü"); //��ü�� 2���ݿ�~
		//String������ equals�� �������̵� �� ������ ����
		//�ٸ� ��ü������ ���� �񱳰� �ƴ϶� �ּҸ� ��
		if (v1.equals(v2))	
			System.out.println("���� ����");
		else
			System.out.println("�ٸ� ����"); //��ü�� 2���ݿ�~
		
		System.out.println("��������");
	
	v2	= v1; //v1 �� �ּҸ� v2�� �־�η���
	
	
	if (v1 == v2)	
		System.out.println("���� ��ü");
	else
		System.out.println("�ٸ� ��ü"); 
	if (v1.equals(v2))	
		System.out.println("���� ����");
	else
		System.out.println("�ٸ� ����"); 
	}

}


class Value {
	int value ;
	Value (int value) {
		this.value = value ; //�ʵ忡 �ν��Ͻ����� �ֱ�
	}
}