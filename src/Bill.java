
public class Bill {

	protected double subTotal;
	protected double taxRate;

// no argument constructor
	public Bill() {

	}

// two argument constructor
	public Bill(double subTotal, double taxRate) {
		this.subTotal = subTotal;
		this.taxRate = taxRate;
	}

// getter for subtotal
	public double getSubTotal() {

		return subTotal;
	}

// getter for taxrate
	public double taxRate() {
		return taxRate;
	}

// setter for subtotal
	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

// setter for taxrate 
	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}

// calc total returns total bill 
	public double calcTotal() {

		double totalBill = (subTotal * (1 + taxRate));

		return totalBill;

	}

}
