import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import smartwarehousemanagementsystem.*;

import java.util.*;

class SmartWarehouseManagementSystemTest {

    private Storage<Electronics> electronicsStorage;
    private Storage<Groceries> groceriesStorage;
    private Storage<Furniture> furnitureStorage;

    @BeforeEach
    void setUp() {
        electronicsStorage = new Storage<>();
        groceriesStorage = new Storage<>();
        furnitureStorage = new Storage<>();

        electronicsStorage.addItem(new Electronics("Speaker", 2200.00));
        groceriesStorage.addItem(new Groceries("Papaya", 9.30));
        furnitureStorage.addItem(new Furniture("Table", 85));
    }

    @Test
    void testAddAndGetItem() {
        Electronics electronic = electronicsStorage.getItem(0);
        assertEquals("Speaker", electronic.getName());
        assertEquals(2200.00, electronic.getPrice());

        Groceries grocery = groceriesStorage.getItem(0);
        assertEquals("Papaya", grocery.getName());
        assertEquals(9.30, grocery.getPrice());

        Furniture furniture = furnitureStorage.getItem(0);
        assertEquals("Table", furniture.getName());
        assertEquals(85, furniture.getPrice());
    }

    @Test
    void testGetAllItems() {
        List<Electronics> electronicsList = electronicsStorage.getAllItems();
        assertFalse(electronicsList.isEmpty());
        assertEquals(1, electronicsList.size());

        List<Groceries> groceriesList = groceriesStorage.getAllItems();
        assertFalse(groceriesList.isEmpty());
        assertEquals(1, groceriesList.size());

        List<Furniture> furnitureList = furnitureStorage.getAllItems();
        assertFalse(furnitureList.isEmpty());
        assertEquals(1, furnitureList.size());
    }

    @Test
    void testDisplayItems() {
        assertDoesNotThrow(() -> WarehouseItemDisplay.displayItems(electronicsStorage.getAllItems()));
        assertDoesNotThrow(() -> WarehouseItemDisplay.displayItems(groceriesStorage.getAllItems()));
        assertDoesNotThrow(() -> WarehouseItemDisplay.displayItems(furnitureStorage.getAllItems()));

    }

    @Test
    void testAddMultipleItems() {
        electronicsStorage.addItem(new Electronics("Smartphone", 800.00));
        assertEquals(2, electronicsStorage.getAllItems().size());

        groceriesStorage.addItem(new Groceries("Bananas", 2.75));
        assertEquals(2, groceriesStorage.getAllItems().size());

        furnitureStorage.addItem(new Furniture("Table", 150.00));
        assertEquals(2, furnitureStorage.getAllItems().size());
    }
}
