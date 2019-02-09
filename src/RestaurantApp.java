
public class RestaurantApp extends Bill {

	public static void main(String[] args) {

		// create bill subtotal of $15.80 + TR 0.06 // should print $16.748

		Bill aBill = new Bill();

		aBill.subTotal = 15.80;
		aBill.taxRate = 0.06;

		// create a tippable bill object

		TippableBill aTippableBill = new TippableBill();

		aTippableBill.subTotal = 8.50;
		aTippableBill.taxRate = 0.06;
		aTippableBill.tip = 2.00;
		
		
		pay(aBill);

		pay(aTippableBill);

	}

	// static method
	public static void pay(Bill bill) {

		// bill = super.calcTotal();
		System.out.println("$" + bill.calcTotal());
		// System.out.println("$" + calcTotal());

	}

}
