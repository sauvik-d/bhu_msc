import java.util.*;
interface PaymentMethod{
	void pay(double amount);
}
class CreditCardPayment implements PaymentMethod{
	public void pay(double amount){
		System.out.println(amount);
	}
}
class PayPalPayment implements PaymentMethod{
	public void pay(double amount){
		System.out.println(amount);
	}
}
class OnlineStore{
	PaymentMethod pm;
	OnlineStore(PaymentMethod pm){
		this.pm = pm;
	}
	public void processPayment(double amount){
		pm.pay(amount);
	}
}
class prob9{
	public static void main(String[] args){
		OnlineStore obj = new OnlineStore(new CreditCardPayment());
		obj.processPayment(100);

		obj = new OnlineStore(new CreditCardPayment());
		obj.processPayment(2500);
	}
}