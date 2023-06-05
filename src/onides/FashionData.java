package onides;

import java.util.ArrayList;

public class FashionData {
    public static ArrayList<Shirt> shirtArr = new ArrayList<>();
    public static ArrayList<Trousers> trouserArr = new ArrayList<>();
    public static ArrayList<Outerwear> outerwearArr = new ArrayList<>();
    public static ArrayList<Hats> hatArr = new ArrayList<>();

    static {
        // Filling Shirt Arr
        shirtArr.add(new Shirt("image", "White Basque", 20, "A crisp and versatile white shirt, exuding timeless charm and a sense of effortless sophistication.",
                15, "polyester"));
        shirtArr.add(new Shirt("image", "Blue Maple", 7, "A timeless classic, this blue shirt effortlessly combines sophistication"
                + " with a touch of casual elegance.", 30, "polyester"));
        shirtArr.add(new Shirt("image", "Maroon Elix", 5, "A rich and regal maroon shirt that commands attention, blending elegance with a touch of boldness.",
                30, "polyester"));
        shirtArr.add(new Shirt("image", "Polymorphic Fling", 1, "A vibrant and stylish shirt featuring a mesmerizing fusion of bold colors and intricate patterns."
                , 100, "polyester"));

        // Filling Trouser Arr
        trouserArr.add(new Trousers("image", "Casual Black", 14, "Comfort meets versatility in these simple black pants, perfect for casual outings or athletic activities.",
                30, "cotton"));
        trouserArr.add(new Trousers("image", "Gray Grid", 4, "Elevate your style with these sleek and sophisticated gray pants, blending timeless elegance with a modern twist.",
                50, "cotton"));
        trouserArr.add(new Trousers("image", "Luxurious Golden Shay", 0, "Dazzle with opulence in these luxurious golden pants, exuding a glamorous and radiant allure that steals the spotlight.",
                200, "cotton"));
        trouserArr.add(new Trousers("image", "Blue Floo", 2, "Unleash your bold sense of style with our striking blue trousers, crafted with intricate details and a touch of contemporary flair to make a standout fashion statement.",
                100, "cotton"));

        // Filling Outerwear Arr
        outerwearArr.add(new Outerwear("image", "Blending Puffer Jacket", 4, "Embrace warmth and style with this cozy puffer jacket, designed to keep you snug while effortlessly enhancing your winter wardrobe.",
                60, "pre-made"));
        outerwearArr.add(new Outerwear("image", "Biker Leather Jacket", 2, "Unleash your inner rebel with this edgy biker leather jacket, exuding an aura of confidence and timeless cool.",
                100, "pre-made"));
        outerwearArr.add(new Outerwear("image", "Trench Coat", 1, "Step out in classic elegance with this sophisticated trench coat, a versatile and timeless staple that exudes refinement and style.",
                400, "pre-made"));
        outerwearArr.add(new Outerwear("image", "Quilted Vest", 0, "Stay stylish and cozy with our quilted vest, featuring a perfect blend of warmth, comfort, and fashion-forward design.",
                150, "pre-made"));

        // Filling Hat Arr
        hatArr.add(new Hats("image", "Baseball cap", 5, "Top off your casual look with this sporty baseball cap, combining comfort and style for a laid-back yet fashionable statement.",
                30, "pre-made"));
        hatArr.add(new Hats("image", "Fedora", 2, "Channel your individuality with this uniquely crafted fedora, blending vintage allure with contemporary flair to create a head-turning statement piece.",
                30, "pre-made"));
        hatArr.add(new Hats("image", "Flat cap", 10, "Add a touch of refined flair to your outfit with this distinguished flat cap, a perfect fusion of timeless style and contemporary panache.",
                30, "pre-made"));
        hatArr.add(new Hats("image", "The Bautta", 0, "Exude mystery and intrigue with the iconic Bautta mask, an ancient Venetian symbol of elegance and anonymity.",
                300, "pre-made"));
    }
}
