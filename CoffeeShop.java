package CoffeeShop;

import java.util.Scanner;

public class CoffeeShop {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Press 1 for ordering Espresso" +
                "\nPress 2 for ordering Frappuccino" +
                "\nEnter an option: ");
        int option = scanner.nextInt();

        if(option == 1) {

        }
        else {

        }
    }

    public Espresso orderEspresso() {
        System.out.print("Enter a size: ");
        String size = scanner.next();

        Espresso order1 = new Espresso(size);

        System.out.print("Press 'y' or 'Y' for adding a shot: ");
        String add_shot = scanner.next();

        if(add_shot.equalsIgnoreCase("y")){

        }
        return order1;
    }

    public Frappuccino orderFrappuccino() {
        System.out.print("Enter a size: ");
        String size = scanner.next();

        System.out.print("Do you would like to add whipped cream [y/Y]?: ");
        String add_whipped = scanner.next();

        Frappuccino order2 = new Frappuccino(size, true);
         if(add_whipped.equalsIgnoreCase("y")) {
             
         }
         return order2;
    }
}
