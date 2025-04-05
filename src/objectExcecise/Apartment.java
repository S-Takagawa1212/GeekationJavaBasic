package objectExcecise;

public class Apartment extends Property {
	private String floorPlan;

	public Apartment(String name, String ownerName, String type, Integer price, String floorPlan) {
		super(name, ownerName, type, price);
		this.floorPlan = floorPlan;
	}

	public String getFloorPlan() {
		return floorPlan;
	}

	public void setFloorPlan(String floorPlan) {
		this.floorPlan = floorPlan;
	}
	
	@Override
	 protected void printInfo() {
		super.printInfo();
		System.out.println("間取り：" + getFloorPlan());
		System.out.println("==============================");
	}
	
	
}
