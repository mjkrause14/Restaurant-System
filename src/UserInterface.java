import MealBuilder.EntreeBuilder;
import MealBuilder.*;
import Resteraunt.SystemInterface;

import java.util.*;

public class UserInterface {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        SystemInterface systemInterface = new SystemInterface();

        systemInterface.init();

        System.out.println("Would you like to View our services?: (y/n)");
        String choice = console.next();
        while(choice.toLowerCase().equals("y")) {

            int menu = menu(console);
            switch (menu) {
                case 1:
                    printMenu(systemInterface);
                    System.out.println("Would you like to view another service?: (y/n)");
                    choice = console.next();
                    break;
                case 2:
                    addOrder(console, systemInterface);
                    System.out.println("Would you like to view another service?: (y/n)");
                    choice = console.next();
                    break;
                case 3:
                    printTab(systemInterface);
                    System.out.println("Would you like to view another service?: (y/n)");
                    choice = console.next();
                    break;
                case 4:
                    printReport(systemInterface);
                    System.out.println("Would you like to view another service?: (y/n)");
                    choice = console.next();
                    break;
                default:
                    System.err.println("Invalid Option!");
                    System.out.println("Would you like to view another service?: (y/n)");
                    choice = console.next();
                    break;
            }
        }

    }

    public static int menu(Scanner console) {
        int option;
            System.out.println("What would you like to do?: ");
            System.out.println("________________________");
            System.out.println("1-Display Menu");
            System.out.println("2-Submit Order");
            System.out.println("3-Display Tab");
            System.out.println("4-Print Report");
            option = console.nextInt();
        return option;
    }

    public static void printMenu(SystemInterface systemInterface) {
        for (String lines : systemInterface.printMenu()) {
            System.out.println(lines);
            System.out.println(" ");
        }
    }

    public static void addOrder(Scanner console, SystemInterface systemInterface) {

        EntreeBuilder burger;
        EntreeBuilder sandwich;
        EntreeBuilder salad;

        System.out.println("How many orders?: ");
        int num = console.nextInt();
        int option;

        for (int x = 0; x < num; x++) {
            System.out.println("Please enter the order number: ");
            option = console.nextInt();
            for(String lines : systemInterface.addOrder(option)) {
                System.out.println(lines);
                System.out.println(" ");
            }

            switch(option) {
                case 14:
                    burger = burgerBuilder(console, systemInterface);
                    systemInterface.updateInv(burger);
                    break;
                case 16:
                    sandwich = sandwichBuilder(console, systemInterface);
                    systemInterface.updateInv(sandwich);
                    break;
                case 18:
                    salad = saladBuilder(console, systemInterface);
                    systemInterface.updateInv(salad);
                    break;
                default:
                    System.err.println("Invalid Option!");
                    break;
            }
        }
    }

    public static void printTab(SystemInterface systemInterface) {
        System.out.println("Your Bill: ");
        System.out.println("________________________");
        for (String lines : systemInterface.printTab()) {
            System.out.println(lines);
            System.out.println(" ");
        }
        System.out.println(systemInterface.calcTotal()[0]);
    }

    public static Burger burgerBuilder(Scanner console, SystemInterface systemInterface) {
        Director director = new Director();
        BurgerBuilder hamburger = new Hamburger();
        BurgerBuilder cheeseburger = new CheeseBurger();
        BurgerBuilder veggieburger = new VeggieBurger();
        Burger burger;
        int itemCode = 14;

        System.out.println("What type of burger?: ");
        System.out.println("1-Hamburger" + "\n" + "2-Cheeseburger" + "\n" + "3-Veggieburger");
        int choice = console.nextInt();

        switch(choice) {
            case 1:
                director.setBurgerBuilder(hamburger);
                director.createBurger();
                burger = director.getBurger();
                systemInterface.adaptMenu(burger, itemCode);
                return burger;
            case 2:
                director.setBurgerBuilder(cheeseburger);
                director.createBurger();
                burger = director.getBurger();
                systemInterface.adaptMenu(burger, itemCode);
                return burger;
            case 3:
                director.setBurgerBuilder(veggieburger);
                director.createBurger();
                burger = director.getBurger();
                systemInterface.adaptMenu(burger, itemCode);
                return burger;
            default:
                System.err.println("Invalid Option!");
                return burger = new Burger();
        }
    }

    public static Sandwich sandwichBuilder(Scanner console, SystemInterface systemInterface) {
        Director director = new Director();
        SandwichBuilder hamAndCheese = new HamAndCheese();
        SandwichBuilder turkeyClub = new TurkeyClub();
        Sandwich sandwich;
        int itemCode = 16;

        System.out.println("What type of sandwich?: ");
        System.out.println("1-Ham and Cheese" + "\n" + "2-Turkey Club");
        int choice = console.nextInt();

        switch(choice) {
            case 1:
                director.setSandwichBuilder(hamAndCheese);
                director.createSandwich();
                sandwich = director.getSandwich();
                systemInterface.adaptMenu(sandwich, itemCode);
                return sandwich;
            case 2:
                director.setSandwichBuilder(turkeyClub);
                director.createSandwich();
                sandwich = director.getSandwich();
                systemInterface.adaptMenu(sandwich, itemCode);
                return sandwich;
            default:
                System.err.println("Invalid Option!");
                return sandwich = new Sandwich();
        }
    }

    public static Salad saladBuilder(Scanner console, SystemInterface systemInterface) {
        Director director = new Director();
        SaladBuilder chickenSalad = new ChickenSalad();
        SaladBuilder veggieSalad = new VeggieSalad();
        Salad salad;
        int itemCode = 18;

        System.out.println("What type of salad?: ");
        System.out.println("1-Chicken Salad" + "\n" + "2-Veggie Salad");
        int choice = console.nextInt();

        switch(choice) {
            case 1:
                director.setSaladBuilder(chickenSalad);
                director.createSalad();
                salad = director.getSalad();
                systemInterface.adaptMenu(salad, itemCode);
                return salad;
            case 2:
                director.setSaladBuilder(veggieSalad);
                director.createSalad();
                salad = director.getSalad();
                systemInterface.adaptMenu(salad, itemCode);
                return salad;
            default:
                System.err.println("Invalid Option!");
                return salad = new Salad();
        }
    }

    public static void printReport(SystemInterface systemInterface) {
        System.out.printf("%20s", "Item | Quantity \n");
        System.out.printf("%20s", "_____________________ \n");
        for(String lines : systemInterface.invReport()) {
            System.out.printf("%20s", lines + "\n");
        }
    }
}
