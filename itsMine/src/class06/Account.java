package class06;

public class Account {
	
	private String ano;
	private String owner;
	private int balance;
	
	public Account (String ano, String owner, int balance) {
		//�ݵ�� �� ������ �Է� �޾ƾ� �ؿ뤷��
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
	
	//get�� set�� �����ؼ� ,...
	public int getBalance() {
		return  balance; //���� �޾Ƽ� instance�� ���� �����ÿ�..
	}
	public void setBalance(int balance)	{
		this.balance = balance;
	}
}
