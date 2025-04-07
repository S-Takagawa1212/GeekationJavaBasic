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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	
	protected void printInfo() {
		System.out.println("==============================");
		System.out.println("物件名：" + getName());
		System.out.println("物件所有者名：" + getOwnerName());
		System.out.println("物件種別：" + getType());
		System.out.println("物件価格：" + getPrice() + "円");
	}
	
}
