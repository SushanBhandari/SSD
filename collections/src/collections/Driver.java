package collections;
public class Driver {
    public static void main(String[] args) {
        // Create an instance of NameManager
        NameManager manager = new NameManager();

        // Add names
        manager.addName("M.Mickleson");
        manager.addName("Johnua Taylor Biggs");
        manager.addName("P.Smith");
        manager.addName("Peter Jonathan Smythton");
        manager.addName("P.Thompson");

        // Print all names
        manager.printNames();

        // Remove long names
        manager.removeLongNames();

        // Print names after removing long names
        manager.printNames();
    }
    public static void main1(String[] args) {
    NumberSorter sorter= new NumberSorter();
    
    sorter.sort(new int[]{1, 9, 2, 3, 10, 8, 12, 1, 99, 2, 43, 68, 109, 0});
    sorter.sort(new int[]{1, 2, 3, 4});
    sorter.sort(new int[]{4, 3, 2, 1});
    }
}
