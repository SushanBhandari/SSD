package exe_lab;

public class Menu {
	/**
     * Displays the selected menu option.
     *
     * @param opt the menu option to display
     * @throws InvalidOptionException if the provided option is outside the accepted range
     */
    public void displayMenuOption(int opt) throws InvalidOptionException {
        if (opt >= 1 && opt <= 3) {
            System.out.println("Menu option " + opt + " selected");
        } else {
            throw new InvalidOptionException("Invalid menu option: " + opt);
        }
    }
}
}
