package OOP;

public class IncoiceItem {
	private String id;
	private String desc;
	private int qty;
	private double unitPrice;
	public IncoiceItem(String id, String desc, int qty, double unitPrice) {
		this.id = id;
		this.desc = desc;
		this.qty = qty;
		this.unitPrice = unitPrice;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getId() {
		return id;
	}
	public String getDesc() {
		return desc;
	}
	public double getTotal() {
		return this.unitPrice * this.qty;
	}
	@Override
	public String toString() {
		return "IncoiceItem [id=" + id + ", desc=" + desc + ", qty=" + qty + ", unitPrice=" + unitPrice + "]";
	}
	
}
