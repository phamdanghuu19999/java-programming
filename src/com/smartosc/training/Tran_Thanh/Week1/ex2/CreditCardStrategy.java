package Week1.ex2;

public class CreditCardStrategy implements PaymentStrategy{
	private String name;
	private String cardNumber;
	private String cvv;
	private String dateOfExpiry;
	
	public CreditCardStrategy(String name, String cardNumber, String cvv, String dateOfExpiry) {
		this.name = name;
		this.cardNumber = cardNumber;
		this.cvv =cvv;
		this.dateOfExpiry = dateOfExpiry;
	}
	
	@Override
	public void pay(int money) {
		// TODO Auto-generated method stub
		money = money;
	}
}
