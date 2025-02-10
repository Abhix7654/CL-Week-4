package smartwarehousemanagementsystem;

public class SmartWarehouseManagementSystem {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        electronicsStorage.addItem(new Electronics("Speaker", 2200.00));
        groceriesStorage.addItem(new Groceries("Papaya", 9.30));
        furnitureStorage.addItem(new Furniture("Table", 85));

        System.out.println("\nElectronics");
        WarehouseItemDisplay.displayItems(electronicsStorage.getAllItems());


        System.out.println("\nGroceries");
        WarehouseItemDisplay.displayItems(groceriesStorage.getAllItems());

        System.out.println("\nFurniture");
        WarehouseItemDisplay.displayItems(furnitureStorage.getAllItems());



    }
}

