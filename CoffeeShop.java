package CoffeeShop;

import java.util.Scanner;

public class CoffeeShop {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num_of_espresso = 0;
        int num_of_frappuccino = 0;
        double total_price = 0;

        while(true) {
            System.out.print("Press 1 for ordering Espresso" +
                    "\nPress 2 for ordering Frappuccino" +
                    "\nEnter an option: ");
            int option = scanner.nextInt();

            if (option == 1) {
                Espresso espresso = orderEspresso();
                num_of_espresso++;
                total_price += espresso.calculateFinalePrice();
            }
            else if (option == 2) {
                Frappuccino frappuccino = orderFrappuccino();
                num_of_frappuccino++;
                total_price += frappuccino.calculateFinalePrice();
            }

            System.out.print("\nDo you want to order more [y/Y]? ");
            String order_more = scanner.next();
            
            if (!order_more.equalsIgnoreCase("y")) {
                System.out.println();
                break;
            }
        }

        System.out.println("You ordered " + num_of_espresso + " Espresso");
        System.out.println("You ordered " + num_of_frappuccino + " Frappuccino");
        System.out.println("Total price = " + total_price);
    }

    public static Espresso orderEspresso() {
        System.out.print("Enter a size: ");
        String size = scanner.next();

        Espresso espresso = new Espresso(size);

        System.out.print("Press 'y' or 'Y' for adding a shot: ");
        String is_addShot = scanner.next();
        
        if (is_addShot.equalsIgnoreCase("Y")){
            System.out.print("How many shots for adding in Espresso: ");
            int add_shot = scanner.nextByte();
            espresso.addShot(add_shot);
        }
        
        System.out.println("Your order: Espresso (Size: " + size.toUpperCase() + ")");
        System.out.println("Total Price = " + espresso.calculateFinalePrice() + " Baht");

        return espresso;
    }

    public static Frappuccino orderFrappuccino() {
        System.out.print("Enter a size: ");
        String size = scanner.next();
        System.out.print("Do you would like to add whipped cream [y/Y]? ");
        String whipped = scanner.next();
        
        boolean add_whipped = whipped.equalsIgnoreCase("y") ? true : false;

        Frappuccino frappuccino = new Frappuccino(size, add_whipped);

        System.out.println("Your order: Frappuccino (Size: " + size.toUpperCase() + ")");
        System.out.println("Total Price = " + frappuccino.calculateFinalePrice() + " Baht");

        return frappuccino;
    }
}
