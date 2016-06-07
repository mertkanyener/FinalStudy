
public class ATM {
	
	private double balance;
	
	public ATM(double balance){
		this.balance = balance;
	}
	
	public void getMoney(double money){
		if(money >= balance){
			System.out.println("You are able to get "+ money + "$");
			balance = balance - money;
		}
		else{
			System.out.println("The maximum amount of money you can get is: " + balance + "$");
			System.out.println("Please enter a valid amount");
		}
	}
	

}
