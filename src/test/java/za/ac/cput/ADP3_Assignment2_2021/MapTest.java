package za.ac.cput.ADP3_Assignment2_2021;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MapTest {
@Test
    void testAdd(){
    Map map= new HashMap();
    map.put("Enock Jones","1");
    map.put("Asive Madladla", "2");
    assertEquals(2,map.size());
}
    @Test
    void testRemove(){
        Map map= new HashMap();
        map.put("Enock Jones","1");
        map.put("Asive Madladla", "2");

        map.remove("Enock Jones");
        assertEquals(1,  map.size());

    }
    @Test
    void testFind(){
        Map map= new HashMap();
        map.put("Asive Madladla", "2");

        if(map.containsKey("Asive Madladla")==true)
            System.out.println("Given list contains string 'Asive Madladla'");
        else if(map.containsValue("Sasan")==true)
            System.out.println("Given list contains string 'Susan' but not string 'Asive Madladla'");
        assertEquals(true,map.containsKey("Asive Madladla"));
    }


}