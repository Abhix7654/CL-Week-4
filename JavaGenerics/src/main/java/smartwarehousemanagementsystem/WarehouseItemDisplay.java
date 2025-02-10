package smartwarehousemanagementsystem;
import  java.util.*;

public class WarehouseItemDisplay {
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item);
        }
    }
}