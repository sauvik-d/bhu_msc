import java.util.*;
class InsufficientFundsException extends Exception{
	InsufficientFundsException(String str){
		super(str);
	}
}
class InvalidAmountException extends Exception{
	InvalidAmountException(String str){
		super(str);
	}
}
class AccountLockedException extends Exception{
	AccountLockedException(String str){
		super(str);
	}
}
public class Bank{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int depo = sc.nextInt();
		int withdraw = sc.nextInt();
		int mx = 10000;
		int min = 0;
		int balance = 5000;
		boolean lock = false;
		try{
			if(depo < 0 || withdraw < 0) throw new InvalidAmountException("Invalid");
			if(withdraw > balance) throw new InsufficientAmountException("Insufficient");
			System.out.println("Want to lock?");
			boolean l = sc.nextBoolean();
			lock = l;
			if(lock != false) throw new AccountLockedException("Locked");
		}
		catch(InsufficientFundsException e){
			System.out.println(e);
		}
		catch(InvalidAmountException e){
			System.out.println(e);
		}
		catch(AccountLockedException e){
			System.out.println(e);
		}
	}
}