package Shopingmall;

public class clothes implements shopping {
	public void purchase() {
		System.out.println("Purchasing dresses from Zudio");
	}

	@Override
	public String toString() {
		return "Clothes []";
	}

}