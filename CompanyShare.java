package CDP;

import java.util.Date;

public class CompanyShare {

	private String name;
	private int share;
	private double price;
	public CompanyShare()
	{
		
	}
	public CompanyShare(String name, int share, double price) {
		super();
		this.name = name;
		this.share = share;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getShare() {
		return share;
	}
	public void setShare(int share) {
		this.share = share;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "CompanyShare [name=" + name + ", share=" + share + ", price=" + price + "]";
	}
	
}
