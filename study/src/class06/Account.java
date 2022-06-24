package class06;

public class Account {
	
	private String ano;
	private String owner;
	private int balance;
	
	public Account (String ano, String owner, int balance) {
		//반드시 저 세개를 입력 받아야 해용ㅇ용
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	public String getAno()	{
		return ano;
	}
	public void setAno(String ano)	{
		this.ano =ano;
	}
	public String getOwner()	{
		return owner;
	}
	public void setOwner(String Owner)	{
		this.owner = owner;
	}
	
	//get과 set을 유의해서 ,...
	public int getBalance() {
		return  balance; //값을 받아서 instance에 값을 넣으시오..
	}
	public void setBalance(int balance)	{
		this.balance = balance;
	}
}
