package exe_lab;

public class Driver {
	public static void main(String[] args) {
        Menu menu = new Menu();

        // Testing valid options
        try {
            menu.displayMenuOption(1);
            menu.displayMenuOption(2);
            menu.displayMenuOption(3);
        } catch (InvalidOptionException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }

        // Testing invalid options
        try {
            menu.displayMenuOption(0);
        } catch (InvalidOptionException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }

        try {
            menu.displayMenuOption(4);
        } catch (InvalidOptionException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }

}
