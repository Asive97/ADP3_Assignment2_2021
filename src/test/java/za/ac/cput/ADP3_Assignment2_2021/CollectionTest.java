package za.ac.cput.ADP3_Assignment2_2021;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class CollectionTest {
    @Test
    void testAdd() {
        Collection collection = new HashSet();

        collection.add("John");
        collection.add("Clint");
        collection.add("Brian");
        collection.add("Sofia");
        assertEquals(4, collection.size());
    }
    @Test
    void testRemove(){
        Collection collection = new HashSet();
        collection.add("Clint");
        collection.add("Brian");

        collection.remove("Clint");
        assertEquals(1, collection.size());

    }
    @Test
    void testFind(){
        Collection collection = new HashSet();
        collection.add("Clint");
        if(collection.contains("Clint")==true)
            System.out.println("Given list contains string 'Clint'");
        else if(collection.contains("Susan")==true)
            System.out.println("Given list contains string 'Susan' but not string 'Clint'");
        assertEquals(true,collection.contains("Clint"));
    }
}