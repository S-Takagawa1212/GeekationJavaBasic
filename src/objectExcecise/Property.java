package objectExcecise;

public class Property {
	private String name;
	private String ownerName;
	private String type;
	private Integer price;
	
	public Property(String name, String ownerName, String type, Integer price) {
		super();
		this.name = name;
		this.ownerName = ownerName;
		this.type = type;
		this.price = price;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected String getOwnerName() {
		return ownerName;
	}

	protected void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	protected String getType() {
		return type;
	}

	protected void setType(String type) {
		this.type = type;
	}

	protected Integer getPrice() {
		return price;
	}

	protected void setPrice(Integer price) {
		this.price = price;
	}
	
	protected void printInfo() {
		System.out.println("==============================");
		System.out.println("物件名：" + getName());
		System.out.println("物件所有者名：" + getOwnerName());
		System.out.println("物件種別" + getType());
		System.out.println("物件価格" + getPrice() + "円");
		System.out.println("==============================");
	}
	
}
