package test2;

class Buyer{
	private int mymoney;
	private int applecnt;
	public void Payment(Seller seller, int money) {
		mymoney -= money;
		int cnt = seller.Receive(money);
		applecnt += cnt;
	}
	public void ShowInfo() {
		System.out.println("=== buyer info ===");
		System.out.println("money: " + mymoney);
		System.out.println("apple: " + applecnt);
	}
	
	public Buyer(int mymoney, int applecnt) {
		this.mymoney = mymoney;
		this.applecnt = applecnt;
	}
}

class Seller{
	private int mymoney;
	private int applecnt;
	public int price;

	public int Receive(int money) {
		mymoney += money;
		int revcnt = money/price;
		applecnt -= revcnt;
		return revcnt;
	}
	
	public void ShowInfo() {
		System.out.println("=== seller info ===");
		System.out.println("money: " + mymoney);
		System.out.println("apple: " + applecnt);
		System.out.println("price: " + price);
	}
	
	public Seller(int mymoney, int applecnt, int price) {
		this.mymoney = mymoney;
		this.applecnt = applecnt;
		this.price = price;
	}

}

public class Main {
	public static void main (String[] args) {
		Seller seller = new Seller(100000, 100, 1000);
		Buyer buyer1 = new Buyer(10000, 0);
		Buyer buyer2 = new Buyer(20000, 0);
		Buyer buyer3 = new Buyer(30000, 0);
		buyer1.Payment(seller, 2000);
		buyer2.Payment(seller, 5000);
		buyer3.Payment(seller, 3000);
		seller.ShowInfo();
		buyer1.ShowInfo();
		buyer2.ShowInfo();
		buyer3.ShowInfo();
		
		
		
		
	}
}