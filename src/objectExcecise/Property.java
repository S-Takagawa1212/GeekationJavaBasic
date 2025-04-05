package objectExcecise;

public class Property {
	protected String name;
	protected String ownerName;
	protected String type;
	protected Integer price;
	
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
}
