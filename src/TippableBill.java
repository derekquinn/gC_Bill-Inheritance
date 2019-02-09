
public class TippableBill extends Bill {

	double tip;

	public TippableBill() {

	}

	public TippableBill(double tip, double subTotal, double taxRate) {
		this.tip = tip;
		this.subTotal = subTotal;
		this.taxRate = taxRate;

	}

	// add tip to total

	@Override
	public double calcTotal() {

		double total = subTotal * (1 + taxRate) + tip;

		return total;
	}

}
