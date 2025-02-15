package junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

class ListManagerTest {

    private List<Integer> list;

    @BeforeEach
    void setUp() {
        list = new ArrayList<>();
    }

    @Test
    void testAddElement() {
        ListManager.addElement(list, 5);
        ListManager.addElement(list, 10);
        assertEquals(2, list.size());
        assertTrue(list.contains(5));
        assertTrue(list.contains(10));
    }

    @Test
    void testRemoveElement() {
        list.add(5);
        list.add(10);
        ListManager.removeElement(list, 5);
        assertEquals(1, list.size());
        assertFalse(list.contains(5));
    }

    @Test
    void testRemoveElement_NotInList() {
        list.add(5);
        ListManager.removeElement(list, 10);
        assertEquals(1, list.size());
    }

    @Test
    void testGetSize() {
        assertEquals(0, ListManager.getSize(list));
        list.add(5);
        assertEquals(1, ListManager.getSize(list));
        list.add(10);
        assertEquals(2, ListManager.getSize(list));
    }
    
}
