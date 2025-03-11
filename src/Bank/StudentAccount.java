package Bank;

public class StudentAccount extends SavingsAccount {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
String  institutionName;

public StudentAccount(String name, double balance ,String  institutionName) {
	super(name, balance, 20000);
	Number min_balance=100;
	this.institutionName = institutionName;
	// this.type="Student Account";
}



}
