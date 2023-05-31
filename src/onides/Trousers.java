package onides;

public class Trousers extends FashionItem {

	Trousers(String image, String name, int stockAmount, String description, int basePrice, String chosenType) {
		super(image, name, stockAmount, description, basePrice, chosenType);
	}

	// Calculate cost for user's type selection
	protected void calculateOptionCost() {
		if(getChosenType().equals("cotton")) {
			addToTotalCost(0);
		} else if(getChosenType().equals("wool")) {
			addToTotalCost(20);
		} else if(getChosenType().equals("refined denim")) {
			addToTotalCost(40);
		}
		
	}
}
