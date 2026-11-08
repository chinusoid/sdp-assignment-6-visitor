import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Equipment> equipment = Arrays.asList(
            new Telescope("Moon telescope"),
            new StarProjector("Indoor star projector"),
            new Telescope("Planet telescope")
        );

        int days = 2;
        RentalCostVisitor rentalCost = new RentalCostVisitor(days);
        PackingListVisitor packingList = new PackingListVisitor();
        InventoryVisitor inventory = new InventoryVisitor();

        System.out.println("Packing list:");
        for (Equipment item : equipment) {
            item.accept(packingList);
            item.accept(rentalCost);
            item.accept(inventory);
        }

        System.out.println("Rental for " + days + " days: " + rentalCost.getTotal() + " KZT");
        System.out.println("Telescopes: " + inventory.getTelescopeCount());
        System.out.println("Star projectors: " + inventory.getProjectorCount());
    }
}
