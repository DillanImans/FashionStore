package onides;

public class Outerwear extends FashionItem {

	Outerwear(String image, String name, int stockAmount, String description, int basePrice, String chosenType) {
		super(image, name, stockAmount, description, basePrice, chosenType);
	}

	// Calculate cost for user's type selection
	protected void calculateOptionCost() {
		if(getChosenType().equals("pre-made")) {
			addToTotalCost(0);
		} else if(getChosenType().equals("junior tailored")) {
			addToTotalCost(20);
		} else if(getChosenType().equals("senior tailored")) {
			addToTotalCost(100);
		}
		
	}
}
