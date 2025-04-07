package objectExcecise;

public class Land extends Property{
	private Double area;
	
	public Land(String name, String ownerName, String type, Integer price, Double area) {
		super(name, ownerName, type, price);
		this.area = area;
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	@Override
	protected void printInfo() {
		super.printInfo();
		System.out.println("広さ：" + getArea() + "㎡");
		System.out.println("==============================");
	}
}
