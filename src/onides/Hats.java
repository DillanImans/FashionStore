package onides;

public class Hats extends FashionItem {

	Hats(String image, String name, int stockAmount, String description, int basePrice, String chosenType) {
		super(image, name, stockAmount, description, basePrice, chosenType);
	}

	// Calculate cost for user's type selection
	protected void calculateOptionCost() {
		if(getChosenType().equals("3d printed")) {
			addToTotalCost(0);
		} else if(getChosenType().equals("machine sewn")) {
			addToTotalCost(10);
		} else if(getChosenType().equals("handmade")) {
			addToTotalCost(30);
		}
	
	}
}
