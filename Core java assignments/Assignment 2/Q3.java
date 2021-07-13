package bankdeposit;

public class bank {

	public String name;
	public int Accnumber;
	public String Acctype;
	public int dmoney;
	public int fd_amount;
	public int cc_amount;
	public int banktotal;
	public bank(name, int accnumber, String acctype, int dmoney) {
		super();
		name = name;
		Accnumber = accnumber;
		Acctype = acctype;
		this.dmoney = dmoney;
	}
	public int getSavingstotal() {
		return fd_amount;
	}
	public void setSavingstotal(int deposit_money) {
		fd_amount=fd_amount+dmoney;
	}
	public int getCurrunttotal() {
		return cc_amount;
	}
	public void setCurrunttotal(int deposit_money) {
		cc_amount=cc_amount+dmoney;
	}
	public int getBank_total() {
		return bank_total;
	}
	public void setBank_total() {
		
	}
	public String get name() {
		return name;
	}
	public int getAccnumber() {
		return Accnumber;
	}
	public String getAcctype() {
		return Acctype;
	}
	public int getDmoney() {
		return dmoney;
	}
	
	
		
	}

    

package bankdeposit;


public class saving extends bank {

	public saving(String name, int accnumber, String acctype, int dmoney) {
		super(name, accnumber, acctype, dmoney);
		
	}
	public void setBank_total() {
		bank_total=(getCurrunttotal()+getSavingstotal());
	}
    
		
	}

package bankdeposit;


public class currunt extends bank {

	public currunt(String name, int accnumber, String acctype, int dmoney) {
		super(name, accnumber, acctype, dmoney);
		
	}
	public void setBank_total() {
		bank_total=(getCurrunttotal()+getSavingstotal());
	}
	

}


public class test1 {

	public static void main(String[] args) {

      saving fixed_deposit=new saving("rey",1234,"savings",220000);
      currunt cash_credit =new currunt("blake",5678,"currunt",480000);
      
      
      System.out.println("The amount paid as a fixed deposit in "+fixed_deposit.Acctype +" account is "+fixed_deposit.deposit_money);
      
      System.out.println("The amount paid as a cash credit in "+cash_credit.Acctype +" account is "+cash_credit.deposit_money);
      
      System.out.println("The total amount in the bank is "+ (fixed_deposit.deposit_money + cash_credit.deposit_money));
	}

}
