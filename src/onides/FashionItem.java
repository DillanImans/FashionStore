package onides;

public class FashionItem {
	private String image;
	private String name;
	private int stockAmount;
	private String description;
	private int basePrice;
	private int totalCost;
	private String chosenType;
	
	FashionItem(String image, String name, int stockAmount,
		String description,	int basePrice, String chosenType){
		this.image = image;
		this.name = name;
		this.stockAmount = stockAmount;
		this.description = description;
		this.basePrice = basePrice;
		this.chosenType = chosenType;
	}
	
	// Get and Set for Image
	protected String getImage() {
		return image;
	}
	protected void setImage(String image) {
		this.image = image;
	}
	
	// Get and Set for Name
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	
	// Get and Set for Stock Amount
	protected int getStockAmount() {
		return stockAmount;
	}
	protected void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	
	// Get and Set for Description
	protected String getDescription() {
		return description;
	}
	protected void setDescription(String description) {
		this.description = description;
	}

	
	// Get and Set for BasePrice
	protected int getBasePrice() {
		return basePrice;
	}
	protected void setBasePrice(int basePrice) {
		this.basePrice = basePrice;
	}

	
	// Get and Set for Total Cost
	protected int getTotalCost() {
		return totalCost;
	}
	protected void addToTotalCost(int addedCost) {
		this.totalCost += addedCost;
	}
	protected void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}
	
	
	// Get and Set for Chosen Type
	protected String getChosenType() {
		return chosenType;
	}
	protected void setChosenType(String chosenType) {
		this.chosenType = chosenType;
	}
	
	
	// Calculate total cost (will be overriden because each class have their own "types")
	protected void calculateOptionCost() {
		
		// Add stuff depending on the types of their own class
		
	}
	
}
