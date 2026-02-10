package CoffeeShop;

import java.util.Scanner;

public class Espresso extends Drink {
    Scanner scanner = new Scanner(System.in);
    private int shot;

    public Espresso(String size) {
        super("Espresso",  35, size);
        this.shot = 0;
    }

    public void addShot(int shot) {
        System.out.print("How many shots for adding in Espresso: ");
        shot = scanner.nextInt();
    }

    @Override
    public double calculateFinalePrice() {
        return getBasePrice() + (shot * 15) + getSizeExtra();
    }

    public String toString() {
        if(shot != 0) {
            return super.toString() +
                    "\nAdded " + shot + " shot" +
                    "\nTotal price = " + calculateFinalePrice() + " Baht";
        }
        return super.toString() +
                "\nTotal price = " + calculateFinalePrice() + " Baht";
    }
}
