package za.ac.cput.ADP3_Assignment2_2021;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

import static org.junit.jupiter.api.Assertions.*;

class SetTest {
    @Test
    void testAdd() {

        Set set = new HashSet();
        set.add("Samual");
        set.add("Susan");
        set.add("Faith");
        assertEquals(3, set.size());

    }
    @Test
    void testRemove(){
        Set set = new HashSet();
        set.add("Susan");
        set.add("Faith");
        set.remove("Susan");
        assertEquals(1,set.size());


    }
    @Test
    void testFind(){
        Set set = new HashSet();

        set.add("Pet");

        if(set.contains("Pet")==true)
            System.out.println("Given list contains string 'Pet'");
        else if(set.contains("Sam")==true)
            System.out.println("Given list contains string 'Susan' but not string 'Pet'");
        Assertions.assertEquals(1,set.size());
    }


}