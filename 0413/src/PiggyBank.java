
public class PiggyBank {
	// �Ӽ�
	// ĸ��ȭ (���� ����)
    private int money;
    //���� ������  (public, protected, default, private)
    //public : ��𼭵� ���ٰ���
    //protected : ���� ��Ű��, ��Ӱ��迡 ������ ���� ����
    //default : ���� ��Ű���� ������ ���� ����(���������ڸ� �Ⱦ��� default);
    //private : ���� ��ü������ ���� ����
	
	// ���
    public void deposit(int money) {
		this.money =this.money+money;
		//money +=m;
	}    
	
	
	public void withdraw(int num) {
		money-=num;
		
	}
	
	public int showMoney() {
		return money;		
	}

}
