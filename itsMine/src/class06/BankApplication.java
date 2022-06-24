package class06;

import java.util.Scanner;

public class BankApplication {
	
	//�� ���� ������ �ö���°��� Ŭ������ �ö�ɴϴ�...

	
		private static final Account[] accountArray = new Account[100];
		private static Scanner scanner = new Scanner(System.in);
		
		public static void main(String[] args) {
			boolean run = true;
			while(run) {
				System.out.println("-------------------------------------");
				System.out.println("1.���»��� | 2.���¸��|3.����|4.���|5.����");
				System.out.println("-------------------------------------");
			System.out.println("����> ");
			
			
			int selectNo = scanner.nextInt();
			
			if(selectNo ==1) {
				createAccount(); //�޼ҵ带 ȣ��... �޼ҵ� ȣ���� ������ ���ϴ�.... createAccount��...
			} else if (selectNo == 2 ) {
				accountList();
			} else if (selectNo ==3) {
				deposit();
			} else if (selectNo ==4) {
				withdraw();
			} else if (selectNo ==5) {
				run = false;
			}
			}
		System.out.println("���α׷� ����.");
		
		}
		private static void createAccount() {
			System.out.println("-----");
			System.out.println("���»���");
			System.out.println("-----");
			System.out.println("���¹�ȣ");
			String ano = scanner.next(); //�޾Ƽ� ano�� ����...
			System.out.println("������");
			String owner = scanner.next(); //���
			System.out.println("�ʱ� �Աݾ�: ");
			int balance = scanner.nextInt()	; //���.
			
			Account account = new Account(ano,owner,balance); 
			
//Account��� ���¸� �����ҰԿ�...��ü�� �����ҰԿ� Account�� ����
// ù����� ���·� �����ϸ� �� ���� �ö󰡼� 0..1..2.. �̷��� 100���� �� �� ����. 
//ù���� ����� accountArray[0] ��ü�� �����... {��ü�´����� �Ӹ�;}
//�׸��� �迭�� �ε��� ��ȣ 0�� i�� �ִ°�... �ٵ� 0���� null�� ����־�. �ֳĹ� �ʱⰪ�� null�̾�.
// ���� accountArray�� �ν��Ͻ� ������ static�� �پ class������ ��. ���� ���� �� ������ �ڵ����� �ʱⰪ�� ��.
// Account��ü�� ��������. 0���� 1���� 2���� �� null(�������)��. ��ü�� ��� �ּҰ� ���°� 100���� ������.
//�ؿ� scanner�� Ŭ���� ������. ��ĳ�ʵ� null�� �������. 
			
			for (int i = 0; i<accountArray.length; i++) {
				if(accountArray[i] == null ) { 
					// null�̸�! account�� �����ϴ°�. ����
					accountArray[i] = account;
			System.out.println("���: ���°� �����Ǿ����ϴ�.");
			break; //for �ݺ����� ���������Ŷ�...
				}
			}	
/* [0] = 1000
 * [2] = 2000
 * [3] = 3000
 * ...
 * [99] =4000
 * [100]= null
 * �̷����̴ϱ� null����ִ� �ֵ��� for�ݺ��� ������, ���� �ִ� �ָ� account �����ϴ°���.
 * ��ü �ϳ��� �ѻ��... �� �ѻ��... ���� ����� �� ���... */
			
			}
		
/*�����¸���� accountArray�� �ε��� ��ȣ [0]������ ���ϴ�~
[0] = 100 ��� ������ ����ְ�
sysout�� ��¹����� ������...
[1] = 200��� ������ ����ְ�
sysout�� ��¹����� ������...
[2] = 300�̶�� ������ ����ְ�
sysout�� ��¹����� ������...
[3] = null �̹�.. break�¾Ƽ� �� for���� ���������ϴ�!

�ᱹ Array.length ��ŭ ���� ��ϵ��� ��µ˴ϴ�.
*/
		private static void accountList() {
			System.out.println("-----");
			System.out.println("���¸��");
			System.out.println("-----");
			for (int i = 0; i<accountArray.length; i++) {
				if (accountArray[i] == null) {	//�̰� �ո��̿�
					break;
				}
				System.out.println(accountArray[i].getAno() + "\t" + accountArray[i].getOwner() + "\t" + accountArray[i].getBalance());
			}			
		}	
/*���°� �����Ǿ� �־�߸� ����� �� �־��.
 
 *
 */
		private static void deposit() {
				System.out.println("-----");
				System.out.println("����");
				System.out.println("-----");
				
				System.out.println("���¹�ȣ");
				String ano = scanner.next();
				System.out.println("�Աݾ�: ");
				int balance = scanner.nextInt();
//�޼ҵ� findAccount�� ���� ano�� �ִ��� Ȯ���Ͻÿ���� �� ��
//������ �������� ���Ŷ��.
			Account account = findAccount(ano);	
			
			if(account == null) {
// ���� ������ ���� ���ٰ� ������ְ�
				System.out.println("���°� �����ϴ�.");
				 return;
			}
//�����ϴ� ���¸� ���� �����ְ� �������ֱ�..(����ڰ��Ա��Ϸ��� �ݾ� + �ܾ�)
			account.setBalance(balance + account.getBalance());
			System.out.println("���: ���ݵƽ��ϴ�.");
			
		}
		private static void withdraw() {
		
				System.out.println("-----");
				System.out.println("���");
				System.out.println("-----");
				
				System.out.println("���¹�ȣ");
				String ano = scanner.next();
				System.out.println("��ݾ�: ");
				int balance = scanner.nextInt();
				
				//���� ���¹�ȣ�� �ִ��� Ȯ��..
				Account account = findAccount(ano);	
				
				if(account == null) {
					System.out.println("���°� �����ϴ�.");
					 return;
				}
				//���� ������ �Ϸ��
				
				if(account.getBalance()<balance) {
					System.out.println("�ܾ��� �����մϴ�.");
				}else {
					
				account.setBalance( account.getBalance()-balance);
				System.out.println("���: ��ݵƽ��ϴ�.");			
		}	
			}
	/*Account��� ��ü�� ���ڴ�. ��ü������ return�� ���ְڴ�.
	 * ��ü�� ���� �� �մ¤� Account account = null; �����ְ�
	 * null�� �ƴ� ���� �ִ� �͵��̸� Ano�� �ּҰ� ������?�� ���ϰ� ���� ������
	 * account��ü�� �ּҸ� �Է����ִ� ����. �׸��� break�� ������ for�� ��������.
	 * �׷��� ���� account�� ��ȯ���ִ°���.
	 * */
		
		private static Account findAccount/*��ȯ��,Account��� ��ü���·� ��ȯ�� �ض�*/(String ano) {
				Account account = null;
//array�� ���̸�ŭ ����°�.
				for(int i = 0; i<accountArray.length; i++) {
					if (accountArray[i] == null) {
//null�� �ƴϸ� else�� ���ϴ�.
						break;
					}else {
//�� ���¹�ȣ�� ����ڰ� �Է��� ���¹�ȣ�� ������?
							if(ano.equals(accountArray[i].getAno())) {
//������ �� �迭�� ������(�ּ�)�� account�� �����ÿ�. 
								account = accountArray[i];
//�׸��� ��������
								break;
							}
				}			
			}	
				return account;
		}
}