package CoffeeShop;

public abstract class Drink implements Priceable{
    private String drinkName;
    private double basePrice;
    private String size;

    public Drink(String drinkName, double basePrice, String size) {
        this.drinkName = drinkName;
        this.basePrice = basePrice;
        this.size = size;
    }

    public String getDrinkName() {
        return this.drinkName;
    }

    public abstract double calculateFinalePrice();

    @Override
    public double getBasePrice() {
        return this.basePrice;
    }

    @Override
    public double getSizeExtra() {
        if(size.equalsIgnoreCase("s")) {
            return 0;
        }
        else if(size.equalsIgnoreCase("m")) {
            return 10;
        }
        else if(size.equalsIgnoreCase("l")){
            return 15;
        }
        return -1;
    }

    public String toString() {
        return "Your order: " + drinkName + " (Size: " + size + ")";
    }
}
