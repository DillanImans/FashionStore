package onides;

public class Shirt extends FashionItem {

	Shirt(String image, String name, int stockAmount, String description, int basePrice, String chosenType) {
		super(image, name, stockAmount, description, basePrice, chosenType);
	}
	
	// Calculate cost for user's type selection
	protected void calculateOptionCost() {
		if(getChosenType().equals("polyester")) {
			addToTotalCost(0);
		} else if(getChosenType().equals("linen")) {
			addToTotalCost(15);
		} else if(getChosenType().equals("silk")) {
			addToTotalCost(30);
		}
		
	}
	
}
