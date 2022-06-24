package class06;

import java.util.Scanner;

public class BankApplication {
	
	//맨 먼저 메인이 올라오는곳에 클래스가 올라옵니다...

	
		private static final Account[] accountArray = new Account[100];
		private static Scanner scanner = new Scanner(System.in);
		
		public static void main(String[] args) {
			boolean run = true;
			while(run) {
				System.out.println("-------------------------------------");
				System.out.println("1.계좌생성 | 2.계좌목록|3.예금|4.출금|5.종료");
				System.out.println("-------------------------------------");
			System.out.println("선택> ");
			
			
			int selectNo = scanner.nextInt();
			
			if(selectNo ==1) {
				createAccount(); //메소드를 호출... 메소드 호출한 곳으로 갑니다.... createAccount로...
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
		System.out.println("프로그램 종료.");
		
		}
		private static void createAccount() {
			System.out.println("-----");
			System.out.println("계좌생성");
			System.out.println("-----");
			System.out.println("계좌번호");
			String ano = scanner.next(); //받아서 ano에 저장...
			System.out.println("계좌주");
			String owner = scanner.next(); //얘듀
			System.out.println("초기 입금액: ");
			int balance = scanner.nextInt()	; //얘두.
			
			Account account = new Account(ano,owner,balance); 
			
//Account라는 계좌를 생성할게용...객체를 생성할게용 Account로 가용
// 첫사람이 계좌룰 생성하면 맨 위로 올라가서 0..1..2.. 이렇게 100까지 갈 수 있음. 
//첫번재 사람은 accountArray[0] 객체가 생기고... {객체맞는지는 머름;}
//그리고 배열에 인덱스 번호 0을 i에 넣는겨... 근데 0번에 null이 들어있어. 왜냐묜 초기값이 null이야.
// 저기 accountArray는 인스턴스 변순데 static이 붙어서 class변수가 됨. 내가 값을 안 넣으면 자동으로 초기값이 들어가.
// Account객체는 참조형임. 0에도 1에도 2에도 다 null(비어있음)임. 객체가 없어서 주소가 없는게 100개가 생성됨.
//밑에 scanner도 클래스 변수임. 스캐너도 null이 들어있음. 
			
			for (int i = 0; i<accountArray.length; i++) {
				if(accountArray[i] == null ) { 
					// null이면! account를 생성하는겨. 아하
					accountArray[i] = account;
			System.out.println("결과: 계좌가 생성되었습니다.");
			break; //for 반복문을 빠져나오거라...
				}
			}	
/* [0] = 1000
 * [2] = 2000
 * [3] = 3000
 * ...
 * [99] =4000
 * [100]= null
 * 이런식이니까 null들어있는 애들은 for반복문 나가고, 값이 있는 애만 account 생성하는거지.
 * 객체 하나당 한사람... 단 한사람... 내가 사랑한 그 사람... */
			
			}
		
/*ㄱㅖ좌목록은 accountArray의 인덱스 번호 [0]번부터 돕니다~
[0] = 100 라는 번지가 들어있고
sysout의 출력문들이 나오고...
[1] = 200라는 번지가 들어있고
sysout의 출력문들이 나오고...
[2] = 300이라는 번지가 들어있고
sysout의 출력문들이 나오고...
[3] = null 이묜.. break맞아서 이 for문을 빠져나갑니다!

결국 Array.length 만큼 값의 목록들이 출력됩니다.
*/
		private static void accountList() {
			System.out.println("-----");
			System.out.println("계좌목록");
			System.out.println("-----");
			for (int i = 0; i<accountArray.length; i++) {
				if (accountArray[i] == null) {	//이게 먼말이여
					break;
				}
				System.out.println(accountArray[i].getAno() + "\t" + accountArray[i].getOwner() + "\t" + accountArray[i].getBalance());
			}			
		}	
/*계좌가 생성되어 있어야만 출력할 수 있어용.
 
 *
 */
		private static void deposit() {
				System.out.println("-----");
				System.out.println("예금");
				System.out.println("-----");
				
				System.out.println("계좌번호");
				String ano = scanner.next();
				System.out.println("입금액: ");
				int balance = scanner.nextInt();
//메소드 findAccount를 만들어서 ano가 있는지 확인하시오라는 뜻 ㅋ
//밑으로 내려가서 보거라ㅣ.
			Account account = findAccount(ano);	
			
			if(account == null) {
// 값이 없으면 계좌 없다고 출력해주고
				System.out.println("계좌가 없습니다.");
				 return;
			}
//존재하는 계좌면 값을 더해주고 저장해주기..(사용자가입금하려는 금액 + 잔액)
			account.setBalance(balance + account.getBalance());
			System.out.println("결과: 예금됐습니다.");
			
		}
		private static void withdraw() {
		
				System.out.println("-----");
				System.out.println("출금");
				System.out.println("-----");
				
				System.out.println("계좌번호");
				String ano = scanner.next();
				System.out.println("출금액: ");
				int balance = scanner.nextInt();
				
				//먼저 계좌번호가 있는지 확인..
				Account account = findAccount(ano);	
				
				if(account == null) {
					System.out.println("계좌가 없습니다.");
					 return;
				}
				//계좌 있으면 일루왕
				
				if(account.getBalance()<balance) {
					System.out.println("잔액이 부족합니다.");
				}else {
					
				account.setBalance( account.getBalance()-balance);
				System.out.println("결과: 출금됐습니다.");			
		}	
			}
	/*Account라는 객체를 갖겠다. 객체형으로 return을 해주겠다.
	 * 객체를 넣을 수 잇는ㄴ Account account = null; 말해주고
	 * null이 아닌 값이 있는 것들이면 Ano와 주소가 같은가?를 비교하고 값이 같으면
	 * account객체에 주소를 입력해주는 것임. 그리고 break로 계좌의 for문 빠져나옴.
	 * 그러고 나서 account를 반환해주는거임.
	 * */
		
		private static Account findAccount/*반환형,Account라는 객체형태로 반환을 해라*/(String ano) {
				Account account = null;
//array의 길이만큼 돌라는겨.
				for(int i = 0; i<accountArray.length; i++) {
					if (accountArray[i] == null) {
//null이 아니면 else로 갑니다.
						break;
					}else {
//이 계좌번호와 사용자가 입력한 계좌번호가 같은가?
							if(ano.equals(accountArray[i].getAno())) {
//같으면 그 배열의 번지수(주소)를 account에 넣으시오. 
								account = accountArray[i];
//그리고 빠져나왕
								break;
							}
				}			
			}	
				return account;
		}
}